import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int p = scan.nextInt();
        int nl = scan.nextInt();
        int np = scan.nextInt();
        int totalBottles = k * l;
        int totalSlices = c * d;
        int totalSalt = p;
        int drink = totalBottles / nl;
        int lime = totalSlices;
        int salt = totalSalt / np;
        int totalDrink = Math.min(drink, Math.min(lime, salt));
        int drinkPerFrd = totalDrink / n;
        System.out.println(drinkPerFrd);
        scan.close();
    }
}