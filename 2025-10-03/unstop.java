import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    static int countUniqueNumbers(int[] arr) {
        // Write your logic here.
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int num : freqMap.keySet()) {
            maxHeap.offer(num);
        }
        int uniqueCount = 0;
        while (!maxHeap.isEmpty()) {
            int current = maxHeap.poll();
            int count = freqMap.getOrDefault(current, 0);
            if (count == 0) {
                continue;
            }
            if (count == 1) {
                uniqueCount++;
                freqMap.remove(current);
                int half = current / 2;
                if (half > 0) {
                    freqMap.put(half, freqMap.getOrDefault(half, 0) + 1);
                    maxHeap.offer(half);
                }
            } else {
                freqMap.remove(current);
            }
        }
        return uniqueCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call user logic function and print the output
        int result = countUniqueNumbers(arr);
        System.out.println(result);
    }
}
