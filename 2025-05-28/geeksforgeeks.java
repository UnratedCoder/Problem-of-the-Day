import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean ValidCorner(int mat[][]) {
        // Code here
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length - 1; j++) {
                if (mat[i][j] == 0) {
                    continue;
                }
                for (int k = j + 1; k < mat[0].length; k++) {
                    if (mat[i][k] == 0) {
                        continue;
                    }
                    String vertex = j + "," + k;
                    if (set.contains(vertex)) {
                        return true;
                    }
                    set.add(vertex);
                }
            }
        }
        return false;
    }
}