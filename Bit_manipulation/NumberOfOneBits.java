package Bit_manipulation;

public class NumberOfOneBits {
  public static void main(String[] args) {
    System.out.println(hammingWeight(-3));
  }

  public static int hammingWeight(long n) {
    int count = 0;
    for (int i = 0; i < 32; i++) {
      if ((n & (1 << i)) != 0) {
        count++;
      }
    }
    return count;
  }
}
