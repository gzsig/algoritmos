public class Tree {
  public static void main(String[] args) {
    int[] x = { 5, 3, 12, 0, 96, 78, 2, 69, 4 };
    Node root = null;
    for (int i : x) {
      root = insert(root, i);
    }
    preOrder(root);
    System.out.println();
    inOrder(root);
    System.out.println();
    postOrder(root);
    System.out.println();
  }

  private static void postOrder(Node root) {
    if (root != null) {
      postOrder(root.leftNode);
      postOrder(root.rightNode);
      System.out.print(root.data + " ");
    }
  }

  private static void inOrder(Node root) {
    if (root != null) {
      inOrder(root.leftNode);
      System.out.print(root.data + " ");
      inOrder(root.rightNode);
    }
  }

  private static void preOrder(Node root) {
    if (root != null) {
      System.out.print(root.data + " ");
      preOrder(root.leftNode);
      preOrder(root.rightNode);
    }
  }

  private static Node insert(Node root, int i) {
    if (root == null) {
      return new Node(i);
    }
    if (i > root.data) {
      root.rightNode = insert(root.rightNode, i);
    } else if (i < root.data) {
      root.leftNode = insert(root.leftNode, i);
    }
    return root;
  }

}

class Node {

  int data;
  Node rightNode, leftNode;

  public Node(int i) {
    data = i;
  }
}