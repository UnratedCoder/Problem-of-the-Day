import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static double calculateMean(String s) {
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }
        return (double) uniqueChars.size() / s.length();
    }

    public static void determine_winner(int N, String smit_str, String joy_str) {
        double smitMean = calculateMean(smit_str);
        double joyMean = calculateMean(joy_str);
        if (smitMean > joyMean) {
            System.out.println("SMIT");
        } else if (joyMean > smitMean) {
            System.out.println("JOY");
        } else {
            System.out.println("TIE");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        String smit_str = scanner.nextLine();
        String joy_str = scanner.nextLine();
        scanner.close();
        determine_winner(N, smit_str, joy_str);
    }
}