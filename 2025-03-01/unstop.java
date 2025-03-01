import java.util.Scanner;

public class unstop {

    public static boolean isPerfectSq(int n) {
        int sq = (int) Math.sqrt(n);
        boolean isPerfect = n == sq * sq;
        boolean isPrimeNum = isPrime(sq);
        return isPerfect && isPrimeNum;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void checkQualification(String word) {
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (isVowel(ch)) {
                vowel++;
            } else {
                consonant++;
            }
        }
        if (vowel < 2 || consonant == 0) {
            System.out.println("Disqualify");
        } else if (vowel >= 2 && isPerfectSq(consonant)) {
            System.out.println("Qualify");
        } else {
            System.out.println("Disqualify");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().trim();
        scanner.close();
        checkQualification(word);
    }
}