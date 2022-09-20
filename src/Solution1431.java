import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
    public static void main(String[] args) {

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for(int candi : candies) {
            if(candi > max) max = candi;
        }

        for(int candi : candies) {
            if(candi + extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return result;
    }

}
