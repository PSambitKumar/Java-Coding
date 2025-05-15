package Java.Basics;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive data types
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.4028235E38f;
        double d = 1.7976931348623157E308;
        char c = 'A';
        boolean bool = true;

        // Type casting
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Explicit casting
        System.out.println(myInt);  // Outputs: 9
    }
}
