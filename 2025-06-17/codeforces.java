import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] >= 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}