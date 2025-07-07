import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static boolean isLucky(int n) {
        String num = Integer.toString(n);
        for (char ch : num.toCharArray()) {
            if (ch != '4' && ch != '7') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat[][] = new int[5][5];
        int row = 0;
        int col = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = scan.nextInt();
                if (mat[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(Math.abs(2 - row) + Math.abs(2 - col));
    }
}