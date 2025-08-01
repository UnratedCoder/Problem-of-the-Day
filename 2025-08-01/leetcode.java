import java.util.*;

public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public ArrayList<Integer> generateRow(int row) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        long ans = 1;
        for (int col = 1; col < row; col++) {
            ans *= row - col;
            ans /= col;
            list.add((int) ans);
        }
        return list;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> row = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            row.add(generateRow(i));
        }
        return row;
    }
}
