import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int[] countBits(String str) {
        int count[] = new int[2];
        for (char ch : str.toCharArray()) {
            if (ch == '0')
                count[0]++;
            else if (ch == '1')
                count[1]++;
        }
        return count;
    }

    public static String canMakeHalvesEqual(String S) {
        // Write your logic here
        int n = S.length() / 2;
        String first = S.substring(0, n);
        String second = S.substring(n);
        int countFirst[] = countBits(first);
        int countSecond[] = countBits(second);
        if (countFirst[0] == countSecond[0] && countFirst[1] == countSecond[1]) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        // Call the user logic function and print the result
        String result = canMakeHalvesEqual(S);
        System.out.println(result);
    }
}
