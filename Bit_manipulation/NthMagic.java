package Bit_manipulation;

/**
 * NthMagic
 */
public class NthMagic {

  public static void main(String[] args) {
    System.out.println(ans(7));
  }

  public static int ans(int n) {
    int pow = 1, ans = 0;
    while (n != 0) {
      pow *= 5;
      if ((int) (n & 1) == 1) {
        ans += pow;
      }
      n >>= 1;
    }
    return ans;
  }
}