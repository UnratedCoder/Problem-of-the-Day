import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int calculateRemainingTowers(int N, int K, int M, int[] heights) {
        // User should implement the logic here
        // Return the maximum number of towers that can remain
        Deque<Integer> s = new ArrayDeque<>();
        int skip = M;
        for (int i = 0; i < N; i++) {
            int currHeight = heights[i];
            while (!s.isEmpty()) {
                int prevHeight = s.peekLast();
                int gcd = gcd(prevHeight, currHeight);
                if (gcd > K) {
                    if (skip > 0) {
                        skip--;
                        break;
                    } else {
                        currHeight += s.pollLast();
                    }
                } else {
                    break;
                }
            }
            s.addLast(currHeight);
        }
        return s.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int M = scanner.nextInt();

        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }
        scanner.close();

        // Call the user logic function
        int result = calculateRemainingTowers(N, K, M, heights);

        // Print the result
        System.out.println(result);
    }
}