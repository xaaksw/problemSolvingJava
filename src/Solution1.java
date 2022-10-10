import java.util.HashMap;

public class Solution1 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        // map to pick the pos
        // check if the element (target - curr element) exists or not
        // if exisist in the map retrun the value and the current index
        // if not move to the next element

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0 ; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int [] {i, map.get(diff)};
            }
            map.put(nums[i],i);
        }
        return new int [] {};
    }
}
