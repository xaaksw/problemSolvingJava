public class Solution1672 {
    public static void main(String[] args) {
        int accounts [][] = {{1,2,3} , {3,2,1}};
        int result = maximumWealth(accounts);
        System.out.println(result); // should be 6
    }
    public static int maximumWealth(int[][] accounts) {

        int result = 0 ;
        for(int [] account : accounts){

            int accSum = 0 ;
            for(int i : account){
                accSum+=i;
            }

            if(accSum > result) result = accSum;
        }
        return result ;
    }
}
