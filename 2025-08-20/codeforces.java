import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int skills[] = new int[n];
            for (int i = 0; i < n; i++) {
                skills[i] = scan.nextInt();
            }
            Arrays.sort(skills);
            boolean isValid = false;
            for (int i = 1; i < n; i++) {
                if (skills[i] - skills[i - 1] == 1) {
                    isValid = true;
                    break;
                }
            }
            System.out.println(isValid ? 2 : 1);
        }
    }
}