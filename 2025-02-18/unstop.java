import java.util.Scanner;
import java.util.HashSet;

public class unstop {
    public static int findRepeatedElement(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int repeat = 0;
        for (int el : arr) {
            if (set.contains(el)) {
                repeat = el;
                break;
            }
            set.add(el);
        }
        return repeat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int result = findRepeatedElement(arr);
        System.out.println(result);
    }
}