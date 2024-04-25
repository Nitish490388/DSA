package Bit_manipulation;

// https://www.geeksforgeeks.org/problems/faithful-numbers0014/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

public class FaithfulGFG {
  public static void main(String[] args) {
    System.out.println(answer(7));
  }

  static Long answer(int n) {

    long pow = 1, ans = 0;
    while(n != 0) {
      if((int) (n & 1) == 1)
      ans += pow;
      n >>= 1;
      pow *= 7;
    }
    return ans;
  }
}
