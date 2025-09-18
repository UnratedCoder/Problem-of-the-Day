import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            HashSet<Integer> forbidden = new HashSet<>();
            for (int i = 0; i < n; i++) {
                forbidden.add(scan.nextInt());
            }
            ArrayList<Integer> allowed = new ArrayList<>();
            for (int i = 0; i <= 9; i++) {
                if (!forbidden.contains(i)) {
                    allowed.add(i);
                }
            }
            int count = 0;
            int m = allowed.size();
            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    count += 6;
                }
            }
            System.out.println(count);
        }
    }
}