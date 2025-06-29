import java.util.*;
public class finaltrial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to store student details
        String[] names = new String[100]; // Maximum 100 students
        String[] phoneNumbers = new String[100];
        int[] ratings = new int[100];
        int[] frequency = new int[7]; // To count ratings (1-7)
        int count = 0;

        // Collect student details
        for (int i = 0; i < names.length; i++) {
            // Taking the name
            System.out.println("Enter student's name (or 'z' to stop):");
            names[i] = input.nextLine();
            if (names[i].equalsIgnoreCase("z")) {
                break; // Exit the loop if the user enters "z"
            }

            // Taking the phone number
            System.out.println("Enter phone number:");
            phoneNumbers[i] = input.nextLine();

            // Taking the rating
            int rating;
            while (true) {
                System.out.println("Enter holiday destination rating (1-7):");
                rating = input.nextInt();
                input.nextLine(); // Consume the newline character
                if (rating >= 1 && rating <= 7) {
                    ratings[i] = rating;
                    frequency[rating - 1]++; // Increment the frequency for the rating
                    break; // Exit the loop if the rating is valid
                } else {
                    System.out.println("Invalid rating. Please enter a number between 1 and 7.");
                }
            }

            count++; // Increment the student count
        }

        // Display total students entered
        System.out.println("\nTotal students entered: " + count);

        // Display frequency of each rating
        System.out.println("Frequency of holiday destination ratings:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Rating " + (i + 1) + ": " + frequency[i]);
        }

        // Display ratings in descending order
        System.out.println("\nRatings in descending order:");
        for (int i = 6; i >= 0; i--) {
            if (frequency[i] > 0) {







                System.out.println("Rating " + (i + 1) + ": " + frequency[i]);
            }
        }

        input.close();
    }
}