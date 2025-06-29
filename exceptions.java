import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptions {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        try{
        System.out.println("Enter a whole number: ");
        int x = input.nextInt();
        System.out.println("Enter another whole number to divide by: ");
        int y = input.nextInt();
        int ans = x/y;
        System.out.println ("the answer is: " + ans);
    }
    catch(/*error you want to catch */ ArithmeticException e){
        System.out.println("you cant divide by zero idiot....Error: Division by zero is not allowed. Please enter a non-zero divisor.");
    }
    catch (InputMismatchException e) {
        System.out.println("An error occurred: you entered a letter. you have to enfet a numberf" + e.getMessage());
    }
    catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
    // finally block is optional and contains code that will always execute, regardless of whether an exception was thrown or not.
    finally {
        input.close(); // Close the scanner to prevent resource leaks
        System.out.println(/*"This block always executes, regardless of an exception."*/ "good job. you didnt make any stupid mistakes");}
    }
}
// to use exceptions in java, yoou use the try and catch block. the try block contains the code that may throw an exception, while the catch block contains the code that handles the exception.
// the finally block is optional and contains code that will always execute, regardless of whether an exception was thrown or not.
// the try is supposed to be around any dangerous code or code that might cause an error (rthis error is usually when the er innputs a value)
// is is basically event or the name given to the exception. just use e to be safe
//exception e will catch any exception that occurs in the try block. you can also use specific exception types like ArithmeticException or InputMismatchException to catch specific exceptions.
//finally will always excecute no matter the error. it is used to close resources or perform cleanup actions that should always happen, regardless of whether an exception occurred or not.
// the catch block is used to handle the exception. it can be used to print an error message, log the error, or take any other appropriate action.
// the catch should always be inside the try block.
//scanner should also always be outside the try block.