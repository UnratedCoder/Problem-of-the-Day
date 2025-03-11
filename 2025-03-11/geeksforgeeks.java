public class geeksforgeeks {

    int countWays(int n) {
        // your code here
        int temp1 = 1;
        int temp2 = 1;
        for (int i = 2; i <= n; i++) {
            int temp = temp1 + temp2;
            temp2 = temp1;
            temp1 = temp;
        }
        return temp1;
    }
}