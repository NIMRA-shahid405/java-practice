import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many subjects?");
        int count = input.nextInt();
        
        int[] subjectMarks = new int[count];
        int total = 0;
        
        for (int i = 0; i < count; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            subjectMarks[i] = input.nextInt();
            total = total + subjectMarks[i];
        }
        
        double average = total / (double) count;
        
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 70) {
            System.out.println("Grade: C");
        } else if (average >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}