import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<Integer> findGreater(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        int nge[] = new int[arr.length];
        Arrays.fill(nge, -1);
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && map.get(arr[i]) > map.get(arr[s.peek()])) {
                nge[s.pop()] = arr[i];
            }
            s.push(i);
        }
        for (int el : nge) {
            result.add(el);
        }
        return result;
    }
}