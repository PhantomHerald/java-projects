/*
Develop a JAVA application that allows a user to enter the names and phone 
numbers of a number of students. Your application continues to prompt the 
user for names and phone numbers as well as their preferred holiday 
destination rating on a scale of 1-7 until the user enters “z” or until the user 
has finished making the entry for all the students, whichever comes first.  
When the user has finished entering the names and phone numbers, your 
application displays a count of how many students’ names and phone numbers 
were entered, and as well as a count of the frequency of occurrence of each 
holiday destination rating.  
You application should then display the count of the rating of the holiday 
destination in descending order.  
In addition, on entering a name, your application displays the corresponding 
phone number as well as the corresponding holiday destination rating.   
Your application must anticipate all of the possible exceptions a user might 
cause to the application and deal with them.  
*/
import java.util.Scanner;

public class trial_question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to store student details
        String[] names = new String[100]; // Maximum 100 students
        String[] phoneNumbers = new String[100];
        int[] ratings = new int[100];
        int[] destinationRatings = new int[7]; // To count ratings (1-7)
        int studentCount = 0;

        System.out.println("Enter student details. Type 'z' to stop.");

        // Use a for loop to collect student details
        for (int i = 0; i < 100; i++) {
            System.out.println("Enter student's name (or 'z' to stop):");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("z")) {
                break; // Exit the loop if the user enters "z"
            }

            System.out.println("Enter student's phone number:");
            String phoneNumber = input.nextLine();

            System.out.println("Enter holiday destination rating (1-7):");
            int rating = input.nextInt();
            input.nextLine(); // Consume the newline character

            // Validate rating
            if (rating < 1 || rating > 7) {
                System.out.println("Invalid rating. Please enter a number between 1 and 7.");
                i--; // Decrement the loop counter to retry this iteration
                continue;
            }

            // Store details in arrays
            names[studentCount] = name;
            phoneNumbers[studentCount] = phoneNumber;
            ratings[studentCount] = rating;
            destinationRatings[rating - 1]++; // Count the rating
            studentCount++; // Increase student count
        }

        // Display total students entered
        System.out.println("\nTotal students entered: " + studentCount);

        // Display frequency of each rating
        System.out.println("Frequency of holiday destination ratings:");
        for (int i = 0; i < destinationRatings.length; i++) {
            System.out.println("Rating " + (i + 1) + ": " + destinationRatings[i]);
        }

        // Sort and display ratings in descending order
        System.out.println("\nRatings in descending order:");
        for (int i = 6; i >= 0; i--) {
            if (destinationRatings[i] > 0) {
                System.out.println("Rating " + (i + 1) + ": " + destinationRatings[i]);
            }
        }

        // Allow user to search for a student by name
        System.out.println("\nSearch for a student by name:");
        for (int i = 0; i < 100; i++) {
            System.out.println("Enter a student's name (or 'z' to stop):");
            String searchName = input.nextLine();
            if (searchName.equalsIgnoreCase("z")) {
                break; // Exit the loop if the user enters "z"
            }

            // Search for the student in the array
            boolean found = false;
            for (int j = 0; j < studentCount; j++) {
                if (names[j].equalsIgnoreCase(searchName)) {
                    System.out.println("Name: " + names[j]);
                    System.out.println("Phone Number: " + phoneNumbers[j]);
                    System.out.println("Holiday Destination Rating: " + ratings[j]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student not found.");
            }
        }

        input.close();
    }
}