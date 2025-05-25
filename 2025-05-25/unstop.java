import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class unstop {

    // Unstop Code Conquest Problem
    public static Node user_logic(Node head) {
        /* Write your logic here. */
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }

        Node head = new Node(sc.nextInt());
        Node current = head;
        for (int i = 1; i < n; i++) {
            current.next = new Node(sc.nextInt());
            current = current.next;
        }
        sc.close();

        Node updated_head = user_logic(head);

        if (updated_head == null) {
            System.out.println(0);
        } else {
            List<Integer> result = new ArrayList<>();
            current = updated_head;
            while (current != null) {
                result.add(current.val);
                current = current.next;
            }
            System.out.println(result.size());
            for (int val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}