import java.util.Scanner;

public class unstop {

    public static int get_treasure(int n) {
        // Write your logic here.
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        return get_treasure(n - 1) + get_treasure(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        // Call user logic function and print the output
        int result = get_treasure(n);
        System.out.println(result);
    }
}