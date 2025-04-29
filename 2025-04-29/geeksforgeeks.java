public class geeksforgeeks {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // GeeksforGeeks Problem (Problem of the Day)
    static Node segregate(Node head) {
        // code here
        if (head == null || head.next == null) {
            return head;
        }
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                count0++;
            } else if (temp.data == 1) {
                count1++;
            } else {
                count2++;
            }
            temp = temp.next;
        }
        temp = head;
        while (count0-- > 0) {
            temp.data = 0;
            temp = temp.next;
        }
        while (count1-- > 0) {
            temp.data = 1;
            temp = temp.next;
        }
        while (count2-- > 0) {
            temp.data = 2;
            temp = temp.next;
        }
        return head;
    }
}