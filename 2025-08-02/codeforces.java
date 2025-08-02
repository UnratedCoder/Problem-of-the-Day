import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static int getCount(HashSet<String> a, HashSet<String> b, String word) {
        int count = 0;
        if (!a.contains(word) && !b.contains(word)) {
            count = 2;
        } else if (a.contains(word) && b.contains(word)) {
            count = 0;
        } else {
            count = 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            ArrayList<String>[] players = new ArrayList[3];
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < 3; i++) {
                players[i] = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    String word = scan.next();
                    players[i].add(word);
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
            int score[] = new int[3];
            for (int i = 0; i < 3; i++) {
                for (String word : players[i]) {
                    int count = map.get(word);
                    if (count == 1) {
                        score[i] += 3;
                    } else if (count == 2) {
                        score[i] += 1;
                    }
                }
            }
            System.out.println(score[0] + " " + score[1] + " " + score[2]);
        }
    }
}