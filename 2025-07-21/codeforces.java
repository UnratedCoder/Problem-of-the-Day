import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            boolean isValid = true;
            for (int i = 0; i < n; i++) {
                int seat = arr[i];
                if (i == 0) {
                    set.add(seat);
                } else {
                    if (!set.contains(seat - 1) && !set.contains(seat + 1)) {
                        isValid = false;
                        break;
                    }
                    set.add(seat);
                }
            }
            System.out.println(isValid ? "YES" : "NO");
        }
    }
}