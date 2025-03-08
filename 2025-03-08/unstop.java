import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class unstop {

    public static int userLogic(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int el : arr) {
            list.add(el);
        }
        Collections.sort(list);
        int sum = 0;
        while (list.size() >= 1) {
            if (list.size() % 2 != 0) {
                int median = list.size() / 2;
                sum += list.get(median);
                list.remove(median);
            } else {
                int median = list.size() / 2;
                sum += (list.get(median - 1) + list.get(median)) / 2;
                int a = list.get(median - 1);
                int b = list.get(median);
                if (a > b) {
                    list.remove(median);
                } else {
                    list.remove(median - 1);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int result = userLogic(n, arr);
        System.out.println(result);
    }
}