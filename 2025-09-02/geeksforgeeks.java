public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public Node swapKth(Node head, int k) {
        // code here
        if (head == null) {
            return head;
        }
        int n = 0;
        Node temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        if (k > n) {
            return head;
        }
        if (2 * k - 1 == n) {
            return head;
        }
        Node prevX = null;
        Node x = head;
        for (int i = 1; i < k; i++) {
            prevX = x;
            x = x.next;
        }
        Node prevY = null;
        Node y = head;
        for (int i = 1; i < n - k + 1; i++) {
            prevY = y;
            y = y.next;
        }
        if (prevX != null) {
            prevX.next = y;
        }
        if (prevY != null) {
            prevY.next = x;
        }
        Node tempNext = x.next;
        x.next = y.next;
        y.next = tempNext;
        if (k == 1) {
            head = y;
        }
        if (k == n) {
            head = x;
        }
        return head;
    }
}