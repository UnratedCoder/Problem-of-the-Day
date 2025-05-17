import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int x3 = scan.nextInt();
        scan.close();
        int arr[] = { x1, x2, x3 };
        Arrays.sort(arr);
        int meetingpoint = arr[1];
        int totalDist = Math.abs(arr[0] - meetingpoint) + Math.abs(arr[1] - meetingpoint)
                + Math.abs(arr[2] - meetingpoint);
        System.out.println(totalDist);
    }
}