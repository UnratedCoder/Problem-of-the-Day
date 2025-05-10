public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public long[] getSumAndZero(int num[]) {
        long[] sumAndZero = { 0, 0 };
        for (int el : num) {
            if (el == 0) {
                sumAndZero[1]++;
            } else {
                sumAndZero[0] += el;
            }
        }
        return sumAndZero;
    }

    public long minSum(int[] nums1, int[] nums2) {
        long ans1[] = getSumAndZero(nums1);
        long ans2[] = getSumAndZero(nums2);
        long totalSum1 = ans1[0] + ans1[1];
        long totalSum2 = ans2[0] + ans2[1];
        if (totalSum1 == totalSum2) {
            return totalSum1;
        }
        long small[] = totalSum1 < totalSum2 ? ans1 : ans2;
        long large[] = (small == ans1 ? ans2 : ans1);
        return small[1] == 0 ? -1 : large[0] + large[1];
    }
}
