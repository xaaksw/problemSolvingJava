public class Solution1470 {

    public int[] shuffle(int[] nums, int n) {

        int result [] = new int [nums.length];
        int xIndex = 0;
        int yIndex=n;

        for(int index = 0 ; index <nums.length;index= index+2){
            result[index] = nums[xIndex];
            result[index+1] = nums[yIndex];
            xIndex++;
            yIndex++;
        }
        return result;
    }
}
