import  java.util.Scanner;

public class java {
    /*public static void main (String[] args){
        System.out.println ("hello world");
        System.out.println("okay this kinda good");
        System.out.println("i can do this");

        int mynumber = 9;
        System.out.println(mynumber);
        //for variables, you use type name = value.  eg string hello = "hello";
        // string starts with a capital s.. java is really case sensitive.make sure to check the cases before running to avoid any errors.
        String mystring = "hello";
        System.out.println(mystring);
        int age = 20;
        int year = 2021;
        System.out.println("my age is " + age + " and the year i was born is " + year);
        System.out.println(year * age);
        int multi = year * age;
        System.out.println(multi);
        // use "final" to make a variable constant. eg final int mynumber = 9;
        // you can also use final double mynumber = 9.0;
        // declaring multiple variables.. int x = 5, y = 6, z = 50;
        /*Names can contain letters, digits, underscores, and dollar signs
        Names must begin with a letter
        Names should start with a lowercase letter, and cannot contain whitespace
        Names can also begin with $ and _
        Names are case-sensitive ("myVar" and "myvar" are different variables)
        Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        Data Type	Description
        byte	Stores whole numbers from -128 to 127
        short	Stores whole numbers from -32,768 to 32,767
        int	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        boolean	Stores true or false values
        char	Stores a single character/letter or ASCII values
        */
        // you can also use the underscore to make your code more readable. eg int my_number = 9;
        /*float myfloat = 9.99f;
        //always remember to add f at the end of the value to identify float and d for double. this is because in java, floaats ar considered as double when you dont use the f or d.
        System.out.println(myfloat);
        // boolean takes strictly true or false. the boolean as data type is spelt in full
        // in char, if you know the ascii value of the chaaracters, you can put them in there.
        char myvar = 65;
        System.out.println(myvar);
        char hello = 'A';
        System.out.println(hello);
        String greeting ="good morning";
        System.out.println(greeting);

        // the >> is used to divide the value by 2
         and << is used to multiply the vlaue by 2
         table[row][column]
    */
    //program for the grading system
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your exam score: ");
        int exam_score = input.nextInt();
        System.out.println("Enter your assessment");
        float assessment = input.nextInt();
        int fee =100;
        System.out.println("Enter your fees paid");
        int fees_paid = input.nextInt();
        

        if (exam_score >=24 && assessment >= 15 || exam_score >=25 && assessment >= 14 ) {
            System.out.println("You are condoned");
        }
        else if (exam_score < 24 && assessment < 14) {
            System.out.println("You have failed and have been repeated !!! womp womp better luck next time!");}
        else if (exam_score >= 25 && assessment < 14){
            System.out.println("you have passed your exam but failed assessment");
        }
        else if (exam_score < 24 && assessment >= 15){
            System.out.println("you have passed your assessment but failed exams");
        }
        else{
            System.out.println("you have failed both your exams and assessment hence you have been repeated");
        }
        if (fees_paid == fee && (exam_score >=24 && assessment >= 15 || exam_score >=25 && assessment >= 14) ) {
            System.out.println("congratulations!! Here's your certificate");            
        } else{
            System.out.println("Sorry!! you're not eligible to be given a certificate");            
        }
        input.close();
    }
}
// it is similar to all that you have already done in c++.. just that the syntax is alittle different.