import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static char compareSize(String a, String b) {
        if (a.equals(b)) {
            return '=';
        }
        char lastA = a.charAt(a.length() - 1);
        char lastB = b.charAt(b.length() - 1);
        if (lastA != lastB) {
            if (lastA == 'M')
                return (lastB == 'S') ? '>' : '<';
            if (lastB == 'M')
                return (lastA == 'S') ? '<' : '>';
            return (lastA == 'S') ? '<' : '>';
        }
        int countXA = a.length() - 1;
        int countXB = b.length() - 1;
        if (lastA == 'S') {
            return (countXA == countXB) ? '=' : (countXA > countXB ? '<' : '>');
        } else if (lastA == 'L') {
            return (countXA == countXB) ? '=' : (countXA > countXB ? '>' : '<');
        }
        return '=';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String a = scan.next();
            String b = scan.next();
            System.out.println(compareSize(a, b));
        }
    }
}