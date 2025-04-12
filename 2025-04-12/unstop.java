import java.util.*;

public class unstop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = concatenate(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] concatenate(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
            result[i + n] = arr[i];
        }
        return result;
    }
}