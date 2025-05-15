public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int countSubstring(String s) {
        // code here
        int count = 0;
        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            count += (freq[i] * (freq[i] + 1)) / 2;
        }
        return count;
    }
}