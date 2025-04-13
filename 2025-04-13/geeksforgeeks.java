import java.util.*;

public class geeksforgeeks {

    // GfG 160 - 160 Days of Problem Solving (Day 150)
    static void DFS(ArrayList<String> account, String email, Set<String> visited, Map<String, ArrayList<String>> adj) {
        visited.add(email);
        account.add(email);
        for (String el : adj.getOrDefault(email, new ArrayList<>())) {
            if (!visited.contains(el)) {
                DFS(account, el, visited, adj);
            }
        }
    }

    static ArrayList<ArrayList<String>> accountsMerge(
            ArrayList<ArrayList<String>> accounts) {
        // code here
        Map<String, ArrayList<String>> adj = new HashMap<>();
        Set<String> visited = new HashSet<>();
        for (ArrayList<String> el : accounts) {
            String firstMail = el.get(1);
            for (int j = 2; j < el.size(); j++) {
                String email = el.get(j);
                adj.computeIfAbsent(firstMail, k -> new ArrayList<>()).add(email);
                adj.computeIfAbsent(email, k -> new ArrayList<>()).add(firstMail);
            }
        }
        ArrayList<ArrayList<String>> account = new ArrayList<>();
        for (ArrayList<String> el : accounts) {
            String accName = el.get(0);
            String firstMail = el.get(1);
            if (!visited.contains(firstMail)) {
                ArrayList<String> acc = new ArrayList<>();
                acc.add(accName);
                DFS(acc, firstMail, visited, adj);
                account.add(acc);
            }
        }
        return account;
    }

    // Problem Of The Day
    class Node {
        int val;
        ArrayList<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, ArrayList<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }

    Node cloneGraph(Node node) {
        // code here
        if (node == null) {
            return null;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        Node clone = new Node(node.val);
        map.put(node, clone);
        q.offer(node);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            for (Node neighbor : curr.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val));
                    q.offer(neighbor);
                }
                map.get(curr).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);
    }
}