import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            int[] digCount = new int[10];
            for (char ch : s.toCharArray()) {
                digCount[ch - '0']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                int required = 9 - i;
                for (int j = 0; j < 10; j++) {
                    if (digCount[j] > 0 && j >= required) {
                        sb.append(j);
                        digCount[j]--;
                        break;
                    }
                }
            }
            System.out.println(sb.toString());
        }
        scan.close();
    }
}