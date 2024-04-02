import java.util.Scanner;

/* Fibonacci Series : 0 1 1 2 3 5 8 13 21 34  */

public class RecursionFibonacci {

    public static void fibonacciSeries(int num) {

        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number    : ");
        int num = sc.nextInt();

        fibonacciSeries(num);

        sc.close();
    }
}
