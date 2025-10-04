import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int find(int m) {
        // User logic goes here
        return (int) Math.sqrt(m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int count = find(m);
        System.out.println(count);
    }
}
