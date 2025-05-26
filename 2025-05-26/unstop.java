import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static List<Integer> processWords(int n, List<String> s, char x) {
        // User needs to write the logic here
        List<Integer> ans = new ArrayList<>();
        for (String word : s) {
            String temp = word.replaceAll(Character.toString(x), "");
            ans.add(temp.length());
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(scanner.next());
        }
        char x = scanner.next().charAt(0);
        scanner.close();

        List<Integer> result = processWords(n, s, x);
        for (Integer num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}