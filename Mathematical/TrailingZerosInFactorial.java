import java.util.Scanner;

public class TrailingZerosInFactorial {

    public int calculateTrailingZeros(int num){

        int count = 0;

        for(int i = 5; i <= num; i = i * 5){

            count = count + (num / i);

        }
        return count;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        TrailingZerosInFactorial tf = new TrailingZerosInFactorial();

        int result = tf.calculateTrailingZeros(num);
        System.out.println("Number of Zeros in factorial : " + result);
    }
}
