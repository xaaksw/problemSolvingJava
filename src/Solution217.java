import java.util.HashMap;

public class Solution217 {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        // hashmap for the duplicates
        // iterate over the seq every item
        // get the item from the map
        // if not exists append with value 1
        // all elements should be >= 2 to return true else false is returned.
        // if exisits append with value = pastvalue + 1

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num)) return true;
            map.put(num,1);
        }
        return false;

    }
}
