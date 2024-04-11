package Mathematical;
public class AmicableNumbersOrNot {

    static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean areAmicable(int num1, int num2) {

        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        return sum1 == num2 && sum2 == num1 && num1 != num2;
    }

    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284;

        if (areAmicable(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
        }
    }
}
