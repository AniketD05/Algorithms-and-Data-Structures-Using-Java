public class AutomorphicNumberOrNot {

    static boolean isAutomorphic(int number) {

        int square = number * number;

        int originalDigits = String.valueOf(number).length();

        int lastDigits = square % (int) Math.pow(10, originalDigits);

        return lastDigits == number;
    }

    public static void main(String[] args) {
        int num = 76;
        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");
        }
    }
}
