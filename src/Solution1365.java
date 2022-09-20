public class Solution1365 {

    public static void main(String[] args) {

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int result []= new int [nums.length];
        int numOfSmallers = 0 ;

        for(int i = 0 ; i<nums.length; i++){
            for (int j=0; j <nums.length; j++){
                if(nums[j] < nums[i]) numOfSmallers +=1;
            }
            result[i] = numOfSmallers;
            numOfSmallers = 0;
        }
        return result;
    }
}
