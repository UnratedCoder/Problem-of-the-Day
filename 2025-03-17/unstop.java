import java.util.*;

public class unstop {
    public static int calculateSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int el : nums) {
            if (el > 0) {
                set.add(el);
            }
            sum += el;
        }
        int ans = nums.length + 1;
        for (int i = 1; i <= nums.length + 1; i++) {
            if (!set.contains(i)) {
                ans = i;
                break;
            }
        }
        return (int) (Integer.toString(ans)).charAt(0) + sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        int result = calculateSum(nums);
        System.out.println(result);
    }
}