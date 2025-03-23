public class leetcode {

    public int maxContainers(int n, int w, int maxWeight) {
        int cells = n * n;
        int weight = cells * w;
        if (weight <= maxWeight) {
            return cells;
        }
        return maxWeight / w;
    }
}
