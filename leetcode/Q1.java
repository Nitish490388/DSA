import java.util.HashMap;

class Q1 {
    
    public static void main(String[] args) {
        System.out.println(centeredSubarrays(new int[]{0,0,0,1}));
    }
    public static int centeredSubarrays(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i<nums.length; i++) {
            sum = 0;
            System.out.println("I: "+ i);
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(nums[i], 1);
            sum += nums[i];

            int j = i+1;
            while(j < nums.length) {
                System.out.println("J:"+ j);
                map.put(nums[j], 1);
                sum += nums[j];
                if(map.containsKey(sum)) {
                    count ++;
                }
                System.out.println("Count::"  + count);
                j++;
            }
            
        }

        return count + nums.length;
    }
}
