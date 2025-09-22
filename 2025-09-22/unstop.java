import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static String complexNumberMultiply(String num1, String num2) {
        // Write your logic here.
        String[] parts1 = num1.split("\\+");
        int a = Integer.parseInt(parts1[0]);
        int b = Integer.parseInt(parts1[1].replace("i", ""));
        String[] parts2 = num2.split("\\+");
        int c = Integer.parseInt(parts2[0]);
        int d = Integer.parseInt(parts2[1].replace("i", ""));
        int real = a * c - b * d;
        int imaginary = a * d + b * c;
        return real + "+" + imaginary + "i";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        String num2 = scanner.next();

        // Call user logic function and print the output
        String result = complexNumberMultiply(num1, num2);
        System.out.println(result);
    }
}
