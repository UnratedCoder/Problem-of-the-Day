public class code360 {

	// Problem of the Day (Easy)
	public static String isPossible(String str, int n) {
		// Write your code here.
		int x = 0;
		int y = 0;
		int dir = 0;
		int dx[] = { 0, 1, 0, -1 };
		int dy[] = { 1, 0, -1, 0 };
		for (char ch : str.toCharArray()) {
			if (ch == 'L') {
				dir = (dir + 3) % 4;
			} else if (ch == 'R') {
				dir = (dir + 1) % 4;
			} else {
				x += dx[dir];
				y += dy[dir];
			}
		}
		return (x == 0 && y == 0) || (dir != 0) ? "True" : "False";
	}
}