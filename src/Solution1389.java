import java.util.ArrayList;

public class Solution1389 {

    public static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> res=new ArrayList<>();
        int[] ans=new int[nums.length];
        int i = 0 ;
        while(i<nums.length){
            res.add(index[i],nums[i]);
            i++;
        }
        for(int j=0;j<res.size();j++)  ans[j]=res.get(j);
        return ans;

    }

}
