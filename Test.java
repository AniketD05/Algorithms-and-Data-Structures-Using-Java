import java.util.Scanner;

public class Test {

    public static  int factOfNum(int num) {

        if (num == 0) {
            return 1;
        } else {
            return factOfNum(num - 1) * num;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.println(factOfNum(num));
    }
}
