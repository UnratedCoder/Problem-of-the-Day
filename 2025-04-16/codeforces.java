import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int a = scan.nextInt();
            String s = Integer.toString(a);
            if (s.length() == 1 || s.length() == 2) {
                System.out.println("NO");
            } else {
                if (!s.substring(0, 2).equals("10")) {
                    System.out.println("NO");
                } else {
                    if (s.substring(2).length() == 1 && (s.charAt(2) == '0' || s.charAt(2) == '1')) {
                        System.out.println("NO");
                    } else {
                        if (s.substring(2).charAt(0) == '0') {
                            System.out.println("NO");
                        } else {
                            System.out.println("YES");
                        }
                    }
                }
            }
        }
        scan.close();
    }
}