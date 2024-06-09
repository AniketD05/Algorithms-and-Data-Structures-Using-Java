import java.util.Scanner;

public class SumOfNaturalNo {

    

    public static void SumOfN_NaturalNo(int num) {

        int sum = num * (num + 1) / 2;
        System.out.println("sum is " + sum);
    }
    

    // public static void SumOfN_NaturalNo(int num) {

    // int sum = 0;

    // for (int i = 1; i <= num; i++) {

    // sum = sum + i;
    // }
    // System.out.println("Sum of " + num + " natural numbers is " + sum);
    // }


    // public static void SumOfN_NaturalNo(int num){

    // int sum = 0;

    // while(num > 0){
    // sum = sum + num;
    // num--;
    // }
    // System.out.println("sum is " + sum);
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        SumOfNaturalNo.SumOfN_NaturalNo(num);

    }
}
