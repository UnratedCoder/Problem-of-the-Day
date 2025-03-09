import java.util.ArrayList;

public class code360 {

	// POTD
	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
		// Write your code here.
		int x[] = { -1, 1, 0, 0 };
		int y[] = { 0, 0, -1, 1 };
		int sum = 0;
		for (int i = 0; i < mat.size(); i++) {
			for (int j = 0; j < mat.get(0).size(); j++) {
				if (mat.get(i).get(j) == 0) {
					int count = 0;
					for (int k = 0; k < 4; k++) {
						int X = i + x[k];
						int Y = j + y[k];
						if (X >= 0 && X < mat.size() && Y >= 0 && Y < mat.get(0).size()) {
							if (mat.get(X).get(Y) == 1) {
								count++;
							}
						}
					}
					sum += count;
				}
			}
		}
		return sum;
	}
}