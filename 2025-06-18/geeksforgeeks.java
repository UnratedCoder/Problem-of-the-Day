import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    ArrayList<ArrayList<String>> ans = new ArrayList<>();

    public boolean isPalindrome(List<String> s) {
        for (String el : s) {
            int n = el.length();
            int i = 0;
            int j = n - 1;
            while (i < j) {
                if (el.charAt(i) != el.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public void genPartition(String s, String bitS) {
        ArrayList<String> currPar = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 0; i < bitS.length(); i++) {
            if (bitS.charAt(i) == '0') {
                sb.append(s.charAt(i + 1));
            } else {
                currPar.add(sb.toString());
                sb.setLength(0);
                sb.append(s.charAt(i + 1));
            }
        }
        currPar.add(sb.toString());
        if (isPalindrome(currPar)) {
            ans.add(currPar);
        }
    }

    public void bitManipulation(String s, String bitS) {
        if (bitS.length() == s.length() - 1) {
            genPartition(s, bitS);
            return;
        }
        bitS += '1';
        bitManipulation(s, bitS);
        bitS = bitS.substring(0, bitS.length() - 1);
        bitS += 0;
        bitManipulation(s, bitS);
        bitS = bitS.substring(0, bitS.length() - 1);
    }

    public ArrayList<ArrayList<String>> palinParts(String s) {
        // code here
        String bitS = "";
        bitManipulation(s, bitS);
        return ans;
    }
}