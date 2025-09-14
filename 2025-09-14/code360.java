class Node<T> {
	T data;
	Node<T> next, prev;

	public Node(T data) {
		this.data = data;
	}
}

public class code360 {

	// Problem of the Day (Easy)
	static Node insert(int k, int val, Node head) {
		// Write your code here.
		Node<Integer> newNode = new Node<>(val);
		if (k == 0) {
			newNode.next = head;
			if (head != null) {
				head.prev = newNode;
			}
			return newNode;
		}
		Node<Integer> curr = head;
		int idx = 0;
		while (idx < k - 1 && curr != null) {
			curr = curr.next;
			idx++;
		}
		if (curr.next == null) {
			curr.next = newNode;
			newNode.prev = curr;
			return head;
		}
		Node<Integer> next = curr.next;
		curr.next = newNode;
		newNode.prev = curr;
		newNode.next = next;
		next.prev = newNode;
		return head;
	}
}