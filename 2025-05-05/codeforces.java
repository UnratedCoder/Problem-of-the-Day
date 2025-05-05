import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            if (n != 5) {
                System.out.println("NO");
            } else {
                HashSet<Character> set = new HashSet<>();
                for (char ch : "Timur".toCharArray()) {
                    set.add(ch);
                }
                for (char ch : s.toCharArray()) {
                    if (set.contains(ch)) {
                        set.remove(ch);
                    }
                }
                if (set.size() != 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        scan.close();
    }
}