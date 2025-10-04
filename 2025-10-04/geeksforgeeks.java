import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    static void buildExpr(ArrayList<String> result, String expr, String digits, int target, int idx, int eval,
            int last) {
        if (idx == digits.length()) {
            if (eval == target) {
                result.add(expr);
            }
            return;
        }
        for (int i = idx; i < digits.length(); i++) {
            if (i != idx && digits.charAt(idx) == '0') {
                break;
            }
            String part = digits.substring(idx, i + 1);
            int num = Integer.parseInt(part);
            if (idx == 0) {
                buildExpr(result, part, digits, target, i + 1, num, num);
            } else {
                buildExpr(result, expr + "+" + part, digits, target, i + 1, eval + num, num);
                buildExpr(result, expr + "-" + part, digits, target, i + 1, eval - num, -num);
                buildExpr(result, expr + "*" + part, digits, target, i + 1, eval - last + last * num, last * num);
            }
        }
    }

    public ArrayList<String> findExpr(String s, int target) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        buildExpr(result, "", s, target, 0, 0, 0);
        return result;
    }
}