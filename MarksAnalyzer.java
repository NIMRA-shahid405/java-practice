import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] marks = new int[5];

        // Input marks
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        int total = 0;
        int highest = marks[0];

        // Calculate total and highest mark
        for (int i = 0; i < 5; i++) {
            total = total + marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        System.out.println("Total marks = " + total);
        System.out.println("Highest mark = " + highest);

        input.close();
    }
}