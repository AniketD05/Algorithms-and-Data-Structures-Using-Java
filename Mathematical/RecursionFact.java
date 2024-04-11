
import java.util.Scanner;

public class RecursionFact{


    public static int factorialOfNumber(int num){

        if(num <= 1){
            return num;
        }else{
            return factorialOfNumber(num - 1) * num;
        }
       
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number    : ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + "  : " + RecursionFact.factorialOfNumber(num));

        sc.close();
    }
}