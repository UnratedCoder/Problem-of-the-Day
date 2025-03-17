import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            char ch[] = new char[2];
            for (char c : s.toCharArray()) {
                if (c == 'A') {
                    ch[0]++;
                } else {
                    ch[1]++;
                }
            }
            if (ch[0] > ch[1]) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
        scan.close();
    }
}