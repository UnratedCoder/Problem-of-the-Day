import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        scan.close();
        String ans = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                ans += '1';
            } else {
                ans += '0';
            }
        }
        System.out.println(ans);
    }
}