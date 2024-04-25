/**
 * https://leetcode.com/problems/power-of-four/description/
 */
public class Power_of_four {

  public static void main(String[] args) {
    System.out.println(isPowerof4(256));
  } 

  
  static boolean isPowerof4(int num) {
    if(num == 0) return false;
    if(num < 0) num = 0-num;
    System.out.println(num);
    //int digits = ((int) ((Math.log(num)) / Math.log(2)) + 1);

    if(((num & (num - 1)) == 0) && ((num%3) == 1)) return true;
    return false;
  }
}