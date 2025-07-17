import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<ArrayList<Integer>> primeFactors(int num) {
        ArrayList<ArrayList<Integer>> factors = new ArrayList<>();
        int count = 0;
        while (num % 2 == 0) {
            num /= 2;
            count++;
        }
        if (count > 0) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(2);
            pair.add(count);
            factors.add(pair);
        }
        for (int i = 3; i * i <= num; i += 2) {
            count = 0;
            while (num % i == 0) {
                num /= i;
                count++;
            }
            if (count > 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(count);
                factors.add(pair);
            }
        }
        if (num > 1) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(num);
            pair.add(1);
            factors.add(pair);
        }
        return factors;
    }

    public int maxKPower(int n, int k) {
        // code here
        ArrayList<ArrayList<Integer>> factors = primeFactors(k);
        int result = Integer.MAX_VALUE;
        for (ArrayList<Integer> factor : factors) {
            int prime = factor.get(0);
            int freq = factor.get(1);
            int count = 0;
            for (int i = 1; i <= n; i++) {
                int x = i;
                while (x % prime == 0) {
                    count++;
                    x /= prime;
                }
            }
            result = Math.min(result, count / freq);
        }
        return result;
    }
}