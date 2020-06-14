#include <stdio.h>
#include <stdlib.h>

struct node
{
  char letter;
  struct node *right;
  struct node *left;
};

int findCharIndex(char *, int, int, char);
struct node *makeTree(char *, char *, int, int);
struct node *createNode(char letter);
void show(struct node *);
void showPostOrder(struct node *);
void freeTree(struct node *);

short CURRENT_INDEX;

int main()
{
  short numberOfCases, numberOfNodes, i;
  struct node *root;
  scanf("%hu", &numberOfCases);

  while (numberOfCases > 0)
  {
    char *pre, *in = NULL;
    scanf("%hu", &numberOfNodes);
    in = (char *)malloc((numberOfNodes + 1) * sizeof(char));
    pre = (char *)malloc((numberOfNodes + 1) * sizeof(char));
    scanf("%s %s", pre, in);

    CURRENT_INDEX = 0;

    root = makeTree(in, pre, 0, numberOfNodes - 1);
    showPostOrder(root);
    freeTree(root);
    free(pre);
    free(in);
    in = pre = NULL;
    printf("\n");
    numberOfCases--;
  }
  return 0;
}

struct node *makeTree(char *in, char *pre, int inStart, int inEnd)
{
  int inIndex;
  if (inStart > inEnd)
    return NULL;
  struct node *nextNode = createNode(pre[CURRENT_INDEX++]);
  if (inStart == inEnd)
    return nextNode;

  inIndex = findCharIndex(in, inStart, inEnd, nextNode->letter);
  nextNode->left = makeTree(in, pre, inStart, inIndex - 1);
  nextNode->right = makeTree(in, pre, inIndex + 1, inEnd);

  return nextNode;
}

struct node *createNode(char letter)
{
  struct node *tmp;
  tmp = (struct node *)malloc(sizeof(struct node));
  tmp->letter = letter;
  tmp->left = tmp->right = NULL;
  return tmp;
}

int findCharIndex(char *str, int start, int end, char letter)
{
  short i;
  for (i = start; i <= end; ++i)
    if (str[i] == letter)
      return i;

  return -1;
}

void showPostOrder(struct node *tmpNode)
{
  if (tmpNode == NULL)
    return;

  showPostOrder(tmpNode->left);
  showPostOrder(tmpNode->right);
  printf("%c", tmpNode->letter);
}

void freeTree(struct node *root)
{
  struct node *tmpNode = root;

  if (tmpNode->left != NULL)
  {
    freeTree(tmpNode->left);
  }
  if (tmpNode->right != NULL)
  {
    freeTree(tmpNode->right);
  }
  free(tmpNode);
}