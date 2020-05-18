#include <stdio.h>
#include <stdlib.h>

struct node *insert(struct node *, int);
struct node *createNode(int);
void inOrder(struct node *);
void preOrder(struct node *);
void postOrder(struct node *);
void freeTree(struct node *);

struct node
{
	int data;
	struct node *left;
	struct node *right;
};

int main()
{
	int n, treeSize, tmp, i, j;
	scanf("%d", &n);
	for (i = 0; i < n; i++)
	{
		scanf("%d", &treeSize);
		struct node *root = NULL;
		for (j = 0; j < treeSize; j++)
		{
			scanf("%d", &tmp);
			root = insert(root, tmp);
		}
		printf("Case %d:\n", i + 1);
		printf("Pre.:");
		preOrder(root);
		printf("\n");
		printf("In..:");
		inOrder(root);
		printf("\n");
		printf("Post:");
		postOrder(root);
		printf("\n");
		printf("\n");
		freeTree(root);
	}
}

void freeTree(struct node *root)
{
	struct node *ptTmp = root;

	if (ptTmp->left != NULL)
	{
		freeTree(ptTmp->left);
	}
	if (ptTmp->right != NULL)
	{
		freeTree(ptTmp->right);
	}
	free(ptTmp);
}

void inOrder(struct node *root)
{
	if (root != NULL)
	{
		inOrder(root->left);
		printf(" %d", root->data);
		inOrder(root->right);
	}
}

void preOrder(struct node *root)
{
	if (root != NULL)
	{
		printf(" %d", root->data);
		preOrder(root->left);
		preOrder(root->right);
	}
}

void postOrder(struct node *root)
{
	if (root != NULL)
	{
		postOrder(root->left);
		postOrder(root->right);
		printf(" %d", root->data);
	}
}

struct node *insert(struct node *root, int value)
{
	if (root == NULL)
	{
		return createNode(value);
	}
	if (value > root->data)
	{
		root->right = insert(root->right, value);
	}
	else if (value < root->data)
	{
		root->left = insert(root->left, value);
	}
	return root;
}

struct node *createNode(int value)
{
	struct node *tmp;
	tmp = (struct node *)malloc(sizeof(struct node));
	tmp->data = value;
	tmp->right = NULL;
	tmp->left = NULL;
	return tmp;
}
