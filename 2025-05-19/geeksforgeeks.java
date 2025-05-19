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

    public Node rightMost(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    public Node leftMost(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        Node predecessor = null;
        Node successor = null;
        Node curr = root;
        while (curr != null) {
            if (curr.data < key) {
                predecessor = curr;
                curr = curr.right;
            } else if (curr.data > key) {
                successor = curr;
                curr = curr.left;
            } else {
                if (curr.left != null) {
                    predecessor = rightMost(curr.left);
                }
                if (curr.right != null) {
                    successor = leftMost(curr.right);
                }
                break;
            }
        }
        ArrayList<Node> ans = new ArrayList<>();
        ans.add(predecessor);
        ans.add(successor);
        return ans;
    }
}