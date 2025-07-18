public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    int lcmTriplets(int n) {
        // code here
        int result;
        if (n < 3) {
            result = n;
        } else if (n % 2 != 0) {
            result = n * (n - 1) * (n - 2);
        } else if (n % 3 != 0) {
            result = n * (n - 1) * (n - 3);
        } else {
            result = (n - 1) * (n - 2) * (n - 3);
        }
        return result;
    }
}