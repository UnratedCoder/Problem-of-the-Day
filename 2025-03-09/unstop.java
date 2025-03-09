import java.util.Scanner;

public class unstop {

    public static void sort_sentence(String s) {
        String words[] = s.split(" ");
        String newWord[] = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            int idx = temp.charAt(temp.length() - 1) - '0';

            newWord[idx - 1] = temp.substring(0, temp.length() - 1);
        }
        String ans = "";
        for (String str : newWord) {
            ans += str + " ";
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        sort_sentence(s);
    }
}