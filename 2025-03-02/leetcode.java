import java.util.*;

public class leetcode {

    // Weekly Contest 439
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            for (Integer val : set) {
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }
        int largest = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                largest = Math.max(largest, entry.getKey());
            }
        }
        return largest;
    }

    // POTD
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i][0], map.getOrDefault(nums1[i][0], 0) + nums1[i][1]);
        }
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i][0], map.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }
        int ans[][] = new int[map.size()][2];
        int idx = 0;
        for (Integer key : map.keySet()) {
            ans[idx][0] = key;
            ans[idx++][1] = map.get(key);
        }
        Arrays.sort(ans, Comparator.comparingDouble(a -> a[0]));
        return ans;
    }
}
