import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                if (num % 2 == 0) {
                    even.add(num);
                } else {
                    odd.add(num);
                }
            }
            ArrayList<Integer> finalOrder = new ArrayList<>();
            finalOrder.addAll(even);
            finalOrder.addAll(odd);
            long sum = 0;
            int points = 0;
            for (int val : finalOrder) {
                sum += val;
                if (sum % 2 == 0) {
                    points++;
                    while (sum % 2 == 0) {
                        sum /= 2;
                    }
                }
            }
            System.out.println(points);
        }
    }
}