import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            result.add(0);
        }
        int count[] = new int[100001];
        for (int i = 0; i < 100001; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < b.length; i++) {
            count[b[i]]++;
        }
        for (int i = 1; i < 100001; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < a.length; i++) {
            result.set(i, count[a[i]]);
        }
        return result;
    }
}