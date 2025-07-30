import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int freq[] = new int[26];
            for (char ch : s.toLowerCase().toCharArray()) {
                freq[ch - 'a']++;
            }
            int solved = 0;
            for (int i = 0; i < 26; i++) {
                int problem = (char) (i + 'a');
                int time = freq[i];
                int required = problem - 'a' + 1;
                if (time >= required) {
                    solved++;
                }
            }
            System.out.println(solved);
        }
    }
}