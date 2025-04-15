import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int userLogic(List<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (Integer el : nums) {
            currSum += el;
            if (currSum < 0) {
                currSum = 0;
            } else {
                max = Math.max(max, currSum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        sc.close();
        int result = userLogic(nums);
        System.out.println(result);
    }
}