public class geeksforgeeks {

    public void DFS(int image[][], int x, int y, int oldColor, int newColor) {
        if (x < 0 || x >= image.length || y < 0 || y >= image[0].length || image[x][y] != oldColor) {
            return;
        }
        image[x][y] = newColor;
        DFS(image, x + 1, y, oldColor, newColor);
        DFS(image, x - 1, y, oldColor, newColor);
        DFS(image, x, y + 1, oldColor, newColor);
        DFS(image, x, y - 1, oldColor, newColor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        if (image[sr][sc] == newColor) {
            return image;
        }
        DFS(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
}