public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int getDecimalValue(ListNode head) {
        int decimal = 0;
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int i = size - 1;
        while (i >= 0) {
            decimal += Math.pow(2, i) * head.val;
            head = head.next;
            i--;
        }
        return decimal;
    }
}
