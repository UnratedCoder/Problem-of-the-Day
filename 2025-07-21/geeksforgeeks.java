import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    void computeMobius(int n, int mobius[]) {
        int isPrime[] = new int[n + 1];
        Arrays.fill(isPrime, 1);
        mobius[0] = 0;
        mobius[1] = 1;
        for (int i = 2; i <= n; ++i) {
            if (isPrime[i] == 1) {
                for (int j = i; j <= n; j += i) {
                    mobius[j] *= -1;
                    isPrime[j] = 0;
                }
                for (int j = i * i; j <= n; j += i * i) {
                    mobius[j] = 0;
                }
            }
        }
    }

    void buildFreq(int arr[], int freq[]) {
        for (int el : arr) {
            freq[el]++;
        }
    }

    void computeDivCount(int max, int freq[], int div[]) {
        for (int i = 1; i <= max; ++i) {
            for (int j = i; j <= max; j += i) {
                div[i] += freq[j];
            }
        }
    }

    int cntCoprime(int[] arr) {
        // code here
        int max = Arrays.stream(arr).max().getAsInt();
        int freq[] = new int[max + 1];
        int div[] = new int[max + 1];
        int mobius[] = new int[max + 1];
        Arrays.fill(mobius, 1);
        buildFreq(arr, freq);
        computeDivCount(max, freq, div);
        computeMobius(max, mobius);
        int result = 0;
        for (int i = 1; i <= max; ++i) {
            if (mobius[i] == 0 || div[i] < 2)
                continue;
            int pairs = (int) (div[i] * (div[i] - 1)) / 2;
            result += mobius[i] * pairs;
        }
        return result;
    }
}