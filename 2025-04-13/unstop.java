import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class unstop {

    // Unstop Code Conquest Problem
    public static ListNode middleNode(ListNode head) {
        // Write your logic here to find the middle node of the linked list.
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        if (list.size() % 2 != 0) {
            ListNode mid = new ListNode(list.get(list.size() / 2));
            return mid;
        } else {
            ListNode mid = new ListNode(list.get(list.size() / 2 - 1));
            return mid;
        }
    }

    public static ListNode constructLL(int[] arr, int si) {
        if (si == arr.length)
            return null;
        ListNode head = new ListNode(arr[si]);
        head.next = constructLL(arr, si + 1);
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ListNode head = constructLL(arr, 0);
        ListNode middle_node = middleNode(head);
        if (middle_node != null) {
            System.out.println(middle_node.val);
        } else {
            System.out.println(0);
        }
    }
}