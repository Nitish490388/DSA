
// https://leetcode.com/problems/happy-number/description/
import java.util.HashSet;

public class Happy_numer {
  public static void main(String[] args) {
    System.out.println(isHappy(24));
  }

  static boolean isHappy(int num) {
    if (num == 1)
      return true;

    HashSet<Integer> hs = new HashSet<>();
    hs.add(num);
    while(true) {
      num = helper(num);
      if(num == 1) return true;
      if(hs.contains(num)) return false;
      hs.add(num);
    }
  }

  static int helper(int n) {
    int res = 0;
    int reminder;
    while (n > 0) {
      reminder = n % 10;
      res += Math.pow(reminder, 2);
      n /= 10;
    }
    return res;
  }
}
