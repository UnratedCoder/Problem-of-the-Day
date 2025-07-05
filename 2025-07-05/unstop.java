import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static List<Integer> checkRightSide(List<Integer> arr, int n) {
        // Write your logic here.
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        for (Integer el : arr) {
            if (map.get(el) == 1) {
                map.remove(el);
                result.add(-1);
            } else {
                map.put(el, map.get(el) - 1);
                result.add(1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        List<Integer> result = checkRightSide(arr, n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}