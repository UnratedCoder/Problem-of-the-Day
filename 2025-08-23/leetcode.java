import java.util.*;

public class leetcode {

    // LeetCode Problem
    public class Pair implements Comparable<Pair> {
        String name;
        int height;

        Pair(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public int compareTo(Pair p) {
            return p.height - this.height;
        }
    }

    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < names.length; i++) {
            pq.add(new Pair(names[i], heights[i]));
        }
        int idx = 0;
        while (!pq.isEmpty()) {
            names[idx++] = pq.remove().name;
        }
        return names;
    }
}
