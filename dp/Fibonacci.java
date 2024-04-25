package dp;

import java.util.Arrays;
import java.util.Date;

public class Fibonacci {

  public static void main(String[] args) {
    System.out.println(new Date());
    cal(20);
    System.out.println(new Date());

  }

  static void cal(int n) {
    int[] arr = new int[n + 1];
    Arrays.fill(arr, -1);
    int ans = fibonacci(n, arr);
    System.out.println(ans);
  }

  static int fibonacci(int n, int[] arr) {
    if (n <= 1) {
      return n;
    }

    if (arr[n] != -1)
      return arr[n];
    return arr[n] = fibonacci(n - 1, arr) + fibonacci(n - 2, arr);
  }
}
