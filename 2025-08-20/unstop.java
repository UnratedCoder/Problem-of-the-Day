import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    static class Pair implements Comparable<Pair> {
        int idx;
        int val;

        Pair(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }

        public int compareTo(Pair p) {
            if (this.val == p.val) {
                return this.idx - p.idx;
            }
            return this.val - p.val;
        }
    }

    public static List<Integer> evaluateRaids(int n, List<String> raids, List<Integer> stamina) {
        // Your logic here
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String raid = raids.get(i);
            int staminaLimit = stamina.get(i);
            int usedStamina = 0;
            boolean isValid = true;
            boolean hasTouch = false;
            char[] moves = raid.toCharArray();
            if (moves[moves.length - 1] != 'R') {
                continue;
            }
            for (int j = 0; j < moves.length; j++) {
                char move = moves[j];
                if (move == 'T') {
                    usedStamina += 3;
                    hasTouch = true;
                } else if (move == 'F') {
                    usedStamina += 1;
                } else if (move == 'R') {
                    usedStamina += 2;
                    if (j > 0 && moves[j - 1] == 'R') {
                        isValid = false;
                        break;
                    }
                }
                if (usedStamina > staminaLimit) {
                    isValid = false;
                    break;
                }
            }
            if (!hasTouch)
                isValid = false;
            if (isValid) {
                pq.add(new Pair(i, usedStamina));
            }
        }
        while (!pq.isEmpty()) {
            result.add(pq.poll().idx);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        List<String> raids = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            raids.add(scanner.nextLine());
        }
        List<Integer> stamina = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stamina.add(scanner.nextInt());
        }

        List<Integer> result = evaluateRaids(n, raids, stamina);

        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
