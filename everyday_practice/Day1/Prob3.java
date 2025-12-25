import java.util.Arrays;

public class Prob3 {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] { 1, 2, 2, 3, 3, 4, 5 }));
    }

    public static int removeDuplicates(int[] nums) {
        int temp = nums[0];
        int i = 1;
        int j = 1;
        while (i < nums.length) {
            if (nums[i] != temp) {
                nums[j++] = nums[i];
                temp = nums[i];
            }
            i++;
        }
        return j;
    }
}
