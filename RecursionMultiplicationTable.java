import java.util.Scanner;

public class RecursionMultiplicationTable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("\nEnter Number    :   ");
        int num = sc.nextInt();
     
        System.out.println("Multiplication table of " + num + ":");
        printMultiplicationTable(num, 1);
    }

    public static void printMultiplicationTable(int num, int i) {
        if (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            printMultiplicationTable(num, i + 1);
        }
    }
}
