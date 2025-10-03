import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    static void possibleWordsRec(int[] arr, int index, StringBuilder prefix, String padMap[],
            ArrayList<String> result) {
        if (index == arr.length) {
            result.add(prefix.toString());
            return;
        }
        int digit = arr[index];
        if (digit < 2 || digit > 9) {
            possibleWordsRec(arr, index + 1, prefix, padMap, result);
            return;
        }
        for (char ch : padMap[digit].toCharArray()) {
            prefix.append(ch);
            possibleWordsRec(arr, index + 1, prefix, padMap, result);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }

    public ArrayList<String> possibleWords(int[] arr) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        String padMap[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        StringBuilder prefix = new StringBuilder();
        possibleWordsRec(arr, 0, prefix, padMap, result);
        return result;
    }
}