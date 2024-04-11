package Mathematical;

/* This program is related to the generation of Fibonacci numbers. 
For example: 0, 1, 1, 2, 3, 5, 8, 13,... is a Fibonacci sequence
 where 13 id the 8th Fibonacci number. 

Sample Input 0
1
Sample Output 0
0
Sample Input 1
2
Sample Output 1
1
 */

import java.util.Scanner;

public class RecursionFibonacci2 {
   public static int FibSeries(int num){
    
        if(num == 1){
            return 0;
        }else if(num == 2){
            return 1;
        }
         return FibSeries(num -1) + FibSeries(num-2);
    }

       
    public static void main(String[] args) {
       
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.print(RecursionFibonacci2.FibSeries(num));
        sc.close();
    }
}
