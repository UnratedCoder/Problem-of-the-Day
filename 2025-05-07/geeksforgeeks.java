import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void collectPaths(Node root, ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            paths.add(new ArrayList<>(path));
        } else {
            collectPaths(root.left, paths, path);
            collectPaths(root.right, paths, path);
        }
        path.remove(path.size() - 1);
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        collectPaths(root, paths, path);
        return paths;
    }
}