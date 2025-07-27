import java.util.*;

class Node {
    int value;
    int pos;
    Node next;

    Node(int value, int pos) {
        this.value = value;
        this.pos = pos;
        this.next = null;
    }
}

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    static int calculateSumOfFirstK(Node head, int k) {
        // User should implement their logic here
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (head != null) {
            map.put(head.pos, head.value);
            head = head.next;
        }
        int sum = 0;
        int count = 0;
        for (int val : map.values()) {
            if (count == k)
                break;
            sum += val;
            count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int v = scanner.nextInt();
            int p = scanner.nextInt();

            Node node = new Node(v, p);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        int result = calculateSumOfFirstK(head, k);
        System.out.println(result);
    }
}
