public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int maxArea(int[] height) {
        int maxWater = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        while (leftPointer < rightPointer) {
            int currHeight = Math.min(height[leftPointer], height[rightPointer]);
            int currWidth = rightPointer - leftPointer;
            int currWater = currHeight * currWidth;
            maxWater = Math.max(maxWater, currWater);
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxWater;
    }
}