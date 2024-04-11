
import java.util.Scanner;

/* Fibonacci Series : 0 1 1 2 3 5 8 13 21 34  */


public class IterationFibonacci {
    
    public static int fibonacciSeries(int num){

        if(num <= 1){
            return num;
        }else{
            return fibonacciSeries(num - 1) + fibonacciSeries(num - 2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number  :   ");
        int num = sc.nextInt();

        System.out.println(fibonacciSeries(num));

       for(int i = 0; i < num; i++){
           System.out.print(fibonacciSeries(i) + " ");
       }

        sc.close();
    }
}
