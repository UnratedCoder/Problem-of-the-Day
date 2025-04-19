import java.util.*;

public class atcoder {

    // Task A - CBC
    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                System.out.print(ch);
            }
        }
    }

    // Task B - Restaurant Queue
    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int type = scan.nextInt();
            if (type == 1) {
                int x = scan.nextInt();
                list.add(x);
            } else {
                System.out.println(list.remove(0));
            }
        }
        scan.close();
    }
}