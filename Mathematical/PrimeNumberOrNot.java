package Mathematical;
import java.util.Scanner;

public class PrimeNumberOrNot {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = inp.nextInt();

        int isPrime = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                isPrime++;
            }

        }

        if (isPrime == 2) {

            System.out.println("The enterd number is " + number + " and " + " IT IS A 'PRIME NUMBER!' ");

        } else {
            System.out.println("The enterd number is " + number + " and " + " IT IS 'NOT' A 'PRIME NUMBER!'' ");
        }

        inp.close();

    }

}
