import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    class Node implements Comparable<Node> {
        int val;
        int row;
        int col;

        Node(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }

        public int compareTo(Node temp) {
            return this.val - temp.val;
        }
    }

    public ArrayList<Integer> findSmallestRange(int[][] arr) {
        // code here
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            pq.add(new Node(arr[i][0], i, 0));
            max = Math.max(max, arr[i][0]);
        }
        int min = Integer.MAX_VALUE;
        int minEl = -1;
        int maxEl = -1;
        while (true) {
            Node curr = pq.poll();
            int minVal = curr.val;
            if (max - minVal < min) {
                min = max - minVal;
                minEl = minVal;
                maxEl = max;
            }
            if (curr.col + 1 == arr[0].length) {
                break;
            }
            int next = arr[curr.row][curr.col + 1];
            pq.add(new Node(next, curr.row, curr.col + 1));
            max = Math.max(max, next);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(minEl);
        ans.add(maxEl);
        return ans;
    }
}