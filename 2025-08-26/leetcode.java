public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int result = 0;
        double maxDiagonal = Double.MIN_VALUE;
        for (int i = 0; i < dimensions.length; i++) {
            int length = dimensions[i][0];
            int width = dimensions[i][1];
            double diagonal = Math.sqrt(length * length + width * width);
            int area = length * width;
            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                result = area;
            } else if (diagonal == maxDiagonal) {
                result = Math.max(result, area);
            }
        }
        return result;
    }
}
