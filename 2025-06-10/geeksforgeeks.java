public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    int countStrings(String s) {
        // code here
        int ans = 0;
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ans += (i - freq[ch - 'a']);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                ans++;
                break;
            }
        }
        return ans;
    }
}