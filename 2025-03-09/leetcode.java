import java.util.ArrayList;

public class leetcode {

    // Weekly Contest 440
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int el : baskets) {
            list.add(el);
        }
        for (int i = 0; i < fruits.length; i++) {
            boolean isGreater = false;
            for (int j = 0; j < list.size(); j++) {
                if (fruits[i] <= list.get(j)) {
                    list.remove(j);
                    isGreater = true;
                    break;
                }
            }
            if (!isGreater) {
                count++;
            }
        }
        return count;
    }
}
