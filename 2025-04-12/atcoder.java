import java.util.Scanner;

public class atcoder {

    // Task A - Status Code
    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        scan.close();
        if (s >= 200 && s <= 299) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }

    // Task B - Unauthorized
    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isLogin = false;
        int count = 0;
        for (int i = 0; i < n; i++) {
            String operation = scan.next();
            switch (operation) {
                case "login":
                    isLogin = true;
                    break;
                case "logout":
                    isLogin = false;
                    break;
                case "private":
                    if (!isLogin) {
                        count++;
                    }
                    break;
                case "public":
                    break;
            }
        }
        scan.close();
        System.out.println(count);
    }
}