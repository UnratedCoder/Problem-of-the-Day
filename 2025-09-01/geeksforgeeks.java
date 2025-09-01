import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int sumOfModes(int[] arr, int k) {
        // code here
        int n = arr.length;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        TreeSet<int[]> tree = new TreeSet<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            }
        });
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            tree.add(new int[] { x.getValue(), -x.getKey() });
        }
        int mode = -tree.last()[1];
        sum += mode;
        for (int i = k; i < n; i++) {
            int out = arr[i - k];
            int in = arr[i];
            int outFreq = map.get(out);
            tree.remove(new int[] { outFreq, -out });
            map.put(out, outFreq - 1);
            if (map.get(out) > 0) {
                tree.add(new int[] { map.get(out), -out });
            } else {
                map.remove(out);
            }
            map.put(in, map.getOrDefault(in, 0) + 1);
            tree.add(new int[] { map.get(in), -in });
            mode = -tree.last()[1];
            sum += mode;
        }
        return sum;
    }
}