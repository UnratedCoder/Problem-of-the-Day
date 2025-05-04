import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static List<Integer> userLogic(int N) {
        // User logic here
        ArrayList<Integer> list = new ArrayList<>();
        int total = 0;
        for (int i = 0; i <= N; i++) {
            int bit = Integer.bitCount(i);
            if (i % 2 == 0) {
                total += bit;
            } else {
                total -= bit;
            }
            list.add(total);
        }
        return list; // Placeholder return
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Input the number N
        scanner.close();
        // Call user logic function
        List<Integer> result = userLogic(N);
        // Print the output in the required format
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}