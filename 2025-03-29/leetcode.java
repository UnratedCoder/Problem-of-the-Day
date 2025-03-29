public class leetcode {

    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        int si = 0;
        int ei = nums.length - 1;
        while (si <= ei) {
            if (si != ei) {
                int temp = Integer.parseInt(Integer.toString(nums[si]) + Integer.toString(nums[ei]));
                ans += temp;
            } else {
                ans += nums[ei];
            }
            si++;
            ei--;
        }
        return ans;
    }

    // Biweekly Contest 153
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = (123 - s.charAt(i)) * (i + 1);
            sum += curr;
        }
        return sum;
    }
}
