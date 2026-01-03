package Recursion;

public class Practice {

    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4, -22};
        printArray(arr, 0);
        System.out.println("Printingmax:"+ findMaxElement(arr, 0, arr[0]));
        System.out.println(checkSorted(arr, 1));

        String s = "Nitish";
        System.out.println(new String(reverse(s.toCharArray(), 0, s.length()-1)));
    }

    // Print array
    static void printArray(int[] arr, int i) {
        if(i == arr.length) return;
        System.out.println(arr[i]);
        printArray(arr, i+1);
    }

    // Find max element
    static int findMaxElement(int arr[], int i, int max) {
        if(i== arr.length - 1) return max;

        max = Math.max(max, findMaxElement(arr, i+1, arr[i+1]));

        return max;
    }

    // Check if array is sorted
    static boolean checkSorted (int arr[], int i) {
        if(arr[i]<arr[i-1]) {
            return false;
        } 

        if(i==arr.length-1) return true;
        return checkSorted(arr, i+1);
    }

    // Reverse a string

    static char[] reverse(char[] s, int left, int right) {
        if(left>=right) return s;

        // Swap left right

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        return reverse(s, left+1, right-1);

    }
}