import java.util.*;

public class geeksforgeeks {

    public int maxPartitions(String s) {
        // code here
        int count = 0;
        int max = -1;
        int freq[] = new int[26];
        Arrays.fill(freq, -1);
        for (int i = s.length() - 1; i >= 0; i--) {
            if (freq[s.charAt(i) - 'a'] == -1) {
                freq[s.charAt(i) - 'a'] = i;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(freq[s.charAt(i) - 'a'], max);
            if (max == i) {
                count++;
            }
        }
        return count;
    }
}