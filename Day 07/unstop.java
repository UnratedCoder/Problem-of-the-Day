import java.util.*;

public class unstop {

    public static boolean user_logic(List<String> arr1, List<String> arr2) {
        // Write your logic here.
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < arr1.size(); i++) {
            s1 += arr1.get(i);
        }
        for (int i = 0; i < arr2.size(); i++) {
            s2 += arr2.get(i);
        }
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        List<String> arr1 = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            arr1.add(scanner.next());
        }
        int m = scanner.nextInt();
        scanner.nextLine(); // consume newline
        List<String> arr2 = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            arr2.add(scanner.next());
        }
        scanner.close();
        boolean result = user_logic(arr1, arr2);
        System.out.println(result ? "true" : "false");
    }
}
