import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            char grid[][] = new char[8][8];
            for (int i = 0; i < 8; i++) {
                String s = scan.next();
                for (int j = 0; j < 8; j++) {
                    grid[i][j] = s.charAt(j);
                }
            }
            String ans = "";
            for (int i = 0; i < 8; i++) {
                String temp = "";
                for (int j = 0; j < 8; j++) {
                    if (grid[j][i] != '.') {
                        temp += grid[j][i];
                    }
                }
                ans += temp;
            }
            System.out.println(ans);
        }
        scan.close();
    }
}