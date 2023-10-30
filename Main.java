import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print Statement
        System.out.printf("\n\nWelcome to Angelo's largest of three program!\n\n");

        // Variable Declaration Section
        String userName = "";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;

        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Use the scanner object to get the user's name
        // Prompt the user for userName
        System.out.println("\nPlease enter your name: ");
        // Store userName into the variable named 'userName'
        userName = scanner.nextLine();

        // Output user name
        System.out.println("\n The username is: " + userName);

        // Get the ints from the user
        // Prompt for the first int
        System.out.println("\n Enter number one: ");
        num1 = scanner.nextInt();

        // Output num1
        System.out.println("\n You entered: " + num1 + " for the first number.");

        // Prompt for the second int
        System.out.println("\n Enter number two: ");
        num2 = scanner.nextInt();

        // Output num2
        System.out.println("\n You entered: " + num2 + " for the second number.");

        // Prompt for the third int
        System.out.println("\n Enter number three: ");
        num3 = scanner.nextInt();

        // Output num3
        System.out.println("\n You entered: " + num3 + " for the third number.");

        // Output all nums
        System.out.println("\n You entered: " + num1 + ", " + num2 + ", " + num3);

        // To find the largest with nested if statements
        if (num1 > num2 & num1 > num3) {
            largest = num1;
        }
        if (num2 > num1 & num2 > num3) {
            largest = num2;
        }
        if (num3 > num1 & num3 > num2) {
            largest = num3;
        }

        // Output which num is largest statement
        System.out.println("\n The largest of " + num1 + " , " + num2 + " , " + num3 + " is: " + largest);
    }
}