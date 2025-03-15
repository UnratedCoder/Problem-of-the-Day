import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int dice[][] = new int[n][2];
        int mishkaWon = 0;
        int chrisWon = 0;
        for (int i = 0; i < n; i++) {
            dice[i][0] = scan.nextInt();
            dice[i][1] = scan.nextInt();
            if (dice[i][0] > dice[i][1]) {
                mishkaWon++;
            } else if (dice[i][0] < dice[i][1]) {
                chrisWon++;
            }
        }
        if (mishkaWon == chrisWon) {
            System.out.println("Friendship is magic!^^");
        } else if (mishkaWon > chrisWon) {
            System.out.println("Mishka");
        } else {
            System.out.println("Chris");
        }
        scan.close();
    }
}