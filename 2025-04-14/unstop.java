import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void reverseShirtNumbers(int n, int[] shirtNumbers) {
        for (int i = 0; i < n / 2; i++) {
            int temp = shirtNumbers[i];
            shirtNumbers[i] = shirtNumbers[n - 1 - i];
            shirtNumbers[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] shirtNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            shirtNumbers[i] = sc.nextInt();
        }
        sc.close();
        reverseShirtNumbers(n, shirtNumbers);
        for (int num : shirtNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}