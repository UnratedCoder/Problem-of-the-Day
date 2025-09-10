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
    public static ListNode merge_and_sort_linked_lists(ListNode list1, ListNode list2) {
        // User logic to merge and sort linked lists
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if (list1 != null) {
            curr.next = list1;
        } else if (list2 != null) {
            curr.next = list2;
        }
        return dummy.next;
    }

    public static void print_linked_list(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ListNode list1 = null, current = null;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            ListNode newNode = new ListNode(value);
            if (list1 == null) {
                list1 = newNode;
                current = list1;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        int m = scanner.nextInt();
        ListNode list2 = null;
        current = null;
        for (int i = 0; i < m; i++) {
            int value = scanner.nextInt();
            ListNode newNode = new ListNode(value);
            if (list2 == null) {
                list2 = newNode;
                current = list2;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        ListNode sortedMergedList = merge_and_sort_linked_lists(list1, list2);
        print_linked_list(sortedMergedList);
    }
}
