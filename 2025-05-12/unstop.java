import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> energy = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            energy.add(sc.nextInt());
        }

        List<Integer> power = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            power.add(sc.nextInt());
        }
        sc.close();

        int maxTasks = maximizeTasks(energy, power);
        System.out.println(maxTasks);
    }

    public static int maximizeTasks(List<Integer> energy, List<Integer> power) {
        // User will write the logic here
        Collections.sort(energy);
        Collections.sort(power);
        int i = 0;
        int j = 0;
        int complete = 0;
        while (i < energy.size() && j < power.size()) {
            if (energy.get(i) <= power.get(j)) {
                complete++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return complete;
    }
}