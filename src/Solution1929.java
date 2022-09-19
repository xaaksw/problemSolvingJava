import java.util.Arrays;

public class Solution1929 {
    public static void main(String[] args) {
        int nums [] = {1,3,2,1};
        int [] res = getConcatenation(nums);
        System.out.println(Arrays.toString(res));
        //output = [1, 3, 2, 1, 1, 3, 2, 1]
    }
    public static int[] getConcatenation(int[] nums) {

        int n = nums.length ;
        int ans [] = new int [2*n];
        for (int i = 0; i < n; i++){
            ans[i] = nums [i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
