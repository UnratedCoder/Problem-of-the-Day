import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int findMinorityElement(List<Integer> nums) {
        // User should write their logic here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        int ans = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        for (Integer key : map.keySet()) {
            if (minFreq > map.get(key)) {
                minFreq = map.get(key);
                ans = key;
            } else if (minFreq == map.get(key)) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            nums.add(sc.nextInt());
        }
        int minority_element = findMinorityElement(nums);
        System.out.println(minority_element);
    }
}