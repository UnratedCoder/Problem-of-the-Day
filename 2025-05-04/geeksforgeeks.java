public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int findSubString(String str) {
        // code here
        int n = str.length();
        boolean ch[] = new boolean[26];
        int unique = 0;
        for (int i = 0; i < n; i++) {
            if (ch[str.charAt(i) - 'a'] == false) {
                ch[str.charAt(i) - 'a'] = true;
                unique++;
            }
        }
        int curr[] = new int[26];
        int count = 0;
        int ans = n;
        int si = 0;
        for (int i = 0; i < n; i++) {
            curr[str.charAt(i) - 'a']++;
            if (curr[str.charAt(i) - 'a'] == 1) {
                count++;
            }
            while (count == unique) {
                ans = Math.min(ans, i - si + 1);
                curr[str.charAt(si) - 'a']--;
                if (curr[str.charAt(si) - 'a'] == 0) {
                    count--;
                }
                si++;
            }
        }
        return ans;
    }
}