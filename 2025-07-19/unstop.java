import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        String vowel = "aeiou";
        int result = 0;
        for (char ch : s.toCharArray()) {
            if (vowel.indexOf(ch) != -1) {
                k += 2;
                System.out.print(ch * k + " ");
            } else {
                k++;
                System.out.print(ch * k + " ");
            }
        }
    }
}