import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
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

    public static String encryptMessage(List<Integer> arr) {
        // User logic here
        StringBuilder sb = new StringBuilder();
        for (Integer el : arr) {
            if (isPrime(el)) {
                sb.append("* ");
            } else {
                sb.append(el + " ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> arr = new ArrayList<>(N);

        for (int i = 0; i < N; ++i) {
            arr.add(sc.nextInt());
        }
        sc.close();
        // Call user logic function and print the output
        String result = encryptMessage(arr);
        System.out.println(result);
    }
}