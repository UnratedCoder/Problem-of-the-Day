import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<Integer> leafNodes(int[] preorder) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 0, j = 1; j < preorder.length; i++, j++) {
            boolean isFound = false;
            if (preorder[i] > preorder[j]) {
                s.push(preorder[i]);
            } else {
                while (!s.isEmpty()) {
                    if (preorder[j] > s.peek()) {
                        s.pop();
                        isFound = true;
                    } else {
                        break;
                    }
                }
            }
            if (isFound) {
                list.add(preorder[i]);
            }
        }
        list.add(preorder[preorder.length - 1]);
        return list;
    }
}