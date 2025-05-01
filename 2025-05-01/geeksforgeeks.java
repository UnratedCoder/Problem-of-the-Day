import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        long ans = 1;
        for (int i = 1; i < n; i++) {
            ans *= n - i;
            ans /= i;
            list.add((int) ans);
        }
        return list;
    }
}