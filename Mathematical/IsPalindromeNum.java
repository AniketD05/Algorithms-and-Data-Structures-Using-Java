import java.util.Scanner;

public class IsPalindromeNum {

    public static void checkPalindrome(int num) {

        int reverseNum = 0;
        int lastDigit;
        int dupNum = num;

        while (num > 0) {
            lastDigit = num % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            num = num / 10;
        }

        if (reverseNum == dupNum) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number    : ");
        int num = sc.nextInt();

        IsPalindromeNum.checkPalindrome(num);

    }
}
