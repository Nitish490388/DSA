package Bit_manipulation;

public class Reverse_Bits {

  public static void main(String[] args) {
    System.out.println(reverseBits(10));
  }

  public static int reverseBits(int n) {
    int len = 32 - Integer.toBinaryString(n).length();

    char[] charArr = Integer.toBinaryString(n).toCharArray();

    int ans = 0, tempAns = 1 << len;
    for (char c : charArr) {
      if (c == '1') {
        ans += tempAns;
        tempAns *= 2;
      } else {
        tempAns *= 2;
      }
    }
    return ans;
  }
}
