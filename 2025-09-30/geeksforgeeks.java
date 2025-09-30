import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = n - 1; j >= 0; j--) {
                sb.append(((i >> j) & 1) == 1 ? '1' : '0');
            }
            result.add(sb.toString());
        }
        return result;
    }
}