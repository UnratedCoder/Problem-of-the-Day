public class code360 {

	// Coding Interview Questions
	public static String isPrime(int num) {
		// Your code goes here
		if (num <= 1)
			return "NO";
		if (num == 2)
			return "YES";
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return "NO";
		}
		return "YES";
	}
}