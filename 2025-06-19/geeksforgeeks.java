import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public static String caseSort(String s) {
        // code here
        char lower[] = new char[s.length()];
        char upper[] = new char[s.length()];
        int idx = 0, IDX = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lower[idx++] = ch;
            } else {
                upper[IDX++] = ch;
            }
        }
        Arrays.sort(lower, 0, idx);
        Arrays.sort(upper, 0, IDX);
        StringBuilder sb = new StringBuilder();
        idx = 0;
        IDX = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                sb.append(lower[idx++]);
            } else {
                sb.append(upper[IDX++]);
            }
        }
        return sb.toString();
    }
}