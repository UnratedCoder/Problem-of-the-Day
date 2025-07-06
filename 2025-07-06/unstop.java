import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        user_logic(n, nums);
    }

    static void user_logic(int n, int[] nums) {
        // Write your logic here.
        HashSet<Integer> set = new HashSet<>();
        for (int el : nums) {
            set.add(el);
        }
        long sum = 0;
        for (Integer el : set) {
            sum += Math.pow(2, el);
        }
        System.out.println(sum);
    }
}