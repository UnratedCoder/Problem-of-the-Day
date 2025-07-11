import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int s4 = scan.nextInt();
        HashSet<Integer> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(4 - set.size());
    }
}