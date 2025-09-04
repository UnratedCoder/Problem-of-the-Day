public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    public Node reverseKGroup(Node head, int k) {
        // code here
        if (head == null) {
            return head;
        }
        Node curr = head;
        Node newNode = null;
        Node tail = null;
        while (curr != null) {
            Node group = curr;
            Node prev = null;
            Node next = null;
            int count = 0;
            while (curr != null && count < k) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            if (newNode == null) {
                newNode = prev;
            }
            if (tail != null) {
                tail.next = prev;
            }
            tail = group;
        }
        return newNode;
    }
}