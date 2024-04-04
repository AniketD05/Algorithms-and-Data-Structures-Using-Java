public class RamanujamsNumberOrNot {

    static boolean isRamanujan(int number) {
        int limit = (int) Math.cbrt(number);

        for (int i = 1; i <= limit; i++) {
            for (int j = i + 1; j <= limit; j++) {
                int sumOfCubes = (int) (Math.pow(i, 3) + Math.pow(j, 3));
                if (sumOfCubes == number) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int num = 1729;
        if (isRamanujan(num)) {
            System.out.println(num + " is a Ramanujan's number.");
        } else {
            System.out.println(num + " is not a Ramanujan's number.");
        }
    }
}
