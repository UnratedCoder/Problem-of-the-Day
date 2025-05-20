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

    public static int findDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int left = findDepth(root.left);
        int right = findDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public static int findNode(Node root, int target, int ans[]) {
        if (root == null) {
            return -1;
        }
        if (root.data == target) {
            int depth = findDepth(root) - 1;
            ans[0] = Math.max(ans[0], depth);
            return 1;
        }
        int left = findNode(root.left, target, ans);
        if (left != -1) {
            int depth = findDepth(root.right);
            ans[0] = Math.max(ans[0], left + depth);
            return left + 1;
        }
        int right = findNode(root.right, target, ans);
        if (right != -1) {
            int depth = findDepth(root.left);
            ans[0] = Math.max(ans[0], right + depth);
            return right + 1;
        }
        return -1;
    }

    public static int minTime(Node root, int target) {
        // code here
        int ans[] = { 0 };
        findNode(root, target, ans);
        return ans[0];
    }
}