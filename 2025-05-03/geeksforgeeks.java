public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    class Node {
        Node next;
        int val;

        public Node(int data) {
            val = data;
            next = null;
        }
    }

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    Node primeList(Node head) {
        // code here
        Node temp = head;
        while (temp != null) {
            int num = temp.val;
            int num1, num2;
            num1 = num2 = num;
            if (num == 1) {
                temp.val = 2;
                temp = temp.next;
                continue;
            }
            while (!isPrime(num1)) {
                num1--;
            }
            while (!isPrime(num2)) {
                num2++;
            }
            if (num - num1 > num2 - num) {
                temp.val = num2;
            } else {
                temp.val = num1;
            }
            temp = temp.next;
        }
        return head;
    }
}