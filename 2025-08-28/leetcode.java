import java.util.*;

public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int[][] sortMatrix(int[][] grid) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int key = i - j;
                map.putIfAbsent(key, key < 0 ? new PriorityQueue<>()
                        : new PriorityQueue<>(Collections.reverseOrder()));
                map.get(key).offer(grid[i][j]);
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int key = i - j;
                grid[i][j] = map.get(key).poll();
            }
        }
        return grid;
    }
}
