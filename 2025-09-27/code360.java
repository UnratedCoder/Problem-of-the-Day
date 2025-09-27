public class code360 {

	// Problem of the Day (Easy)
	public static int slotScore(String original, String guess) {
		// Write your code here.
		int n = 4, score = 0;
		boolean originalMatched[] = new boolean[n];
		boolean guessMatched[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (original.charAt(i) == guess.charAt(i)) {
				score += 2;
				originalMatched[i] = true;
				guessMatched[i] = true;
			}
		}
		for (int i = 0; i < n; i++) {
			if (!guessMatched[i]) {
				for (int j = 0; j < n; j++) {
					if (!originalMatched[j] && guess.charAt(i) == original.charAt(j)) {
						score += 1;
						originalMatched[j] = true;
						break;
					}
				}
			}
		}
		return score;
	}
}