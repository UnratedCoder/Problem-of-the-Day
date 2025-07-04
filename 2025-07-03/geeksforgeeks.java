public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int longestKSubstr(String s, int k) {
        // code here
        int max = -1;
        int i = 0, j = 0;
        int count = 0;
        int freq[] = new int[26];
        while (j < s.length()) {
            freq[s.charAt(j) - 'a']++;
            if (freq[s.charAt(j) - 'a'] == 1) {
                count++;
            }
            while (count > k) {
                freq[s.charAt(i) - 'a']--;
                if (freq[s.charAt(i) - 'a'] == 0) {
                    count--;
                }
                i++;
            }
            if (count == k) {
                max = Math.max(max, j - i + 1);
            }
            j++;
        }
        return max;
    }
}