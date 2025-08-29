import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int vote[] = new int[n];
        int totalVote = 0;
        for (int i = 0; i < n; i++) {
            vote[i] = scan.nextInt();
            totalVote += vote[i];
        }
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(vote);
        int currSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            result.add(vote[i]);
            currSum += vote[i];
            if (currSum > totalVote - currSum) {
                break;
            }
        }
        for (int el : result) {
            System.out.print(el + " ");
        }
    }
}
