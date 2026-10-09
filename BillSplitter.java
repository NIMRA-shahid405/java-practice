import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total bill amount:");
        double total = input.nextDouble();

        System.out.println("How many people are splitting the bill?");
        int people = input.nextInt();

        if (people <= 0) {
            System.out.println("Number of people must be at least 1.");
        } else {
            double perPerson = total / people;
            System.out.println("Each person pays: " + perPerson);
        }
    }
}