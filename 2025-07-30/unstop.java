import java.util.*;

class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static String is_symmetric(Node head) {
        // Write your logic here
        // Return "YES" or "NO"
        if (head == null || head.next == null) {
            return "YES";
        }
        Node mid = findMid(head);
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.val != right.val) {
                return "NO";
            }
            right = right.next;
            left = left.next;
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node head = null, tail = null;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            Node node = new Node(value);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        String result = is_symmetric(head);
        System.out.println(result);
    }
}
