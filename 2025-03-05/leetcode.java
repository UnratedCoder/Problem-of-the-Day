public class leetcode {

    public long coloredCells(int n) {
        n--;
        return (((long) n * ((long) n + 1)) / 2) * 4 + 1;
    }
}
