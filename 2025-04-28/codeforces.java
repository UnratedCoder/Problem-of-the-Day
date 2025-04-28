import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int freq[] = new int[26];
            int totalBalloons = 0;
            for (char ch : s.toLowerCase().toCharArray()) {
                int idx = ch - 'a';
                if (freq[idx] == 0) {
                    totalBalloons += 2;
                } else {
                    totalBalloons++;
                }
                freq[idx]++;
            }
            System.out.println(totalBalloons);
        }
        scan.close();
    }
}