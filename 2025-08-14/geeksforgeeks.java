import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int merging(int arr[], int low, int mid, int high) {
        int count = 0, j = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (j <= high && arr[i] > 2L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        List<Integer> list = new ArrayList<>();
        int left = low, right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left++]);
            } else {
                list.add(arr[right++]);
            }
        }
        while (left <= mid) {
            list.add(arr[left++]);
        }
        while (right <= high) {
            list.add(arr[right++]);
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
        return count;
    }

    public int mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = low + (high - low) / 2;
        int count = mergeSort(arr, low, mid) + mergeSort(arr, mid + 1, high) + merging(arr, low, mid, high);
        return count;
    }

    public int countRevPairs(int[] arr) {
        // code here
        return mergeSort(arr, 0, arr.length - 1);
    }
}