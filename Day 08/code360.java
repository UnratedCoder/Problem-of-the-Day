public class code360 {

  public static void rearrangeArray(int arr[], int n) {
    // Write your code here.
    int ans[] = arr.clone();
    for (int i = 0; i < n; i++) {
      arr[i] = ans[ans[i]];
    }
  }
}