import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int equationSolver(int x, int A, int B, int C) {
        return A * x * x + B * x + C;
    }

    public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
        // Code here
        int temp[] = new int[arr.length];
        ArrayList<Integer> ans = new ArrayList<>(temp.length);
        int si = 0;
        int ei = arr.length - 1;
        int idx = A >= 0 ? arr.length - 1 : 0;
        while (si <= ei) {
            int left = equationSolver(arr[si], A, B, C);
            int right = equationSolver(arr[ei], A, B, C);
            if (A >= 0) {
                if (left > right) {
                    temp[idx--] = left;
                    si++;
                } else {
                    temp[idx--] = right;
                    ei--;
                }
            } else {
                if (left < right) {
                    temp[idx++] = left;
                    si++;
                } else {
                    temp[idx++] = right;
                    ei--;
                }
            }
        }
        for (int el : temp) {
            ans.add(el);
        }
        return ans;
    }
}