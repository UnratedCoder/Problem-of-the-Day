import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean compareStr(String s1, String s2) {
        return (s1 + s2).compareTo(s2 + s1) > 0;
    }

    public String findLargest(int[] arr) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        for (int el : arr) {
            list.add(Integer.toString(el));
        }
        Collections.sort(list, (s1, s2) -> compareStr(s1, s2) ? -1 : 1);
        if (list.get(0).equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String el : list) {
            sb.append(el);
        }
        return sb.toString();
    }
}