import java.util.*;

public class unstop {

    public static List<Integer> count_substrings(String S, int K) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 2; i <= K; i++) {
            for (int j = 0; j <= S.length() - i; j++) {
                String sub = S.substring(j, j + i);
                HashSet<Character> set = new HashSet<>();
                boolean isDuplicate = false;
                for (int k = 0; k < sub.length(); k++) {
                    if (set.contains(sub.charAt(k))) {
                        isDuplicate = true;
                        break;
                    }
                    set.add(sub.charAt(k));
                }
                if (!isDuplicate) {
                    count++;
                }
            }
            list.add(count);
            count = 0;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        sc.close();
        List<Integer> result = count_substrings(S, K);
        for (int count : result) {
            System.out.println(count);
        }
    }
}