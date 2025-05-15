package Java.Basics;

public class Operators {
    public static void main(String[] args) {
        // Ternary operator
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);

        // & vs &&
        if (false & (1/0 == 0)) {} // Throws ArithmeticException
        // if (false && (1/0 == 0)) {} // No exception (short-circuit)
    }
}
