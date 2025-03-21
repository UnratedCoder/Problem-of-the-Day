import java.util.*;

public class unstop {
    public static void interpret(String s) {
        // Write your logic here.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'S') {
                sb.append("send ");
            } else if (i + 1 < s.length() && ch == '[' && s.charAt(i + 1) == ']') {
                sb.append("the ");
                i++;
            } else if (i + 1 < s.length() && ch == '[' && s.charAt(i + 1) == 's') {
                sb.append("ships ");
                i += 4;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        scanner.close();
        // Call user logic function
        interpret(data);
    }
}