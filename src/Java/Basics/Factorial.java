package Java.Basics;

import java.util.stream.LongStream;

public class Factorial {

//    Calculate Factorial of A Number Using Basic
    public static long factorialBasic(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

//    Calculate Factorial of A Number Using Recursive
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        return n <= 1 ? 1 : n * factorialRecursive(n - 1);
    }

//    Calculate Factorial of A Number Using Java8
    public static long factorialJava8(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        return LongStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }
}
