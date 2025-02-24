import java.util.Scanner;

public class unstop {

    public static int specialSeries(int A, int B, int N) {
        // Write your logic here.
        for (int i = 3; i <= N; i++) {
            int diff = Math.abs(A - B);
            A = B;
            B = diff;
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        // Call user logic function and print the output
        int result = specialSeries(A, B, N);
        System.out.println(result);
    }
}
