import java.util.*;

public class atcoder {

    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        int r = scan.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x <= l && y >= r) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        boolean isTooLong = false;
        for (int i = 0; i < n; i++) {
            char c = scan.next().charAt(0);
            long l = scan.nextLong();
            count += l;
            if (l > 100 || count > 100) {
                isTooLong = true;
                break;
            } else {
                for (int j = 0; j < l; j++) {
                    sb.append(c);
                }
            }
        }
        if (isTooLong) {
            System.out.println("Too Long");
        } else {
            System.out.println(sb);
        }
    }
}