public class leetcode {

    public int minChanges(int n, int k) {
        String s1 = String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0");
        String s2 = String.format("%32s", Integer.toBinaryString(k)).replaceAll(" ", "0");
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (s1.charAt(i) == '0' && s2.charAt(i) == '1') {
                return -1;
            } else if (s1.charAt(i) == '1' && s2.charAt(i) == '0') {
                count++;
            }
        }
        return count;
    }
}
