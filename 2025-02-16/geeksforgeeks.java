import java.util.*;

public class geeksforgeeks {

    public class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public void serializePreorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            list.add(-1);
            return;
        }
        list.add(root.data);
        serializePreorder(root.left, list);
        serializePreorder(root.right, list);
    }

    public Node deserserializePreorder(int idx[], ArrayList<Integer> list) {
        if (list.get(idx[0]) == -1) {
            idx[0]++;
            return null;
        }
        Node newNode = new Node(list.get(idx[0]));
        idx[0]++;
        newNode.left = deserserializePreorder(idx, list);
        newNode.right = deserserializePreorder(idx, list);
        return newNode;
    }

    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        serializePreorder(root, list);
        return list;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        int idx[] = { 0 };
        return deserserializePreorder(idx, arr);
    }
};