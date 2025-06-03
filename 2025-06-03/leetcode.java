public class leetcode {

    // LeetCode Problem
    public String categorizeBox(int length, int width, int height, int mass) {
        long volumeOfBox = 1L * length * width * height;
        boolean isBulky = (length >= 10000 || width >= 10000 || height >= 10000 || volumeOfBox >= 1_000_000_000L);
        boolean isHeavy = (mass >= 100);
        if (isBulky && isHeavy) {
            return "Both";
        } else if (isBulky) {
            return "Bulky";
        } else if (isHeavy) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}
