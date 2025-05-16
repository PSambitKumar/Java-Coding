package Java.Basics;

public class SwapNumbers {

    public void SwapNumber() {
        // Method 1: Using temporary variable
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);

        // Method 2: Without temporary variable
        int c = 6, d = 12;
        System.out.println("Before swap: c = " + c + ", d = " + d);
         c = c + d;
         d = c - d;
         c = c - d;
        System.out.println("After swap: c = " + c + ", d = " + d);
    }
}
