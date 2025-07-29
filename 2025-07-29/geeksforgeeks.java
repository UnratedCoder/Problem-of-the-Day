import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<Integer> asciirange(String s) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = s.length();
        int first[] = new int[26];
        int last[] = new int[26];
        for (int i = 0; i < 26; i++) {
            first[i] = -1;
            last[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a';
            if (first[idx] == -1) {
                first[idx] = i;
            } else {
                last[idx] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (first[i] != -1 && last[i] != -1) {
                int sum = 0;
                for (int j = first[i] + 1; j < last[i]; j++) {
                    sum += (int) s.charAt(j);
                }
                if (sum != 0) {
                    result.add(sum);
                }
            }
        }
        return result;
    }
}