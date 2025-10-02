import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    static void findCombinations(int n, int k, ArrayList<Integer> subVector, ArrayList<ArrayList<Integer>> res,
            int last) {
        if (n == 0 && k == 0) {
            res.add(new ArrayList<>(subVector));
            return;
        }
        if (n < 0 || k < 0) {
            return;
        }
        for (int i = last; i <= 9; i++) {
            subVector.add(i);
            findCombinations(n - i, k - 1, subVector, res, i + 1);
            subVector.remove(subVector.size() - 1);
        }
    }

    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
        if (n < k || n > 9 * k) {
            return new ArrayList<>();
        }
        ArrayList<Integer> subVector = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        findCombinations(n, k, subVector, result, 1);
        return result;
    }
}