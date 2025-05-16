package Java.Basics;

import java.util.stream.IntStream;

public class PrimeNumber {

//    Check Number is Prime using Basic
    public static boolean isPrimeBasic(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

//    Check Number is Prime using Java 8
    public static boolean isPrimeJava8(int number) {
        return number > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .noneMatch(i -> number % i == 0);
    }

//    Print Prime Upto 100 Using Basic
    public void printPrimes1() {
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }

//    Print Prime Upto 100 using java 8
    public static void printPrimes2() {
        IntStream.rangeClosed(2, 100)
                .filter(n -> isPrime(n))
                .forEach(n -> System.out.print(n + " "));
    }

    private static boolean isPrime(int number) {
        return number > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .noneMatch(i -> number % i == 0);
    }
}
