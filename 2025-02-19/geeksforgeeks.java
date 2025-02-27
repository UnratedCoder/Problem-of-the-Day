import java.util.*;

public class geeksforgeeks {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> (a.data - b.data));
        for (Node head : arr) {
            if (head != null) {
                pq.add(head);
            }
        }
        Node newNode = new Node(-1);
        Node tail = newNode;
        while (!pq.isEmpty()) {
            Node top = pq.poll();
            tail.next = top;
            tail = top;
            if (top.next != null) {
                pq.add(top.next);
            }
        }
        return newNode.next;
    }
}