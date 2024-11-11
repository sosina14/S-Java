import java.util.Scanner;
import java.util.ArrayList;

public class TaskManager {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("\nTask Menu\n1. Add a new task\n2. View all tasks\n3. Remove a task by its name\n4. Exit\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String itemToAdd = scanner.nextLine();
                    list.add(itemToAdd);
                    System.out.println("Task successfully added.");
                    break;
                case 2:
                    System.out.println("The tasks are:\n" + list);
                    break;
                case 3:
                    System.out.print("Enter the task to remove: ");
                    String itemToRemove = scanner.nextLine();
                    if (list.remove(itemToRemove)) {
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
