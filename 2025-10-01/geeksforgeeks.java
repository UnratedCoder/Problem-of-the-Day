import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    static void backtrack(int arr[], boolean visited[], ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result) {
        if (curr.size() == arr.length) {
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] || (i > 0 && arr[i] == arr[i - 1] && !visited[i - 1])) {
                continue;
            }
            visited[i] = true;
            curr.add(arr[i]);
            backtrack(arr, visited, curr, result);
            curr.remove(curr.size() - 1);
            visited[i] = false;
        }
    }

    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        boolean visited[] = new boolean[arr.length];
        backtrack(arr, visited, curr, result);
        return result;
    }
}