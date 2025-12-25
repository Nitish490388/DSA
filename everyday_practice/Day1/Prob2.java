import java.util.Arrays;

public class Prob2 {
    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3,5,25,75, 100, 120}, 100)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        int sum = 0;


        while(left<right) {
            sum = numbers[left]+numbers[right];

            if(sum==target) {
                return new int[] {left+1, right+1};
            }
            else if(sum < target) left++;
            else right--;

        }

        return new int[]{-1,-1};
    }

}
