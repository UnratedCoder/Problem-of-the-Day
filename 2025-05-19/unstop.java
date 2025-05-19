import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static List<Integer> userLogic(int n, List<Integer> arr) {
        // Write your logic here.
        boolean isCalled[] = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (!isCalled[i + 1]) {
                isCalled[arr.get(i)] = true;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!isCalled[i]) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        sc.close();
        List<Integer> result = userLogic(n, arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}