package Java.Basics;

import java.util.stream.Stream;

public class FibonacciSeries {

/*
    Methos 1 Using Iterative:
    Key Notes:
    Time Complexity:
    O(n): Linear time complexity
    The loop runs exactly n times
    Each iteration performs constant time operations (addition, assignment, print)

    Space Complexity:
    O(1): Constant space complexity
    Uses a fixed number of variables (firstTerm, secondTerm, nextTerm, i)
    Memory usage doesn't grow with input size n
*/

    public void fibonacciMethod1() {
        int n = 10; // Number of terms
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

//    Method 2 Using Recurssive:
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public void fibonacciMethod2() {
        int n = 10;

        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

//    Method 4 Using Dynamic Programming:
    public void fibonacciMethod4() {
        int n = 10;
        int[] fib = new int[n+2];
        fib[0] = 0;
        fib[1] = 1;

        System.out.println("Fibonacci Series: ");
        System.out.print(fib[0] + " " + fib[1] + " ");

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.print(fib[i] + " ");
        }
    }

//    Method 5 Using Space-Optimized DP (O(1) space):
    public void fibonacciMethod5() {
        int n = 10;
        int a = 0, b = 1, c;

        System.out.println("Fibonacci Series (Space Optimized):");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

//    Method 6 Using Binet's Formula (Mathematical Approach):
    static int fibBinet(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }

    public void fibonacciMethod6() {
        int n = 10;

        System.out.println("Fibonacci Series (Binet's Formula):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibBinet(i) + " ");
        }
    }

//    Method 7 Using Java 8 Streams:
    public void fibonacciMethod8() {
        int n = 10;

        System.out.println("Fibonacci Series (Java 8 Stream):");
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(n)
                .map(t -> t[0])
                .forEach(num -> System.out.print(num + " "));
    }
}
