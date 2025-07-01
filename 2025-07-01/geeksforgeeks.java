public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int substrCount(String s, int k) {
        // code here
        if (k > s.length()) {
            return 0;
        }
        int result = 0;
        int count[] = new int[26];
        int distinctCount = 0;
        for (int i = 0; i < k - 1; i++) {
            int idx = s.charAt(i) - 'a';
            count[idx]++;
            if (count[idx] == 1) {
                distinctCount++;
            }
        }
        for (int i = k - 1; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            count[idx]++;
            if (count[idx] == 1) {
                distinctCount++;
            }
            if (distinctCount == k - 1) {
                result++;
            }
            int removeIdx = s.charAt(i - k + 1) - 'a';
            count[removeIdx]--;
            if (count[removeIdx] == 0) {
                distinctCount--;
            }
        }
        return result;
    }
}