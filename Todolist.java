import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tasks = new String[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- To-Do Menu ---");
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            input.nextLine(); // clears the leftover Enter key so text input works

            if (choice == 1) {
                if (count == tasks.length) {
                    System.out.println("List is full.");
                } else {
                    System.out.println("Type the task:");
                    tasks[count] = input.nextLine();
                    count++;
                    System.out.println("Task added.");
                }
            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No tasks yet.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + tasks[i]);
                    }
                }
            } else if (choice != 3) {
                System.out.println("Invalid choice, try again.");
            }
        } while (choice != 3);

        System.out.println("Goodbye!");
    }
}