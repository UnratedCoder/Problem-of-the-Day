import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            char first = s.charAt(0);
            char second = s.charAt(1);
            int index = (first - 'a') * 25;
            if (second > first) {
                index += (second - 'a') - 1;
            } else {
                index += (second - 'a');
            }
            System.out.println(index + 1);
        }
    }
}