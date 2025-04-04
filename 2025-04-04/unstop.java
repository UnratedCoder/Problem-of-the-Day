import java.util.*;

public class unstop {
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

    // Function to encrypt the message (user logic goes here)
    public static String encryptMessage(List<Integer> arr) {
        // User logic here
        String s = "";
        for (Integer el : arr) {
            if (isPrime(el)) {
                s += "* ";
            } else {
                s += Integer.toString(el) + " ";
            }
        }
        return s;
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