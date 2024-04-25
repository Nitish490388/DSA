package Recursion;

import java.util.ArrayList;

public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = {1,4,64,76,345,66, 64};
    ArrayList<Integer> list = new ArrayList<>();
    // System.out.println(search(arr, 2, 0));
    System.out.println(occurance(arr, 64, 0, list).toString());
  }

  static int search(int[] arr, int target, int index) {
    if(arr[index] == target) return index;
    if(index == arr.length-1) return -1;
    return search(arr, target, ++index);
    
  }

  static ArrayList<Integer> occurance(int[] arr, int target, int index, ArrayList<Integer> ar) {
    if(arr[index] == target) ar.add(index);
    if(index == arr.length-1) return ar;
    return occurance(arr, target, ++index, ar);
    
  }
}
