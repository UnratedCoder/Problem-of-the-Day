import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static List<Integer> calculate_final_prices(List<Integer> prices) {
        // Write your logic here.
        List<Integer> result = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = prices.size() - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() > prices.get(i)) {
                s.pop();
            }
            if (s.isEmpty()) {
                result.add(prices.get(i));
            } else {
                result.add(prices.get(i) - s.peek());
            }
            s.push(prices.get(i));
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // First input is the integer n
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            prices.add(sc.nextInt());
        }

        // Call user logic function and print the output
        List<Integer> final_prices = calculate_final_prices(prices);
        for (int price : final_prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}