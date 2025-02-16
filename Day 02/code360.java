import java.util.*;

public class code360 {

    // Problem 1
    public static int isSorted(int n, int[] a) {
        // Write your code here.
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                return 0;
            }
        }
        return 1;
    }

    // Problem 2
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        // Write your code here.
        int si = m + 1;
        int ei = arr.size() - 1;
        while (si < ei) {
            int temp = arr.get(si);
            arr.set(si, arr.get(ei));
            arr.set(ei, temp);
            si++;
            ei--;
        }
    }

    // Problem 3
    public static int reverseNumber(int n) {
        // Write your code here
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // Problem 4
    public static int countDigits(int n) {
        // Write your code here.
        int num = n;
        int count = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0 && num % lastDigit == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    // Problem 5
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int largest = Integer.MIN_VALUE;
        for (int el : arr) {
            if (largest < el) {
                largest = el;
            }
        }
        return largest;
    }

    // Problem 6
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int ans[] = new int[2];
        int s = Integer.MAX_VALUE;
        int ss = -1;
        int l = Integer.MIN_VALUE;
        int sl = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] < s) {
                ss = s;
                s = a[i];
            } else if (a[i] > s && a[i] < ss) {
                ss = a[i];
            }
            if (a[i] > l) {
                sl = l;
                l = a[i];
            } else if (a[i] < l && a[i] > sl) {
                sl = a[i];
            }
        }
        ans[0] = sl;
        ans[1] = ss;
        return ans;
    }

    // Problem 7
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        // Write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(arr);
        ans.add(arr.get(k - 1));
        ans.add(arr.get(n - k));
        return ans;
    }
}