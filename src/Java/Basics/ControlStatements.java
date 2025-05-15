package Java.Basics;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If-else
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // Switch-case
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            // ... other cases
            default: System.out.println("Invalid day");
        }

        // Loops
        // While
        int i = 1;
        while(i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        // Do-while
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while(j <= 5);

        // For
        for(int k = 1; k <= 5; k++) {
            System.out.print(k + " ");
        }

        // Break and continue
        for(int m = 1; m <= 10; m++) {
            if(m == 5) break;
            if(m % 2 == 0) continue;
            System.out.print(m + " ");
        }

        // Infinite loop
        // 1. while(true) infinite loop
        System.out.println("Countdown with while(true) infinite loop (press Ctrl+C to stop):");
        int count = 5;
        while(true) {  // Infinite loop
            System.out.println(count);
            count--;
            if(count < 0) {
                break;  // We can break out when condition met
            }
            try {
                Thread.sleep(1000);  // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 2. for(;;) infinite loop
        System.out.println("\nCountdown with for(;;) infinite loop:");
        count = 3;
        for(;;) {  // Infinite loop
            System.out.println(count);
            count--;
            if(count < 0) {
                break;  // Exit condition
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 3. Practical use case - simple menu system
        System.out.println("\nSimple Menu System (enter 'q' to quit):");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("q")) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.println("You entered: " + input);
            // Process other commands here...
        }
        scanner.close();
    }
}
