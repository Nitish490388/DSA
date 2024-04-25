
package Recursion;

import java.util.*;

public class Self_dividing {
  
  public static void main(String[] args) {
    System.out.println(selfDividingNumbers(47, 85).toString());
  }

  public static List<Integer> selfDividingNumbers(int left, int right) {
    ArrayList<Integer> list= new ArrayList<>();
    for(int i=left; i<=right; i++) {
      if(check(i)) list.add(i);
    }
    return list;
  }

  public static boolean check(int n) {
    int actualNum = n;
    int rem;
    while(n>0) {
      rem = n%10;
      if(rem == 0 || actualNum%rem != 0) return false;
      n/=10;
    }
    return true;
  }
}
