import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public int vowelCount(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        String vowel = "aeiou";
        for (char ch : s.toCharArray()) {
            if (vowel.indexOf(ch) != -1) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        if (map.isEmpty())
            return 0;
        int choices = 1;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            choices *= entry.getValue();
        }
        int distinct = map.size();
        int result = choices * factorial(distinct);
        return result;
    }
}