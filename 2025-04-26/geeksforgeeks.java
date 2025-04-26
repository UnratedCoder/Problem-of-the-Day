import java.util.*;

public class geeksforgeeks {

    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    // GeeksforGeeks Problem (Problem of the Day)
    boolean isHeap(Node tree) {
        // code here
        Queue<Node> q = new LinkedList<>();
        q.add(tree);
        boolean flag = false;
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp.left != null) {
                if (flag || temp.left.data > temp.data) {
                    return false;
                }
                q.add(temp.left);
            } else {
                flag = true;
            }
            if (temp.right != null) {
                if (flag || temp.right.data > temp.data) {
                    return false;
                }
                q.add(temp.right);
            } else {
                flag = true;
            }
        }
        return true;
    }
}