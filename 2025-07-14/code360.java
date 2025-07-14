public class code360 {

	// Problem of the Day (Easy)
	class Node {
		public int value;
		public Node next;

		Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

	public static Node oddEvenLinkedList(Node head) {
		// Write your code here.
		if (head == null || head.next == null) {
			return head;
		}
		Node odd = head;
		Node even = head.next;
		Node evenHead = even;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}
}