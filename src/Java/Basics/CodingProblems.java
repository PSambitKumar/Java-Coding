package Java.Basics;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CodingProblems {
    public static void main(String[] args) {
        // 1. Even or Odd Check
        System.out.println("\n1. Even or Odd Check:");
        int num = 10;

        // Basic Java
        if(num % 2 == 0) {
            System.out.println("Basic: Even");
        } else {
            System.out.println("Basic: Odd");
        }

        // Java 8
        String result = IntStream.of(num)
                .mapToObj(n -> n % 2 == 0 ? "Java 8: Even" : "Java 8: Odd")
                .findFirst()
                .get();
        System.out.println(result);

        // 2. Factorial Calculation
        System.out.println("\n2. Factorial Calculation:");
        int n = 5;

        // Basic Java
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Basic: Factorial: " + fact);

        // Java 8
        long fact8 = LongStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Java 8: Factorial: " + fact8);

        // 3. Prime Number Check
        System.out.println("\n3. Prime Number Check:");
        int num2 = 17;

        // Basic Java
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(num2); i++) {
            if(num2 % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Basic: " + (isPrime ? "Prime" : "Not prime"));

        // Java 8
        boolean isPrime8 = num2 > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(num2))
                .noneMatch(i -> num2 % i == 0);
        System.out.println("Java 8: " + (isPrime8 ? "Prime" : "Not prime"));

        // 4. Fibonacci Series
        System.out.println("\n4. Fibonacci Series:");
        int terms = 10;

        // Basic Java
        System.out.print("Basic: Fibonacci: ");
        int t1 = 0, t2 = 1;
        for(int i = 1; i <= terms; i++) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();

        // Java 8
        System.out.print("Java 8: Fibonacci: ");
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(terms)
                .map(t -> t[0])
                .forEach(n2 -> System.out.print(n2 + " "));
        System.out.println();

        // 5. Palindrome Check
        System.out.println("\n5. Palindrome Check:");
        String str = "madam";

        // Basic Java
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Basic: " + (str.equals(rev) ? "Palindrome" : "Not palindrome"));

        // Java 8
        boolean isPalindrome = IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
        System.out.println("Java 8: " + (isPalindrome ? "Palindrome" : "Not palindrome"));

        // 6. Largest Among Three Numbers
        System.out.println("\n6. Largest Among Three Numbers:");
        int x = 10, y = 20, z = 15;

        // Basic Java
        int max = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("Basic: Max: " + max);

        // Java 8
        int max8 = Stream.of(x, y, z)
                .max(Integer::compare)
                .get();
        System.out.println("Java 8: Max: " + max8);

        // 7. Swap Without Temporary Variable
        System.out.println("\n7. Swap Without Temporary Variable:");
        int a = 5, b = 10;

        // Basic Java
        System.out.println("Basic: Before - a: " + a + ", b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Basic: After - a: " + a + ", b: " + b);

        // Java 8
        int[] nums = {5, 10};
        System.out.println("Java 8: Before - a: " + nums[0] + ", b: " + nums[1]);
        nums = new int[]{nums[1], nums[0]};
        System.out.println("Java 8: After - a: " + nums[0] + ", b: " + nums[1]);

        // 8. Pyramid Pattern
        System.out.println("\n8. Pyramid Pattern:");
        int rows = 5;

        // Basic Java
        System.out.println("Basic:");
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Java 8
        System.out.println("Java 8:");
        IntStream.rangeClosed(1, rows)
                .forEach(i -> {
                    System.out.print(" ".repeat(rows - i));
                    System.out.println("*".repeat(2 * i - 1));
                });
    }
}
