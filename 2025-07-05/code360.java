public class code360 {

	// Problem of the Day (Easy)
	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
			left = right = null;
		}

	}

	public static void merge(Node head1, Node head2) {
		Node first = head1, second = head2;
		Node f_next = null, s_next = null;
		// Solving for each node in Linkedlist.
		while (first != null) {
			f_next = first.next;
			s_next = second.next;
			second.next = f_next;
			first.next = second;
			first = f_next;
			second = s_next;
		}
	}
}