import java.util.*;

public class unstop {

    class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
            next = null;
        }
    }

    public static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int user_logic(Node head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while (head != null) {
            int sum = sumDigit(head.val);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            head = head.next;
        }
        int max = Integer.MIN_VALUE;
        for (Integer key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        return max;
    }
}