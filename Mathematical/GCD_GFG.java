public class GCD_GFG {

    // public static int gcd(int a, int b) {

    // int minNum = Math.min(a, b);

    // while (minNum > 0) {

    // if (a % minNum == 0 && b % minNum == 0) {
    // break;
    // }
    // minNum--;
    // }
    // return minNum;
    // }
    //-------------------------------------------------

    // public static int gcd(int a, int b) {

    // while (a != b) {

    // if (a > b) {
    // a = a - b;
    // } else {
    // b = b - a;
    // }
    // }
    // return a;
    // }
    //-------------------------------------------------


    public static int gcd(int a, int b) {

        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    } //optimized

    public static void main(String[] args) {

        int a = 7;
        int b = 13;

        int result = GCD_GFG.gcd(a, b);

        System.out.println("GCD : " + result);

    }
}
