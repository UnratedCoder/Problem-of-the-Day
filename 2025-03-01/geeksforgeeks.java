public class geeksforgeeks {

    static String decodeString(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                sb.append(s.charAt(i));
            } else {
                StringBuilder temp = new StringBuilder();
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) != '[') {
                    temp.insert(0, sb.charAt(sb.length() - 1));
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.deleteCharAt(sb.length() - 1);
                StringBuilder num = new StringBuilder();
                while (sb.length() > 0 && Character.isDigit(sb.charAt(sb.length() - 1))) {
                    num.insert(0, sb.charAt(sb.length() - 1));
                    sb.deleteCharAt(sb.length() - 1);
                }
                int curr = Integer.parseInt(num.toString());
                for (int j = 0; j < curr; j++) {
                    sb.append(temp.toString());
                }
            }
        }
        return sb.toString();
    }
}