
import java.util.Scanner;

public class RecursionReverseSentence {

    public static String reverseWord(String word) {
        if (word.isEmpty()) {
            return "";
        } else {

            return reverseWord(word.substring(1)) + word.charAt(0);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a word: ");
        String input = scanner.nextLine();

        System.out.println("\nReversed word: " + reverseWord(input));
        System.out.println();
        scanner.close();
    }

}
