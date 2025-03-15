import java.util.HashSet;
import java.util.Scanner;

public class atcoder {

    // Task A - Thermometer
    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        scan.close();
        if (x < 37.5) {
            System.out.println("3");
        } else if (x >= 37.5 && x < 38.0) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }
    }

    // Task B - Ticket Gate Log
    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (i % 2 == 0) {
                if (ch != 'i') {
                    count++;
                    sb.insert(i, 'i');
                    i--;
                }
            } else {
                if (ch != 'o') {
                    count++;
                    sb.insert(i, 'o');
                    i--;
                }
            }
        }
        if (sb.length() % 2 != 0) {
            sb.insert(sb.length(), 'o');
            count++;
        }
        System.out.println(count);
    }

    // Task C - Variety Split Easy
    public static void taskC(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
            prefix[i] = set.size();
        }
        set.clear();
        for (int i = n - 1; i >= 0; i--) {
            set.add(a[i]);
            suffix[i] = set.size();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int sum = prefix[i] + suffix[i + 1];
            max = Math.max(max, sum);
        }
        System.out.println(max);
        scan.close();
    }
}