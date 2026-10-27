import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = input.nextDouble();

        System.out.println("Enter second number:");
        double b = input.nextDouble();

        System.out.println("Enter third number:");
        double c = input.nextDouble();

        double average = (a + b + c) / 3;
        System.out.println("Average: " + average);
    }
}