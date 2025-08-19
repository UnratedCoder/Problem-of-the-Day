import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    private static HashMap<String, Integer> memo;

    public static int backtrack(int nums[], int idx, int currSum, int target) {
        if (idx == nums.length) {
            return currSum == target ? 1 : 0;
        }
        String key = idx + "," + currSum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int add = backtrack(nums, idx + 1, currSum + nums[idx], target);
        int subtract = backtrack(nums, idx + 1, currSum - nums[idx], target);
        int totalWays = add + subtract;
        memo.put(key, totalWays);
        return totalWays;
    }

    public static int user_logic(int[] nums, int target) {
        // Write your logic here.
        memo = new HashMap<>();
        return backtrack(nums, 0, 0, target);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int ways = user_logic(nums, target);
        System.out.println(ways);
    }
}
