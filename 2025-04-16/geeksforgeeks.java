public class geeksforgeeks {

    // GfG 160 - 160 Days of Problem Solving (Day 153)
    public void floydWarshall(int[][] dist) {
        // Code here
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) {
                for (int k = 0; k < dist.length; k++) {
                    dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
                }
            }
        }
    }
}