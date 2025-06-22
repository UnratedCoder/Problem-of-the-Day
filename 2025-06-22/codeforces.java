import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        String s = scan.next();
        char ch[] = s.toCharArray();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < ch.length - 1; j++) {
                if (ch[j] == 'B' && ch[j + 1] == 'G') {
                    ch[j] = 'G';
                    ch[j + 1] = 'B';
                    j++;
                }
            }
        }
        System.out.println(new String(ch));
        scan.close();
    }
}