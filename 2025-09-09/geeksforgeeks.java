import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int assignHole(int[] mices, int[] holes) {
        // code here
        Arrays.sort(mices);
        Arrays.sort(holes);
        int max = 0;
        for (int i = 0; i < mices.length; i++) {
            if (max < Math.abs(mices[i] - holes[i])) {
                max = Math.abs(mices[i] - holes[i]);
            }
        }
        return Math.abs(max);
    }
}