public class geeksforgeeks {

    public class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node LCA(Node root, Node n1, Node n2) {
        // code here
        if (root == null || root.data == n1.data || root.data == n2.data) {
            return root;
        }
        Node leftLCA = LCA(root.left, n1, n2);
        Node rightLCA = LCA(root.right, n1, n2);
        if (leftLCA == null) {
            return rightLCA;
        }
        if (rightLCA == null) {
            return leftLCA;
        }
        return root;
    }
}