import java.util.HashSet;
import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            HashSet<Integer> set = new HashSet<>();
            boolean isContains = false;
            for (int i = 0; i < n; i++) {
                int el = scan.nextInt();
                if (set.contains(el)) {
                    isContains = true;
                } else {
                    set.add(el);
                }
            }
            if (isContains) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scan.close();
    }
}