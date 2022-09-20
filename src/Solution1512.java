public class Solution1512 {
    public static void main(String[] args) {
        int nums [] = {1,2,3,1,1,3};
        int result = numIdenticalPairs(nums);
        System.out.println(result); // should be 4
    }
    public static int numIdenticalPairs(int[] nums) {

        int result = 0 ;
        for (int i = 0 ; i <nums.length ; i++){
            for (int j = i+1 ; j<nums.length;j++){
                if(nums[i] == nums[j]) result+=1;
            }
        }
        return result;
    }
}
