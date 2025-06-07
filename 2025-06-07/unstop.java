import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int userLogic(int[][] maze) {
        // User will implement the logic here
        int count = 0;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] > 0) {
                    count += maze[i][j];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] maze = new int[N][M];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                maze[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        // Call user logic function and print the output
        int result = userLogic(maze);
        System.out.println(result);
        scanner.close();
    }
}