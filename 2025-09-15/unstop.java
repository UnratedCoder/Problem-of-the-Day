import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        // Call user logic function and get the results
        int[] results = userLogic(X, Y, Z);

        // Print the results
        System.out.println("AND: " + results[0]);
        System.out.println("OR: " + results[1]);
        System.out.println("XOR: " + results[2]);
        System.out.println("Generated Bitmask: " + results[3]);
        System.out.println("Masked AND: " + results[4]);
        System.out.println("Masked OR: " + results[5]);
        System.out.println("Masked XOR: " + results[6]);
    }

    public static int[] userLogic(int X, int Y, int Z) {
        // Write your logic here.
        int bitMask = Z % 2 == 0 ? ((1 << (Z % 10)) - 1) : ((1 << (Z % 5 + 2)) - 1);
        return new int[] { X & Y, X | Y, X ^ Y, bitMask, (X & Y) & bitMask, (X | Y) & bitMask, (X ^ Y) & bitMask };
    }
}
