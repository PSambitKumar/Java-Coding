package Java.Basics;

public class FloydsTriangle {
    public static void printFloydsTriangle(int rows) {
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        System.out.println("Floyd's Triangle with " + rows + " rows:");
        printFloydsTriangle(rows);
    }
}
