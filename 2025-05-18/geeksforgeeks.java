import java.util.*;

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

    public ArrayList<Integer> findSpiral(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Deque<Node> dq = new ArrayDeque<>();
        dq.add(root);
        boolean reverse = true;
        while (!dq.isEmpty()) {
            int size = dq.size();
            while (size-- > 0) {
                if (reverse) {
                    Node curr = dq.removeLast();
                    ans.add(curr.data);
                    if (curr.right != null) {
                        dq.addFirst(curr.right);
                    }
                    if (curr.left != null) {
                        dq.addFirst(curr.left);
                    }
                } else {
                    Node curr = dq.removeFirst();
                    ans.add(curr.data);
                    if (curr.left != null) {
                        dq.addLast(curr.left);
                    }
                    if (curr.right != null) {
                        dq.addLast(curr.right);
                    }
                }
            }
            reverse = !reverse;
        }
        return ans;
    }
}