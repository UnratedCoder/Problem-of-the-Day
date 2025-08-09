import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void finalstones(List<Integer> piles) {
        // Write your logic here.
        int[] result = new int[piles.size()];
        for (int i = 0; i < piles.size(); i++) {
            result[i] = piles.get(i);
        }
        Stack<Integer> s = new Stack<>();
        for (int i = piles.size() - 1; i >= 0; i--) {
            while (!s.isEmpty() && piles.get(s.peek()) > piles.get(i)) {
                s.pop();
            }
            if (!s.isEmpty()) {
                result[i] = piles.get(i) - piles.get(s.peek());
            }
            s.push(i);
        }
        for (int el : result) {
            System.out.print(el + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> piles = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            piles.add(sc.nextInt());
        }
        finalstones(piles);
    }
}
