package Mathematical;
import java.util.Scanner;

public class IterationReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a word: ");
        String input = scanner.nextLine();
       
        System.out.println("\nReversed word: " + reverseWord(input));
        System.out.println();
        scanner.close();
    }

    public static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
