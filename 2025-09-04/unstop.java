import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int minTimeToType(String word) {
        // Write your logic here.
        char ch[] = word.toCharArray();
        Arrays.sort(ch);
        int time = 0, currPos = 0;
        for (char c : ch) {
            int target = c - 'a';
            int diff = Math.abs(target - currPos);
            int step = Math.min(diff, 26 - diff);
            time += step + 1;
            currPos = target;
        }
        return time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int result = minTimeToType(word);
        System.out.println(result);
    }
}
