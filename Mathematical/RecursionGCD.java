package Mathematical;
import java.util.Scanner;

public class RecursionGCD {

    private static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("\nEnter Number    :   ");
        int num = sc.nextInt();
        System.out.println("\nFormula for GCD of " + num + " integers: " + " " + getGCDFormula(num) + "\n");
    }

    public static String getGCDFormula(int num) {
        if (num == 1) {
            return "int";
        } else {
            return "gcd(int, " + getGCDFormula(num - 1) + ")";
        }
    }
}
