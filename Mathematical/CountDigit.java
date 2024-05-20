import java.util.Scanner;

public class CountDigit {

    public static int Dcount(int num){

        // int count = 0;
        // while(num > 0){
        //     count++;
        //      num = num/10;
        // }
        // System.out.println("Count is: " + count);

        int count = (int) (Math.log10(num) + 1);
        return count;
    }
    
    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num  = sc.nextInt();

        //CountDigit.Dcount(num);

        System.out.println("count is " + CountDigit.Dcount(num));

        sc.close();
    }
}
