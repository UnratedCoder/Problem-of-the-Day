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

    public Node sortedInsert(Node head, int data) {
        // code here
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        Node temp = head;
        Node tempNext = head.next;
        if (data <= head.data) {
            Node lastNode = head;
            while (lastNode.next != head) {
                lastNode = lastNode.next;
            }
            newNode.next = head;
            lastNode.next = newNode;
            return newNode;
        }
        while (temp.next != head) {
            if (temp.data < data && tempNext.data >= data) {
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            } else {
                temp = temp.next;
                tempNext = tempNext.next;
            }
        }
        newNode.next = head;
        temp.next = newNode;
        return head;
    }
}