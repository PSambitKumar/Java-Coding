package Java.Basics;

import static Java.Basics.GreatestCommonDivisor.gcd;

public class LeastCommonMultiple {
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.printf("Least Common Multiple Between 12 and 4 is: " + lcm(12, 4));
    }
}
