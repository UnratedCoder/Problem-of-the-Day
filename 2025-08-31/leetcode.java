public class leetcode {

    // LeetCode Contest (Weekly Contest 465)
    public int[] recoverOrder(int[] order, int[] friends) {
        int freq[] = new int[101];
        for (int el : friends) {
            freq[el]++;
        }
        int idx = 0;
        for (int el : order) {
            if (freq[el] == 1) {
                friends[idx++] = el;
            }
        }
        return friends;
    }
}
