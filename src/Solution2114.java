public class Solution2114 {
    public static void main(String[] args) {
        String sentences [] = {"alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"};
        int result = mostWordsFound(sentences); // should be 6 ;
        System.out.println(result);
    }

    public static int mostWordsFound(String[] sentences) {
        // loop through every item in the list
        // split each item into list and get the length
        // update the max size
        int result = 0 ;
        for(String sentence : sentences){
            int numOfWords = sentence.split(" ").length;
            if(numOfWords > result) result = numOfWords;
        }
        return result ;
    }
}
