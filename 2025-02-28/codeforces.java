import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int rating = scan.nextInt();
            if (rating <= 1399) {
                System.out.println("Division 4");
            } else if (rating >= 1400 && rating <= 1599) {
                System.out.println("Division 3");
            } else if (rating >= 1600 && rating <= 1899) {
                System.out.println("Division 2");
            } else {
                System.out.println("Division 1");
            }
        }
        scan.close();
    }
}