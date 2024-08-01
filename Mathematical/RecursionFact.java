
import java.util.Scanner;

public class RecursionFact {

    // public static int factorialOfNumber(int num){

    // if(num <= 1){
    // return num;
    // }else{
    // return factorialOfNumber(num - 1) * num;
    // }
    // }

    public static boolean factorialOfNumber(int num) {

        if (num == 1)
            return false;

        // if (num == 2 || num == 3)
        //     return true;

        // if (num % 2 == 0 || num % 3 == 0)
        //     return false;

        for (int i = 2; i <= num; ++i) {

            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number    : ");
        int num = sc.nextInt();

        // System.out.println("Factorial of " + num + " : " +
        // RecursionFact.factorialOfNumber(num));
        boolean result = RecursionFact.factorialOfNumber(num);

        if (result) {
            System.out.println("Yes number is prime");
        } else {
            System.out.println("No Number is not Prime");
        }
        sc.close();
    }
}