import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int minSoldiers(int[] arr, int k) {
        // code here
        int n = arr.length;
        int required = (n + 1) / 2;
        int lucky = 0;
        List<Integer> add = new ArrayList<>();
        for (int el : arr) {
            if (el % k == 0) {
                lucky++;
            } else {
                add.add(k - (el % k));
            }
        }
        if (lucky >= required) {
            return 0;
        }
        Collections.sort(add);
        int totalAdd = 0;
        int need = required - lucky;
        for (int i = 0; i < need; i++) {
            totalAdd += add.get(i);
        }
        return totalAdd;

    }
}