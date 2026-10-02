import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a password:");
        String password = input.nextLine();
        
        int length = password.length();
        
        if (length < 6) {
            System.out.println("Weak password - too short");
        } else if (length < 10) {
            System.out.println("Medium password");
        } else {
            System.out.println("Strong password");
        }
    }
}