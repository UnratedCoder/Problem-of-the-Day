import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int place = 1;
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    list.add(digit * place);
                }
                n /= 10;
                place *= 10;
            }
            System.out.println(list.size());
            for (int el : list) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}