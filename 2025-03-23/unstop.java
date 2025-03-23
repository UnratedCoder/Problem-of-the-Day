import java.util.*;

public class unstop {
    public static List<Boolean> canPaySalaries(int companyMoney, List<String> employeeNames,
            List<Integer> employeeSalaries) {
        // Write your logic here.
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < employeeSalaries.size(); i++) {
            if (companyMoney >= employeeSalaries.get(i)) {
                ans.add(true);
                companyMoney -= employeeSalaries.get(i);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int companyMoney = sc.nextInt();
        @SuppressWarnings("unused")
        int employeeCount = sc.nextInt();
        sc.nextLine();
        sc.close();
        List<String> employeeNames = Arrays.asList(sc.nextLine().split(" "));
        List<Integer> employeeSalaries = new ArrayList<>();
        for (String s : sc.nextLine().split(" ")) {
            employeeSalaries.add(Integer.parseInt(s));
        }
        List<Boolean> result = canPaySalaries(companyMoney, employeeNames, employeeSalaries);
        for (Boolean b : result) {
            System.out.print(b + " ");
        }
    }
}