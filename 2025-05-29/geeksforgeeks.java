import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    class Node {
        int data;
        Node left, right;

        Node(int x) {
            data = x;
            left = right = null;
        }
    }

    public int sumOfLongRootToLeafPath(Node root) {
        // code here
        if (root == null) {
            return 0;
        }
        int maxSum = 0;
        int maxLen = 0;
        Queue<Object[]> q = new LinkedList<>();
        q.add(new Object[] { root, root.data, 1 });
        while (!q.isEmpty()) {
            Object[] front = q.poll();
            Node node = (Node) front[0];
            int sum = (int) front[1];
            int len = (int) front[2];
            if (node.left == null && node.right == null) {
                if (len > maxLen) {
                    maxLen = len;
                    maxSum = sum;
                } else if (len == maxLen && sum > maxSum) {
                    maxSum = sum;
                }
            }
            if (node.left != null) {
                q.add(new Object[] { node.left, sum + node.left.data, len + 1 });
            }
            if (node.right != null) {
                q.add(new Object[] { node.right, sum + node.right.data, len + 1 });
            }
        }
        return maxSum;
    }
}