public class leetcode {

    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int el : nums) {
            min = Math.min(min, el);
            max = Math.max(max, el);
        }
        int count = 0;
        for (int el : nums) {
            if (el != min && el != max) {
                count++;
            }
        }
        return count;
    }
}
