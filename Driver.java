/*
Kyle Reed
Prof. Huang
COS-210-300
25 February 2025
*/


// Driver class that establishes menu and allows user to do various tasks
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        OrderedList<Integer> orderedList = new OrderedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("Menu:"); // Menu
            System.out.println("1. Add an number"); // Allows user to add number
            System.out.println("2. Get an number"); // Allows user to get number
            System.out.println("3. Remove an number"); // Allows user to remove a numbers first occurence
            System.out.println("4. Display the list"); // Displays list size and numbers to the user
            System.out.println("5. Exit"); // Exits program
            System.out.print("Enter your choice: "); // Prompts user for inputted number for which task they wish to achieve
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an number to add: "); // Prompts user for number
                    value = scanner.nextInt();
                    orderedList.add(value);
                    System.out.println(value + " added."); // adds number to list in order
                    break;
                case 2:
                    System.out.print("Enter index to get: "); // Prompts user for number for specific index
                    int index = scanner.nextInt();
                    if (index >= 0 && index < orderedList.size()) {
                        System.out.println("Number at index " + index + ": " + orderedList.get(index)); // Shows user number at specific index
                    } else {
                        System.out.println("Index out of bounds."); // Informs user that index is out of bounds and invalid
                    }
                    break;
                case 3:
                    System.out.print("Enter an number to remove: "); // Prompts user to enter number for removal
                    value = scanner.nextInt();
                    if (orderedList.remove(value)) {
                        System.out.println(value + " removed."); // removes first occurence of specified number from list
                    } else {
                        System.out.println(value + " not found."); // Informs user if the number is not in the list
                    }
                    break;
                case 4:
                    System.out.println("Current list: " + orderedList); // Shows user the current list and its size
                    break;
                case 5:
                    System.out.println("Exiting..."); // Exits the program
                    break;
                default:
                    System.out.println("Invalid choice. Please try again."); // Informs user choice of task is invalid (ie. if user enters anything greater than 5 or less than 1)
            }
        } while (choice != 5);

        scanner.close();
    }
}

