import java.util.*;

public class atcoder {

    // Task A - Hamming Distance
    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        String t = scan.next();
        scan.close();
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += s.charAt(i) != t.charAt(i) ? 1 : 0;
        }
        System.out.println(count);
    }

    // Task B - Ranking with Ties
    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int in = 0; in < n; in++) {
            a[in] = scan.nextInt();
        }
        scan.close();
        int[] ranks = new int[n];
        List<int[]> sortedScores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sortedScores.add(new int[] { a[i], i });
        }
        sortedScores.sort((c, d) -> Integer.compare(d[0], c[0]));
        int rank = 1;
        int i = 0;
        while (i < n) {
            int currentScore = sortedScores.get(i)[0];
            int groupSize = 1;
            while (i + groupSize < n && sortedScores.get(i + groupSize)[0] == currentScore) {
                groupSize++;
            }
            for (int j = 0; j < groupSize; j++) {
                ranks[sortedScores.get(i + j)[1]] = rank;
            }
            rank += groupSize;
            i += groupSize;
        }
        for (i = 0; i < n; i++) {
            System.out.println(ranks[i]);
        }
    }
}