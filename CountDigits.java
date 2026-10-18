import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a whole number:");
        int n = input.nextInt();

        if (n < 0) {
            n = -n;
        }

        int count = 0;
        if (n == 0) {
            count = 1;
        }
        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Number of digits: " + count);
    }
}