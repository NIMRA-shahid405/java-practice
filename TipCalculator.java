import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int again = 1;
        do {
            System.out.println("Enter the bill amount:");
            double bill = input.nextDouble();

            System.out.println("Enter tip percentage (for example 15):");
            double percent = input.nextDouble();

            double tip = bill * percent / 100;
            double total = bill + tip;

            System.out.println("Tip: " + tip);
            System.out.println("Total to pay: " + total);

            System.out.println("Calculate another? (1 = yes, 0 = no):");
            again = input.nextInt();
        } while (again == 1);

        System.out.println("Done!");
    }
}