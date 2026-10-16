import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a whole number:");
        int n = input.nextInt();

        if (n < 0) {
            n = -n;
        }

        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}