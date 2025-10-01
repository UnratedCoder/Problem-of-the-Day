import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int N1 = scan.nextInt();
        int N2 = scan.nextInt();
        int N = scan.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = N1; i <= N2; i++) {
            set.add(i * i);
        }
        boolean found = false;
        for (int i = 0; i < N; i++) {
            int val = scan.nextInt();
            if (set.contains(val)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? 1 : 0);
    }
}
