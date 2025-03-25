public class leetcode {

    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isDigit = false;
        boolean isSpecial = false;
        for (int i = 0; i < password.length(); i++) {
            if (i < password.length() - 1 && password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
            char ch = password.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                isLowerCase = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                isUpperCase = true;
            } else if (ch >= '0' && ch <= '9') {
                isDigit = true;
            } else if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                isSpecial = true;
            }
        }
        return password.length() >= 8 && isLowerCase && isUpperCase && isDigit && isSpecial;
    }
}
