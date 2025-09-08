import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static class Pair {
		int price;
		int quentity;

		Pair(int price, int quentity) {
			this.price = price;
			this.quentity = quentity;
		}
	}

	public static int max_shares(int k, int n, int[] shares) {

		// Write your Code here
		List<Pair> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new Pair(shares[i], i + 1));
		}
		list.sort((a, b) -> a.price - b.price);
		int totalShares = 0;
		for (Pair p : list) {
			if (k == 0) {
				break;
			}
			int sell = k / p.price;
			int buy = Math.min(p.quentity, sell);
			totalShares += buy;
			k -= buy * p.price;
		}
		return totalShares;
	}
}