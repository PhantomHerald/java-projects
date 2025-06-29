/* JAVA ASSIGNMENT - 2024 
Write a JAVA Program to obtain the first 9 odd 
numbers from a user via the keyboard and store them 
in a 2D 3x3 array (as shown below) and then compute 
the difference between the product of the trailing 
diagonal and the product of the leading diagonal. The 
output of the computation should be placed at the 
second column of the second row. The product of the 
leading diagonal should be placed at the second 
column of the first row, while the product of the 
trailing diagonal is placed at the second column of 
the third row. Your program then computes the 
average, and standard deviation of the resulting new 
2D 3x3 array and place the output of the average at 
the second row first column, and the output of the 
standard deviation at the second row, third column. 
Your program must sort the resulting new 2D 3x3 
array content in descending order from row 1 first 
column to row 3 third column. Lastly, your program 
displays the final 2D 3x3 array in descending order 
on-screen.   
Leading Diagonal 
Trailing Diagonal 
1 3 5 
7 9 11 
13 15 17*/
import java.util.Scanner;
public class trial_question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum= 0;
        int subtotal = 0;
        int productleading = 1;
        int producttrailing = 1;
        float average= 0;
        double standarddeviation = 0;
    int [][] values = new int[3][3];
    for (int i =0 ; i<values.length; i++){
        for (int j = 0; j<values[i].length; j++){
            System.out.println("enter the value for row " + i + " column " + j);
            values[i][j] = input.nextInt();
            if (i == j){
                productleading *= values[i][j];
                }
                if (i +j == 2){
                    producttrailing *= values[i][j];
                    }
                
        }
    }
    subtotal = producttrailing  - productleading  ;
    System.out.println("The leading diagonal is " + productleading);
    System.out.println("The trailing diagonal is " + producttrailing);
    System.out.println("The subtotal is " + subtotal);
    values[1][1] = subtotal;
    values[0][1] = productleading;
    values[2][1] = producttrailing;
// now the new array is done
    // now we need to calculate the average and standard deviation
    for (int i = 0; i < values.length; i++){
        for (int j = 0; j < values[i].length; j++){
            sum += values[i][j];
        }
    }
    average = (float) sum /9;
    System.out.println("The average is " + average);
    // now we need to calculate the standard deviation
    // Calculate the standard deviation
    double varianceSum = 0;
    for (int i = 0; i < values.length; i++) {
        for (int j = 0; j < values[i].length; j++) {
            varianceSum += Math.pow(values[i][j] - average, 2); // (value - mean)^2
        }
    }
    double variance = varianceSum / 9; 
    // Variance = sum of squared differences / number of elements
    standarddeviation = Math.sqrt(variance); // Standard deviation = square root of variance

    System.out.printf("The standard deviation is %.2f%n", standarddeviation);

    input.close();
}

}
