public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int max = 0;
        for (int el : arr) {
            max = Math.max(max, el);
        }
        boolean visited[] = new boolean[max + 1];
        for (int el : arr) {
            visited[el] = true;
        }
        for (int i = 1; i <= max; i++) {
            if (!visited[i]) {
                continue;
            }
            for (int j = 1; j <= max; j++) {
                if (!visited[j]) {
                    continue;
                }
                int hypo = (int) Math.sqrt(i * i + j * j);
                if ((hypo * hypo) != (i * i + j * j) || hypo > max) {
                    continue;
                }
                if (visited[hypo]) {
                    return true;
                }
            }
        }
        return false;
    }
}