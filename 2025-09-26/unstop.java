import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void find_center_node(List<int[]> edges, int n) {
        // Write your logic here.
        int degree[] = new int[n + 1];
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            degree[u]++;
            degree[v]++;
        }
        for (int i = 1; i <= n; i++) {
            if (degree[i] == n - 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            edges.add(new int[] { u, v });
        }
        find_center_node(edges, n);
    }
}
