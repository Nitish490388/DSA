package Bit_manipulation;

/**
 * Number_of_complement
 */
public class Number_of_complement {

  public static void main(String[] args) {
    System.out.println(findComplement(5));
  }

  public static int findComplement(int num) {
    int ans = 0, temp = 1;
    while (num>0) {
      
      if((num & 1)==0) {
        ans+=temp;
      }
      num >>= 1;
      temp <<= 1;
    }
    return ans;
  }
}