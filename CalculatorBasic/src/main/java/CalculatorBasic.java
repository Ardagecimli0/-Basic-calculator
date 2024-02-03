import java.util.Scanner;

public class CalculatorBasic {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Basic Calculation");
        System.out.println("------------------------");

        System.out.println("Enter 2 numbers for calculation");

        double a = scn.nextDouble();
        double b = scn.nextDouble();

        
        System.out.println("Choose an option:"
                + "\nFor a + b, press 1"
                + "\nFor a - b, press 2"
                + "\nFor a / b, press 3"
                + "\nFor a * b, press 4");

        int choice = scn.nextInt(); // Take user input for the operation choice

        switch (choice) {
            case 1:
                System.out.println("Your result is = " + (a + b));
                break;
            case 2:
                System.out.println("Your result is = " + (a - b));
                break;
            case 3:
                System.out.println("Your result is = " + (a / b));
                break;
            case 4:
                System.out.println("Your result is = " + (a * b));
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option (1-4).");
        }
    }
}

