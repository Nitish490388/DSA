public class Prob1 {

    // https://leetcode.com/problems/valid-palindrome/

    public static void main(String[] args) {
        System.out.println(isPalindrome("ab_*a"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) ||
                    (ch >= '0' && ch <= '9')) {

                sb.append(ch);
            }
        }

        System.out.println(sb);
        return isPali(sb.toString());
    }

    public static boolean isPali(String s) {
        int i = 0;
        int j = s.length()-1;
        int count = 0;
        while (i < j) {
            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                count++;
            }
            i++;
            j--;
        }

        if (count == s.length() / 2) {
            return true;
        }
        return false;
    }
}
