import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int findMinorityElementIndex(int N, int[] nums) {
        // Write your logic here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int size = list.size();
        int medFreq = 0;
        if (size % 2 == 1) {
            medFreq = list.get(size / 2);
        } else {
            medFreq = (list.get(size / 2 - 1) + list.get(size / 2)) / 2;
        }
        int minDiff = Integer.MAX_VALUE;
        int choose = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            int val = map.get(key);
            int diff = Math.abs(val - medFreq);
            if (diff < minDiff || (diff == minDiff && key < choose)) {
                minDiff = diff;
                choose = key;
            }
        }
        for (int i = 0; i < N; i++) {
            if (nums[i] == choose) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMinorityElementIndex(N, nums);
        System.out.println(result);
    }
}
