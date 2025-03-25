import java.util.*;

public class unstop {
    public static boolean isSingleValuedBinaryTree(List<Integer> values) {
        // Write your logic here.
        HashSet<Integer> set = new HashSet<>();
        for (Integer el : values) {
            if (el != -1) {
                set.add(el);
            }
        }
        return set.size() == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        while (scanner.hasNextInt()) {
            values.add(scanner.nextInt());
        }
        scanner.close();
        boolean result = isSingleValuedBinaryTree(values);
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}