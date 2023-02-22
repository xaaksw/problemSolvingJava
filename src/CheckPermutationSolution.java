import java.util.HashSet;

public class CheckPermutationSolution {

    public static void main(String[] args) {
        var word1 = "abc";
        var word2 = "cba";
        var result = checkPermutation(word1,word2);
        System.out.println(result);
    }

    public static Boolean checkPermutation(String word1 , String word2){

        if (word1.length() != word2.length()) return false;

        HashSet<Character> charSet = new HashSet<>();
        Integer containsCounter=0;

        for (int i = 0 ; i<word1.length(); i++){
            charSet.add(word1.charAt(i));
        }

        for (int i = 0 ; i<word2.length(); i++){
            if (charSet.contains(word2.charAt(i))) containsCounter+=1;
        }

        return containsCounter == charSet.size();
    }
}
