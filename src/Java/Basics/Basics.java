package Java.Basics;

public class Basics {
    public static void main(String[] args) {
        // == vs equals()
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
