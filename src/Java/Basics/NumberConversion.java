package Java.Basics;

public class NumberConversion {
    public static String decimalToBinary(int num) {
        return Integer.toBinaryString(num);
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String decimalToHex(int num) {
        return Integer.toHexString(num).toUpperCase();
    }

    public static void main(String[] args) {
        int decimalNumber = 42; // Example decimal number

        // Decimal to Binary
        String binary = decimalToBinary(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " in binary: " + binary);

        // Binary to Decimal
        int convertedDecimal = binaryToDecimal(binary);
        System.out.println("Binary " + binary + " in decimal: " + convertedDecimal);

        // Decimal to Hexadecimal
        String hex = decimalToHex(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " in hexadecimal: " + hex);

        // Verification
        System.out.println("\nVerification:");
        System.out.println("Original decimal: " + decimalNumber);
        System.out.println("Binary -> Decimal: " + convertedDecimal);
        System.out.println("Are they equal? " + (decimalNumber == convertedDecimal));
    }
}
