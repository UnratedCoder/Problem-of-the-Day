import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        int result = minimumProduct(N);
        System.out.println(result);
    }

    public static int minimumProduct(int N) {
        // Write your logic here.
        char ch[] = Integer.toString(N).toCharArray();
        Arrays.sort(ch);
        String n1 = ch[0] + "" + ch[2];
        String n2 = ch[1] + "" + ch[3];
        return Integer.parseInt(n1) * Integer.parseInt(n2);
    }
}