import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static List<Integer> modifyArray(int n, List<Integer> arr) {
        // User logic goes here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            arr.set(i, arr.get(i) + max);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        List<Integer> modifiedArr = modifyArray(n, arr);
        for (int num : modifiedArr) {
            System.out.print(num + " ");
        }
    }
}