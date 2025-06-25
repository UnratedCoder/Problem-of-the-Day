import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    boolean sameFreq(String s) {
        // code here
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch - '0', freq.getOrDefault(ch - '0', 0) + 1);
        }
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int val : freq.values()) {
            count.put(val, count.getOrDefault(val, 0) + 1);
        }
        if (count.size() == 1) {
            return true;
        } else if (count.size() == 2) {
            ArrayList<Integer> list = new ArrayList<>(count.keySet());
            int f1 = list.get(0), f2 = list.get(1);
            int c1 = count.get(f1), c2 = count.get(f2);
            if (f1 > f2) {
                int tempF = f1, tempC = f1;
                f1 = f2;
                c1 = c2;
                f2 = tempF;
                f1 = tempC;
            }
            if ((f1 == 1 && c1 == 1) || (f2 == f1 + 1 && c2 == 1)) {
                return true;
            }
        }
        return false;
    }
}