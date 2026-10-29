import java.util.Scanner;

public class MenuCalculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter first number:");
                double x = input.nextDouble();
                System.out.println("Enter second number:");
                double y = input.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + add(x, y));
                        break;
                    case 2:
                        System.out.println("Result: " + subtract(x, y));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply(x, y));
                        break;
                    case 4:
                        if (y == 0) {
                            System.out.println("Cannot divide by zero.");
                        } else {
                            System.out.println("Result: " + divide(x, y));
                        }
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice, try again.");
            }
        } while (choice != 5);

        System.out.println("Goodbye!");
    }
}