package String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        Map<Character, String> mapping = new HashMap<>();
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");

        generateCombinations(result, mapping, digits, new StringBuilder(), 0);

        return result;
    }

    private static void generateCombinations(List<String> result, Map<Character, String> mapping, String digits,
            StringBuilder combination, int index) {
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = mapping.get(digit);

        for (char letter : letters.toCharArray()) {
            combination.append(letter);
            generateCombinations(result, mapping, digits, combination, index + 1);
            combination.deleteCharAt(combination.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digits1 = "23";
        String digits2 = "";
        String digits3 = "2";

        System.out.println("Digits " + digits1 + ": " + letterCombinations(digits1));
        System.out.println("Digits " + digits2 + ": " + letterCombinations(digits2));
        System.out.println("Digits " + digits3 + ": " + letterCombinations(digits3));
    }
}
