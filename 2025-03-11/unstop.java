import java.util.*;

public class unstop {

    public static int find_largest_pack(int N) {
        int count = 0;
        while (N > 0) {
            if (N / 2 > 0) {
                count++;
            } else {
                break;
            }
            N /= 2;
        }
        return (int) Math.pow(2, count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = find_largest_pack(N);
        System.out.println(result);
        scanner.close();
    }
}