import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000.0;
        int choice;
        
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            
            if (choice == 1) {
                System.out.println("Your balance is: " + balance);
            } else if (choice == 2) {
                System.out.println("Enter amount to deposit:");
                double deposit = input.nextDouble();
                balance = balance + deposit;
                System.out.println("New balance: " + balance);
            } else if (choice == 3) {
                System.out.println("Enter amount to withdraw:");
                double withdraw = input.nextDouble();
                if (withdraw > balance) {
                    System.out.println("Insufficient funds!");
                } else {
                    balance = balance - withdraw;
                    System.out.println("New balance: " + balance);
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM!");
            } else {
                System.out.println("Invalid choice, try again.");
            }
        } while (choice != 4);
    }
}