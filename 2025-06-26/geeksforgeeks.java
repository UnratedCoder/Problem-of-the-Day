public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int minValue(String s, int k) {
        // code here
        int ch[] = new int[26];
        int max = 0;
        for (char c : s.toCharArray()) {
            ch[c - 'a']++;
            max = Math.max(max, ch[c - 'a']);
        }
        int freq[] = new int[max + 1];
        int maxFreq = 0;
        for (int c : ch) {
            if (c > 0) {
                freq[c]++;
                maxFreq = Math.max(maxFreq, c);
            }
        }
        while (k > 0 && maxFreq > 0) {
            int countMax = freq[maxFreq];
            if (countMax <= k) {
                k -= countMax;
                freq[maxFreq - 1] += countMax;
                freq[maxFreq] = 0;
                maxFreq--;
            } else {
                freq[maxFreq] -= k;
                freq[maxFreq - 1] += k;
                k = 0;
            }
        }
        int result = 0;
        for (int i = 1; i <= max; i++) {
            result += i * i * freq[i];
        }
        return result;
    }
}