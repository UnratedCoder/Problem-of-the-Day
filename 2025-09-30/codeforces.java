import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        long redSheets = 2 * n;
        long greenSheets = 5 * n;
        long blueSheets = 8 * n;
        long redBooks = (redSheets + k - 1) / k;
        long greenBooks = (greenSheets + k - 1) / k;
        long blueBooks = (blueSheets + k - 1) / k;
        long totalBooks = redBooks + greenBooks + blueBooks;
        System.out.println(totalBooks);
    }
}
