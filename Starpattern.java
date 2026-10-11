import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many rows?");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}