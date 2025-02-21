import java.util.HashMap;

public class code360 {

  // Problem 1
  public static int sumOfMaxMin(int[] arr, int n) {
    // Write your code here.
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int el : arr) {
      min = Math.min(min, el);
      max = Math.max(max, el);
    }
    return min + max;
  }

  // Problem 2
  public static String read(int n, int[] book, int target) {
    // Write your code here.
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int el : book) {
      if (map.containsKey(target - el)) {
        return "YES";
      }
      map.put(el, map.getOrDefault(el, 0) + 1);
    }
    return "NO";
  }
}