package Java;

public class Armstrong {

//    Check Number Is Armstrong Using Basic
    public static boolean isArmstrongBasic(int number) {
        if (number < 0) return false;

        int original = number;
        int sum = 0;
        int digits = (int) (Math.log10(number) + 1);

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == original;
    }

//    Check Number Is Armstrong Using Java 8
    public static boolean isArmstrongJava8(int number) {
        if (number < 0) return false;

        String numStr = Integer.toString(number);
        int length = numStr.length();

        int sum = numStr.chars()
                .map(Character::getNumericValue)
                .map(d -> (int) Math.pow(d, length))
                .sum();

        return sum == number;
    }
}
