import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int countBalanced(String[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int balance = 0;
        map.put(0, 1);
        String vowel = "aeiou";
        for (String el : arr) {
            for (char ch : el.toCharArray()) {
                if (vowel.indexOf(ch) != -1) {
                    balance++;
                } else {
                    balance--;
                }
            }
            result += map.getOrDefault(balance, 0);
            map.put(balance, map.getOrDefault(balance, 0) + 1);
        }
        return result;
    }
}