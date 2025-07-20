import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void zigZagSumArray(int[] arr) {
        // Write your logic here
        int newArr[] = new int[arr.length];
        int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (i == 0) {
                    evenSum = 0;
                } else {
                    evenSum += arr[i - 2];
                }
                newArr[i] = arr[i] + evenSum;
            } else {
                newArr[i] = arr[i] - arr[i - 1];
            }
        }
        for (int el : newArr) {
            System.out.print(el + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        zigZagSumArray(arr);
    }
}