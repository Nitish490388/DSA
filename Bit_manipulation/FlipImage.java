package Bit_manipulation;

// https://leetcode.com/problems/flipping-an-image/description/
public class FlipImage {
  public static void main(String[] args) {
    int img1[][] = {
        { 1, 0, 1 },
        { 1, 1, 1 },
        { 0, 0, 1 }
    };
    
    int [][] twoDArray = flipAndInvertImage(img1);
    for (int i = 0; i < twoDArray.length; i++) {
      for (int j = 0; j < twoDArray[i].length; j++) {
        System.out.print(twoDArray[i][j] + " ");
      }
      System.out.println(); // Move to the next row
    }
  }

  public static int[][] flipAndInvertImage(int[][] image) {
    for (int[] row : image) {
      for (int i = 0; i < (image[0].length + 1) / 2; i++) {
        int temp = row[i] ^ 1;
        row[i] = row[image[0].length - i - 1] ^ 1;
        row[image[0].length - i - 1] = temp;
      }
    }
    return image;
  }
}
