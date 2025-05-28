import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static void setMatrixOnes(ArrayList<ArrayList<Integer>> MAT, int n, int m) {
		// Write your code here.
		int col0 = 0;
		for (int i = 0; i < n; i++) {
			if (MAT.get(i).get(0) == 1) {
				col0 = 1;
			}
			for (int j = 1; j < m; j++) {
				if (MAT.get(i).get(j) == 1) {
					MAT.get(i).set(0, 1);
					MAT.get(0).set(j, 1);
				}
			}
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (MAT.get(i).get(0) == 1 || MAT.get(0).get(j) == 1) {
					MAT.get(i).set(j, 1);
				}
			}
		}
		if (MAT.get(0).get(0) == 1) {
			for (int j = 0; j < m; j++) {
				MAT.get(0).set(j, 1);
			}
		}
		if (col0 == 1) {
			for (int i = 0; i < n; i++) {
				MAT.get(i).set(0, 1);
			}
		}
	}

	// 6-Month Code Marathon - 1 (Day 68)
	public static int[] nextGreaterElement(int[] arr, int n) {
		// Write your code here.
		Stack<Integer> s = new Stack<>();
		int nge[] = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			while (!s.isEmpty() && s.peek() <= arr[i]) {
				s.pop();
			}
			nge[i] = s.isEmpty() ? -1 : s.peek();
			s.push(arr[i]);
		}
		return nge;
	}
}