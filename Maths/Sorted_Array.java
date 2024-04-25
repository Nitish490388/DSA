

public class Sorted_Array {
  public static void main(String[] args) {
    int arr[] = {1,5,7,9,15, 15};
    System.out.println(isSorted(arr, 0));
  }

  static boolean isSorted(int[] arr, int index) {
    if(index == arr.length-2)
    return arr[index] <= arr[index+1];
    return arr[index] <= arr[index+1] && isSorted(arr, ++index);
  } 
}

