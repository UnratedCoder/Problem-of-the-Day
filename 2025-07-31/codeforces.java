import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int s = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 9; i >= 1; i--) {
                if (s >= i) {
                    list.add(i);
                    s -= i;
                }
            }
            Collections.sort(list);
            for (int el : list) {
                System.out.print(el + "");
            }
            System.out.println();
        }
    }
}