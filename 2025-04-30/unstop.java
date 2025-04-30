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

    // Unstop Code Conquest Problem
    public static Node buildLinkedList(int size, int[] elements) {
        if (size == 0)
            return null;
        Node head = new Node(elements[0]);
        Node tail = head;
        for (int i = 1; i < size; i++) {
            tail.next = new Node(elements[i]);
            tail = tail.next;
        }
        return head;
    }

    public static int pairSum(Node head) {
        // Write your logic here.
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int maxSum = Integer.MIN_VALUE;
        int si = 0;
        int ei = list.size() - 1;
        while (si < ei) {
            int sum = list.get(si) + list.get(ei);
            maxSum = Math.max(maxSum, sum);
            si++;
            ei--;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // First input is the integer n
        int[] elements = new int[n]; // Next n inputs are the elements of the linked list
        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }
        scanner.close();
        Node head = buildLinkedList(n, elements);
        int result = pairSum(head);
        System.out.println(result);
    }
}