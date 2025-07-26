import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int ele1 = 0, ele2 = 0;
        for (int el : arr) {
            if (count1 == 0 && el != ele2) {
                ele1 = el;
                count1 = 1;
            } else if (count2 == 0 && el != ele1) {
                ele2 = el;
                count2 = 1;
            } else if (el == ele1) {
                count1++;
            } else if (el == ele2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int el : arr) {
            if (ele1 == el) {
                count1++;
            }
            if (ele2 == el) {
                count2++;
            }
        }
        if (count1 > arr.length / 3) {
            result.add(ele1);
        }
        if (count2 > arr.length / 3) {
            result.add(ele2);
        }
        if (result.size() == 2 && result.get(0) > result.get(1)) {
            Collections.swap(result, 0, 1);
        }
        return result;
    }
}