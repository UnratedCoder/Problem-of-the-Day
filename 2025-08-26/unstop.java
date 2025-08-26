import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void reverse(int arr[], int si, int ei) {
        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static int[] userLogic(int n, int[] arr) {
        // Write your logic here.
        Arrays.sort(arr);
        int rearranged[] = new int[n];
        int left = 0, right = n - 1, idx = 0;
        while (left <= right) {
            if (idx % 2 == 0) {
                rearranged[idx++] = arr[right--];
            } else {
                rearranged[idx++] = arr[left++];
            }
        }
        int s = n / 2;
        reverse(rearranged, 0, s - 1);
        reverse(rearranged, s, n - 1);
        reverse(rearranged, 0, n - 1);
        return rearranged;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = userLogic(n, arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
