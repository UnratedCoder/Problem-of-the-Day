import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public static String binary(int n) {
        int binNum = 0;
        int pow = 0;
        while (n > 0) {
            int remainder = n % 2;
            binNum += remainder * Math.pow(10, pow);
            pow++;
            n /= 2;
        }
        return Integer.toString(binNum);
    }

    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            list.add(binary(i));
        }
        return list;
    }
}