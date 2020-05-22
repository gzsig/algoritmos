
//E --> element, T --> type, K --> key

public class Node<T> {
	T data;
	Node<T> left, right;

	public Node(T data) {
		this.data = data;
	}
}
