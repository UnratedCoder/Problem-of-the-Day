import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static boolean isConsonant(char ch) {
        return "aeiou".indexOf(ch) == -1 && Character.isLetter(ch);
    }

    public static int countConsonants(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (isConsonant(c)) {
                count++;
            }
        }
        return count;
    }

    public static String userLogic(String word) {
        // Write your logic here.
        int consonantCount = countConsonants(word);
        if (isPerfectSquare(consonantCount)) {
            return "QUALIFIED";
        } else {
            return "DISQUALIFIED";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.next();
            System.out.println(userLogic(s));
        }
    }
}