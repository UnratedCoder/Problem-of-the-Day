import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class unstop {

    // Unstop Code Conquest Problem
    public static int check_even_or_odd(ListNode head) {
        // Write your logic here.
        while (head != null) {
            if (head.next == null && head.val % 2 == 0) {
                return 1;
            }
            head = head.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        int result = check_even_or_odd(head);
        System.out.println(result);
    }
}