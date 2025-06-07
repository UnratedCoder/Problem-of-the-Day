import java.util.*;

public class atcoder {

    // Task A - Conflict
    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String t = scan.next();
        String a = scan.next();
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == 'o' && t.charAt(i) == a.charAt(i)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    // Task B - Citation
    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        int answer = 0;
        for (int x = 0; x <= N; x++) {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] >= x) {
                    count = N - i;
                    break;
                }
            }
            if (count >= x) {
                answer = x;
            }
        }
        System.out.println(answer);
    }
}