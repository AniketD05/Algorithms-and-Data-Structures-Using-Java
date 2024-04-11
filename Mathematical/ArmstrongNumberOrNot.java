package Mathematical;
public class ArmstrongNumberOrNot {

    static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
