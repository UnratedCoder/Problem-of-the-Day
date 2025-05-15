import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int[] replaceElement(int arr[]) {
        int n = arr.length;
        int maxElement = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];
            arr[i] = maxElement;
            if (curr > maxElement) {
                maxElement = curr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        int ngn[] = replaceElement(a);
        for (int el : ngn) {
            System.out.print(el + " ");
        }
    }
}