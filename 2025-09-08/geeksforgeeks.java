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

    public Node split(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null) {
                slow = slow.next;
            }
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }

    public Node merge(Node first, Node second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        if (first.data < second.data) {
            first.next = merge(first.next, second);
            return first;
        } else {
            second.next = merge(first, second.next);
            return second;
        }
    }

    public Node mergeSort(Node head) {
        // code here
        if (head == null || head.next == null) {
            return head;
        }
        Node second = split(head);
        head = mergeSort(head);
        second = mergeSort(second);
        return merge(head, second);
    }
}