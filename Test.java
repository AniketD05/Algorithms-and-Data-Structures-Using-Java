
import java.util.Scanner;

public class Test {

    public static int gcd(int num1, int num2) {

        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }

    public static int lcm(int gcd, int num1, int num2) {

        return (num1 * num2) / gcd;
       
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        int result = gcd(num1, num2);

        int lcm = lcm(result, num1, num2);

        System.out.println(lcm);

        sc.close();
    }
}