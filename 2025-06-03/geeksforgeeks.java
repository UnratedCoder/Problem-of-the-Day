public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    int countDistinct(String s, int k) {
        int count = 0;
        int freq[] = new int[26];
        int distinct = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            freq[s.charAt(j) - 'a']++;
            if (freq[s.charAt(j) - 'a'] == 1) {
                distinct++;
            }
            while (distinct > k) {
                freq[s.charAt(i) - 'a']--;
                if (freq[s.charAt(i) - 'a'] == 0) {
                    distinct--;
                }
                i++;
            }
            count += j - i + 1;
        }
        return count;
    }

    int countSubstr(String s, int k) {
        // your code here
        return countDistinct(s, k) - countDistinct(s, k - 1);
    }
}