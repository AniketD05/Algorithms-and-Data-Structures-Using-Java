
public class GCDofTwoNumbers {

    
    static int gcd(int a, int b) {
        
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}
