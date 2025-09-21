import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static void solveHanoi(int n, int from, int to, int aux, ArrayList<ArrayList<Integer>> result) {
		if (n == 0) {
			return;
		}
		solveHanoi(n - 1, from, aux, to, result);
		ArrayList<Integer> move = new ArrayList<>();
		move.add(from);
		move.add(to);
		result.add(move);
		solveHanoi(n - 1, aux, to, from, result);
	}

	public static ArrayList<ArrayList<Integer>> towerOfHanoi(int n) {
		// Write your code here.
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		solveHanoi(n, 1, 3, 2, result);
		return result;
	}
}