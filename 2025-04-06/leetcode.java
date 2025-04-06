import java.util.ArrayList;

public class leetcode {

    public boolean isNonDec(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int minimumPairRemoval(int[] nums) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int el : nums) {
            list.add(el);
        }
        while (!isNonDec(list)) {
            int sum = Integer.MAX_VALUE;
            int idx = -1;
            for (int i = 0; i < list.size() - 1; i++) {
                int currSum = list.get(i) + list.get(i + 1);
                if (currSum < sum) {
                    sum = currSum;
                    idx = i;
                }
            }
            int currSum = list.get(idx) + list.get(idx + 1);
            list.set(idx, currSum);
            list.remove(idx + 1);
            count++;
        }
        return count;
    }
}
