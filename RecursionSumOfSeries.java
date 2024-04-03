import java.util.Scanner;

public class RecursionSumOfSeries {

    private static Scanner sc = new Scanner(System.in);

    public static double findSeriesSum(int num) {
        if (num == 1) {
            return 1.0;
        } else {
            return findSeriesSum(num - 1) + Math.pow(-1, num -1) / num;
        }
    }
    public static void main(String[] args) {

        System.out.print("\nEnter Number    :   ");
        int num = sc.nextInt();

        double sum = findSeriesSum(num);
        System.out.println("Sum of the series: " + sum);
    }
}
