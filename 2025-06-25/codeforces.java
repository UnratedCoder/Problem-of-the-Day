import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> programmers = new ArrayList<>();
        ArrayList<Integer> mathematicians = new ArrayList<>();
        ArrayList<Integer> sportsMen = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int ti = scan.nextInt();
            if (ti == 1) {
                programmers.add(i);
            } else if (ti == 2) {
                mathematicians.add(i);
            } else if (ti == 3) {
                sportsMen.add(i);
            }
        }
        int maxTeam = Math.min(programmers.size(), Math.min(mathematicians.size(), sportsMen.size()));
        System.out.println(maxTeam);
        for (int i = 0; i < maxTeam; i++) {
            System.out.println(programmers.get(i) + " " + mathematicians.get(i) + " " + sportsMen.get(i));
        }
        scan.close();
    }
}