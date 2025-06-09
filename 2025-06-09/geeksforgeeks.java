public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public boolean DFS(Node root, int min, int max) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && min == max) {
            return true;
        }
        return DFS(root.left, min, root.data - 1) || DFS(root.right, root.data + 1, max);
    }

    public boolean isDeadEnd(Node root) {
        // Code here.
        return DFS(root, 1, Integer.MAX_VALUE);
    }
}