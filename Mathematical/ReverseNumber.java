import java.util.Scanner;

public class ReverseNumber {

    public static void reverseNum(int num) {
        int ReqReverseNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            ReqReverseNum = (ReqReverseNum * 10) + lastDigit;
        }
        System.out.println("Reverse of is " + ReqReverseNum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        ReverseNumber.reverseNum(num);
    }

}
