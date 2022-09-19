public class Solution2011 {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0 ;

        for(String s : operations){
            if(s.equalsIgnoreCase("x++") || s.equalsIgnoreCase("++x")){
                x+=1;
            }
            else if (s.equalsIgnoreCase("x--") || s.equalsIgnoreCase("--x")){
                x-=1;
            }
        }
        return x;
    }
}
