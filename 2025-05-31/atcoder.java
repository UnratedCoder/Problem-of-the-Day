import java.util.*;

public class atcoder {

    // Task A - Timeout
    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int tapped = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] - tapped >= s + 0.5) {
                System.out.println("No");
                return;
            }
            tapped = arr[i];
        }
        System.out.println("Yes");
    }

    // Task B - Compression
    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int freq[] = new int[100];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int el = scan.nextInt();
            freq[el - 1]++;
            set.add(el);
        }
        System.out.println(set.size());
        for (int i = 0; i < 100; i++) {
            if (freq[i] != 0) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}