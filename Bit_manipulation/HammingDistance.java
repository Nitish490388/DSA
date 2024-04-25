package Bit_manipulation;

public class HammingDistance {
  
  public static void main(String[] args) {
    System.out.println(hammingDistance(1,4));
  }
   
  public static int hammingDistance(int x, int y) {
    int j= 1, count = 0;
    for(int i=0 ; i<32 ; i++) {
      if(((x&j)!=0 && (y&j)==0 ) || ((x&j)==0 && (y&j)!=0)) {
        count ++;
        
      }
      j <<= 1;
    }
    return count;
  }
}
