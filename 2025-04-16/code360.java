import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>(n);
		int suf[] = new int[n];
		suf[n - 1] = elements.get(n - 1);
		for (int i = n - 2; i >= 0; i--) {
			suf[i] = Math.max(suf[i + 1], elements.get(i));
		}
		for (int i = 0; i < n - 1; i++) {
			if (elements.get(i) > suf[i + 1]) {
				list.add(elements.get(i));
			}
		}
		list.add(elements.get(n - 1));
		return list;
	}

	// 6-Month Code Marathon - 1 (Day 31)
	public static int assignCookie(int[] greed, int[] size) {
		// Write your code here.
		Arrays.sort(greed);
		Arrays.sort(size);
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < greed.length && j < size.length) {
			if (greed[i] <= size[j]) {
				count++;
				i++;
				j++;
			} else if (greed[i] > size[j]) {
				j++;
			}
		}
		return count;
	}
}