import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int userLogic(int n, String s) {
        // Write your logic here.
        int maxDepth = 0;
        int currDepth = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                currDepth++;
                if (currDepth > maxDepth) {
                    maxDepth = currDepth;
                }
            } else if (ch == ')') {
                currDepth--;
            }
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        scanner.close();
        int result = userLogic(n, s);
        System.out.println(result);
    }
}