public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public String largestSwap(String s) {
        // code here
        char ch[] = s.toCharArray();
        char maxDigit = '0';
        int maxIdx = -1, left = -1, right = -1;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] > maxDigit) {
                maxDigit = ch[i];
                maxIdx = i;
            } else if (ch[i] < maxDigit) {
                left = i;
                right = maxIdx;
            }
        }
        if (left == -1) {
            return s;
        }
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
        return new String(ch);
    }
}