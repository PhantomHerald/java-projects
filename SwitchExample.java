import java.util.Scanner; 
public class SwitchExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = input.nextLine();
        input.close();

        switch (day) {
            case "Monday":
                System.out.println("Today is Monday, the first day of the week. People born on these days are called Adjoa and Kwabena");
                break;
            case "Tuesday":
                System.out.println("It is tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Invalid day. Input a valid day of the week");
                break;   
        }
    }
}
/*
 * switches can also be used in multiple different ways.
 * eg 1
 * char grade = 'B';
switch (grade) {
    case 'A', 'B' -> System.out.println("Good job!");
    case 'C', 'D' -> System.out.println("Needs improvement");
    default -> System.out.println("Invalid grade");
}


switches can only be used for definate values, not ranges.
ie you can't do this:
int score = 85;
switch (score) {
    case score >= 90 -> System.out.println("Excellent!");
    case score >= 80 -> System.out.println("Well done!");
    case score >= 70 -> System.out.println("Good job!");
    case score >= 60 -> System.out.println("Needs improvement");
    default -> System.out.println("Invalid score");
    it is only used for exact values 
 */
