import java.util.*;

public class geeksforgeeks {

    public int activitySelection(int[] start, int[] finish) {
        // code here.
        int activity[][] = new int[start.length][2];
        for (int i = 0; i < start.length; i++) {
            activity[i][0] = finish[i];
            activity[i][1] = start[i];
        }
        Arrays.sort(activity, (a, b) -> Integer.compare(a[0], b[0]));
        int workDone = -1;
        int ans = 0;
        for (int i = 0; i < start.length; i++) {
            if (activity[i][1] > workDone) {
                ans++;
                workDone = activity[i][0];
            }
        }
        return ans;
    }
}