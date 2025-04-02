import java.util.*;;

public class leetcode {

    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0;
        int y = 0;
        for (String el : commands) {
            if (el.equals("RIGHT")) {
                x++;
            } else if (el.equals("DOWN")) {
                y++;
            } else if (el.equals("UP")) {
                y--;
            } else {
                x--;
            }
        }
        return (y * n) + x;
    }
}
