package Java.Basics;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.printf("GCD Between 12 and 4 is: " + gcd(12, 4));
    }
}
