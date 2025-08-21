import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            HashSet<Character> set = new HashSet<>();
            boolean canOpenAll = true;
            for (char ch : s.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    set.add(ch);
                } else {
                    if (!set.contains(Character.toLowerCase(ch))) {
                        canOpenAll = false;
                        break;
                    }
                }
            }
            System.out.println(canOpenAll ? "YES" : "NO");
        }
    }
}