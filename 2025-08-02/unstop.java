import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    static void specialmsg(String s, List<Map.Entry<String, String>> vocab) {
        // Write your logic here.
        HashMap<String, String> map = new HashMap<>();
        for (Map.Entry<String, String> entry : vocab) {
            map.put(entry.getKey(), entry.getValue());
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                int j = i + 1;
                while (j < s.length() && s.charAt(j) != ')') {
                    j++;
                }
                if (j < s.length()) {
                    String key = s.substring(i + 1, j);
                    sb.append(map.getOrDefault(key, "?"));
                    i = j + 1;
                } else {
                    sb.append(s.charAt(i));
                    i++;
                }
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        List<Map.Entry<String, String>> vocab = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] kv = sc.nextLine().split(" ");
            vocab.add(new AbstractMap.SimpleEntry<>(kv[0], kv[1]));
        }

        specialmsg(s, vocab);
    }
}
