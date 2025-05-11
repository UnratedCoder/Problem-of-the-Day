public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        }
        return false;
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (isOdd(arr[i]) && isOdd(arr[i + 1]) && isOdd(arr[i + 2])) {
                return true;
            }
        }
        return false;
    }
}
