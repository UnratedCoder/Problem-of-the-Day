import java.util.Scanner;
import java.util.Stack;

public class unstop {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scan.next();
        }
        scan.close();
        Stack<Integer> s = new Stack<>();
        int score = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("+")) {
                int first = s.pop();
                int second = s.pop();
                int sum = first + second;
                s.push(second);
                s.push(first);
                s.push(sum);
            } else if (str[i].equals("C")) {
                s.pop();
            } else if (str[i].equals("D")) {
                s.push(2 * s.peek());
            } else {
                s.push(Integer.parseInt(str[i]));
            }
        }
        while (!s.isEmpty()) {
            score += s.pop();
        }
        System.out.println(score);
    }
}