import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            System.out.println(n + "! = " + result);
        }
    }
}