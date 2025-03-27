public class leetcode {

    public int maxDivScore(int[] nums, int[] divisors) {
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < divisors.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0) {
                    count++;
                }
            }
            if (max == count) {
                ans = Math.min(ans, divisors[i]);
            } else if (max < count) {
                max = count;
                ans = divisors[i];
            }
        }
        return ans;
    }
}
