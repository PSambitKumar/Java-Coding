package Java.Basics;

import java.util.stream.IntStream;

public class Palindrome  {
//    Check  Number is Palindrome or Not Using Basic:
    public static boolean isNumberPalindromeBasic(int number) {
        if (number < 0) return false; // Negative numbers can't be palindromes
        int original = number;
        int reversed = 0;

        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        return original == reversed;
    }

//    Check Number is Palindrome or Not Using Java 8
    public  boolean isNumberPalindromeJava8(int number) {
        if (number < 0) return false;
        String numStr = Integer.toString(number);
        return IntStream.range(0, numStr.length() / 2)
                .allMatch(i -> numStr.charAt(i) == numStr.charAt(numStr.length() - i - 1));
    }

//    Check  String is Palindrome or Not Using Basic:
    public static boolean isPalindromeBasic(String str) {
        if (str == null) {
            return false;
        }
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

//    Check String is Palindrome or Not Using Java 8
    public static boolean isPalindromeJava8(String str) {
        if (str == null) {
            return false;
        }
        String cleanStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        return IntStream.range(0, cleanStr.length() / 2)
                .allMatch(i -> cleanStr.charAt(i) == cleanStr.charAt(cleanStr.length() - i - 1));
    }
}
