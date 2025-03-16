import java.util.*;

public class unstop {
    public static void validatePassword(List<Integer> password, String[] result, int[] mostFrequentElement) {
        // Write your logic here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer el : password) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        boolean isValid = true;
        boolean isAppear = false;
        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                isValid = false;
            }
            if (map.get(key) == 2) {
                isAppear = true;
            }
            if (max < map.get(key)) {
                max = map.get(key);
                mostFrequentElement[0] = key;
            } else if (max <= map.get(key)) {
                mostFrequentElement[0] = Math.min(key, mostFrequentElement[0]);
            }
        }
        result[0] = isValid && isAppear ? "VALID" : "INVALID";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> password = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            password.add(scanner.nextInt());
        }
        scanner.close();
        String[] validationResult = new String[1];
        int[] mostFrequentElement = new int[1];
        validatePassword(password, validationResult, mostFrequentElement);
        System.out.println(validationResult[0]);
        System.out.println(mostFrequentElement[0]);
    }
}