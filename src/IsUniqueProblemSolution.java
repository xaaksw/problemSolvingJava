import java.util.HashMap;

public class IsUniqueProblemSolution {

//    Implement an algorithm to determine if a string has all unique characters. What if you
//    cannot use additional data structures?

    public static void main(String[] args) {
        var inputString = "ahmeda";
        var result = isUnique(inputString);
        System.out.println(result);
    }

    public static Boolean isUnique(String input){
        HashMap<Character,Integer> chars = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (chars.containsKey(input.charAt(i))){
                return false;
            }
            chars.put(input.charAt(i),1);
        }
        return true;
    }
}
