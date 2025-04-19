import java.util.*;

public class geeksforgeeks {

    // GfG 160 - 160 Days of Problem Solving (Day 156)
    public int maxXor(int[] arr) {
        // code here
        int ans = 0;
        int bitMask = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 30; i >= 0; i--) {
            bitMask |= (1 << i);
            for (int el : arr) {
                set.add(el & bitMask);
            }
            int curr = ans | (1 << i);
            for (int s : set) {
                if (set.contains(curr ^ s)) {
                    ans = curr;
                    break;
                }
            }
            set.clear();
        }
        return ans;
    }
}