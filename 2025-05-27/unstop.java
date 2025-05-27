import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int getEnergy(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (ch - 'a') + 1;
        } else {
            return (ch - '0') * 10;
        }
    }

    public static void collapseChain(String s) {
        /* Write your logic here. */
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Integer> energyStack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            int energy = getEnergy(ch);
            if (!energyStack.isEmpty() && energyStack.peek() == energy) {
                stack.pop();
                energyStack.pop();
            } else {
                stack.push(ch);
                energyStack.push(energy);
            }
        }
        if (stack.isEmpty()) {
            System.out.println("-1");
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeLast());
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();
        collapseChain(s);
    }
}