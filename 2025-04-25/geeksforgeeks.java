public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    static int majorityElement(int arr[]) {
        // code here
        int element = 0;
        int count = 0;
        for (int el : arr) {
            if (count == 0) {
                count++;
                element = el;
            } else if (element == el) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int el : arr) {
            count += element == el ? 1 : 0;
        }
        if (count > arr.length / 2) {
            return element;
        }
        return -1;
    }
}