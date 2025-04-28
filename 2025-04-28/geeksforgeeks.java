import java.util.*;

public class geeksforgeeks {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // GeeksforGeeks Problem (Problem of the Day)
    public int getMaxSumUtil(Node root, HashMap<Node, Integer> map) {
        if (root == null) {
            return 0;
        }
        if (map.containsKey(root)) {
            return map.get(root);
        }
        int include = root.data;
        if (root.left != null) {
            include += getMaxSumUtil(root.left.left, map) + getMaxSumUtil(root.left.right, map);
        }
        if (root.right != null) {
            include += getMaxSumUtil(root.right.left, map) + getMaxSumUtil(root.right.right, map);
        }
        int exclude = getMaxSumUtil(root.left, map) + getMaxSumUtil(root.right, map);
        map.put(root, Math.max(include, exclude));
        return map.get(root);
    }

    public int getMaxSum(Node root) {
        // code here
        HashMap<Node, Integer> map = new HashMap<>();
        return getMaxSumUtil(root, map);
    }
}