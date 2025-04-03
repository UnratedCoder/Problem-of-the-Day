import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            @SuppressWarnings("unused")
            int n = scan.nextInt();
            String s = scan.next();
            boolean isValid = true;
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (i == 0) {
                    set.add(ch);
                } else if (i > 0 && s.charAt(i - 1) != ch) {
                    if (set.contains(ch)) {
                        isValid = false;
                        break;
                    } else {
                        set.add(ch);
                    }
                }
            }
            if (isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}