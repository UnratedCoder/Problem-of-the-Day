import java.util.Scanner;

public class unstop {

    public static int binToDec(String s) {
        int bin = 0;
        int pow = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = s.charAt(i) - '0';
            bin += num * Math.pow(2, pow++);
        }
        return bin;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += Integer.toString(scan.nextInt());
        }
        scan.close();
        System.out.println(binToDec(str));
    }
}