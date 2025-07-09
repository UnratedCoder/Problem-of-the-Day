import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class unstop {

    // Unstop Code Conquest Problem
    public static int countNodes(Node head) {
        // Write your logic here.
        int prev = 0;
        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (prev == 0 && curr.next != null && curr.data > curr.next.data) {
                count++;
            } else if (curr.data > prev && curr.next != null && curr.data > curr.next.data) {
                count++;
            } else if (curr.next == null && curr.data > prev) {
                count++;
            }
            prev = curr.data;
            curr = curr.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            elements.add(sc.nextInt());
        }
        if (size != elements.size()) {
            throw new IllegalArgumentException("Number of elements does not match the size of the list");
        }
        Node head = null;
        Node tail = null;
        for (int elem : elements) {
            Node newNode = new Node(elem);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        int result = countNodes(head);
        System.out.println(result);
    }
}