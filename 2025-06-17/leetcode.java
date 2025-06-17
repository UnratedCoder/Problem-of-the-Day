import java.util.*;

public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int el : arr) {
            if (set.contains(2 * el) || (el % 2 == 0 && set.contains(el / 2))) {
                return true;
            } else {
                set.add(el);
            }
        }
        return false;
    }
}
