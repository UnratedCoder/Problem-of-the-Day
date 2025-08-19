import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<Integer> farMin(int[] arr) {
        // Code Here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1));
        ArrayList<Integer> arrList = new ArrayList<>(n);
        for (int el : arr) {
            arrList.add(el);
        }
        ArrayList<Integer> suff = new ArrayList<>(arrList);
        suff.set(n - 1, arrList.get(n - 1));
        for (int i = n - 2; i >= 0; --i) {
            suff.set(i, Math.min(arrList.get(i), suff.get(i + 1)));
        }
        for (int i = 0; i < n; ++i) {
            int low = i + 1, high = n - 1, res = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (suff.get(mid) < arrList.get(i)) {
                    res = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            ans.set(i, res);
        }
        return ans;
    }
}