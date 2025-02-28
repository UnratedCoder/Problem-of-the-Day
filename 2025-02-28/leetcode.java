public class leetcode {

    public boolean hasTrailingZeros(int[] nums) {
        int even = 0;
        for (int el : nums) {
            even += el % 2 == 0 ? 1 : 0;
        }
        return even >= 2;
    }
}
