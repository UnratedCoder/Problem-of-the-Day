import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int calculateMinMoves(int[] seats, int[] students) {
        // Write your logic here.
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        for (int i = 0; i < seats.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }
        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seats = new int[n];
        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }
        sc.close();
        int result = calculateMinMoves(seats, students);
        System.out.println(result);
        sc.close();
    }
}