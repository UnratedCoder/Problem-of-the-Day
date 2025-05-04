import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int x = 0;
            int move = 1;
            boolean sakurakoTurn = true;
            String lastPlayer = "";
            while (Math.abs(x) <= n) {
                if (sakurakoTurn) {
                    x -= move;
                    lastPlayer = "Sakurako";
                } else {
                    x += move;
                    lastPlayer = "Kosuke";
                }
                move += 2;
                sakurakoTurn = !sakurakoTurn;
            }
            System.out.println(lastPlayer);
        }
        scan.close();
    }
}