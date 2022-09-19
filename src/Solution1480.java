import java.util.Arrays;

public class Solution1480 {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4};
        int res [] = runningSum(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] runningSum(int[] nums) {

        int sum = 0 ;
        int result [] = new int[nums.length];

        for(int index = 0 ; index<nums.length ; index++){
            sum += nums[index];
            result[index] = sum;
        }

        return result;
    }
}
