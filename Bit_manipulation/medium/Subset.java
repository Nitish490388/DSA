package Bit_manipulation.medium;

import java.util.ArrayList;
import java.util.List;

public class Subset {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    List<List<Integer>> ll = subsets(nums);
    for (List<Integer> item : ll) {
      System.out.println(item);
    }
  }

  public static List<List<Integer>> subsets(int[] arr) {
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());
    for (int num : arr) {
      int n = outer.size();

      for (int j = 0; j < n; j++) {
        ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
        inner.add(num);
        outer.add(inner);
      }
    }
    return outer;
  }
}
