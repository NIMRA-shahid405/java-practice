import java.util.Scanner;

public class MultiTableMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 1;
        while (choice != 0) {
            System.out.println("Enter a number for its table (0 to quit):");
            int num = input.nextInt();

            if (num == 0) {
                choice = 0;
            } else {
                System.out.println("Table of " + num + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }
            }
        }

        System.out.println("Goodbye!");
    }
}