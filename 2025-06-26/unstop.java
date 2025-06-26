import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean canFrogCrossRiver(int[] nums) {
        // Write your logic here.
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean result = canFrogCrossRiver(nums);
        System.out.println(result ? "true" : "false");
    }
}