public class leetcode {

    // Weekly Contest 445
    public int findClosest(int x, int y, int z) {
        if ((Math.abs(z - x) == Math.abs(z - y))) {
            return 0;
        } else if (Math.abs(z - x) < Math.abs(z - y)) {
            return 1;
        } else {
            return 2;
        }
    }
}
