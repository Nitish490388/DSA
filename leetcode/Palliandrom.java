package leetcode;

public class Palliandrom {
  public static void main(String[] args) {
    System.out.println(isPalindrome(2322));
  }

  static boolean isPalindrome(int x) {
    String s = Integer.toString(x);
    int i = 0, j = s.length() - 1;

    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
