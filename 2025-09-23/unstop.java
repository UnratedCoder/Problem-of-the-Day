import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static List<Integer> turbineOperations(int n, int q, List<Integer> initialFlows, List<int[]> operations) {
        // Implement the logic for handling turbine operations
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int type = operations.get(i)[0];
            if (type == 1) {
                int si = operations.get(i)[1] - 1;
                int ei = operations.get(i)[2];
                int val = operations.get(i)[3];
                for (int j = si; j < ei; j++) {
                    initialFlows.set(j, initialFlows.get(j) + val);
                }
            } else {
                int sum = 0;
                int si = operations.get(i)[1] - 1;
                int ei = operations.get(i)[2];
                for (int j = si; j < ei; j++) {
                    sum += initialFlows.get(j);
                }
                result.add(sum);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        List<Integer> initialFlows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            initialFlows.add(scanner.nextInt());
        }

        List<int[]> operations = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int opType = scanner.nextInt();
            if (opType == 1) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int v = scanner.nextInt();
                operations.add(new int[] { opType, l, r, v });
            } else if (opType == 2) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                operations.add(new int[] { opType, l, r });
            }
        }

        // Call the user logic function
        List<Integer> results = turbineOperations(n, q, initialFlows, operations);

        // Print results for each type 2 operation
        for (int result : results) {
            System.out.println(result);
        }
    }
}
