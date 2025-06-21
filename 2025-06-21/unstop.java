import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static List<Map.Entry<String, Integer>> getJobSalaries(String companyName, int n, List<String> jobTitles,
            List<Integer> salaries) {
        List<Map.Entry<String, Integer>> jobSalaries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jobSalaries.add(new AbstractMap.SimpleEntry<>(jobTitles.get(i), salaries.get(i)));
        }
        jobSalaries.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        return jobSalaries;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String companyName = scanner.nextLine();
        int n = scanner.nextInt();
        List<String> jobTitles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jobTitles.add(scanner.next());
        }
        List<Integer> salaries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            salaries.add(scanner.nextInt());
        }
        List<Map.Entry<String, Integer>> jobSalaries = getJobSalaries(companyName, n, jobTitles, salaries);
        System.out.println(companyName);
        for (Map.Entry<String, Integer> jobSalary : jobSalaries) {
            System.out.println(jobSalary.getKey() + " --> " + jobSalary.getValue());
        }
        scanner.close();
    }
}