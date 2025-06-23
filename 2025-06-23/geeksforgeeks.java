public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    String addString(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += s1.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += s2.charAt(j) - '0';
            }
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.reverse();
        return sb.length() == 0 ? "0" : sb.toString();
    }

    String minSum(int[] arr) {
        // code here
        int[] count = new int[10];
        for (int el : arr) {
            count[el]++;
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean firstNum = true;
        for (int i = 0; i < 10; i++) {
            while (count[i]-- > 0) {
                if (firstNum) {
                    if (!(sb1.length() == 0 && i == 0)) {
                        sb1.append(i);
                    }
                    firstNum = false;
                } else {
                    if (!(sb2.length() == 0 && i == 0)) {
                        sb2.append(i);
                    }
                    firstNum = true;
                }
            }
        }
        if (sb1.length() == 0) {
            sb1.append("0");
        }
        if (sb2.length() == 0) {
            sb2.append("0");
        }
        return addString(sb1.toString(), sb2.toString());
    }
}