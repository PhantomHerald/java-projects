import java.util.Scanner;
public class grading_system{
    static void feeChecker(float amount_paid){
        System.out.println( amount_paid == 100 ? "CONGRATULATIONS!! HERE IS YOUR CERTIFICATE.": "INCOMPLETE PAYMENT OF FEES, YOU ARE NOT ELIGIBELE TO RECEIVE A CERTIFICATE");
       /*  if (amount_paid == 100){
            System.out.println("CONGRRTULATIONS! HERE IS YOUR CERTIFICATE.");}
        else {
                System.out.println("INCOMPLETE PAYMENT. YOUU ARE NOT ELIGIBLE TO RECEIVE A CERTIFICATE");
            }*/
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE KNUST RESULT CHECKER \nENTER THE REQUIRED DETAILS. ");
        System.out.print("EXAM SCORE = ");
        int exam_score = input.nextInt();
        System.out.print("ASSESMENT SCORE = ");
        int assessment_score = input.nextInt();
        System.out.print("FEES PAID = ");
        int feesPaid = input.nextInt();

        if (exam_score + assessment_score == 39){
             if (exam_score == 25 && assessment_score ==14){
                System.out.println("EXAMINATION .... PASSED \nASSESMENT  .... FAILED \nYOU ARE CONDONED");
                feeChecker(feesPaid);
            }
            else if ( exam_score == 24 && assessment_score == 15 ) {
                System.out.println("EXAMINATION .... FAILED \nASSESMENT  .... PASSED \nYOU ARE CONDONED");
                feeChecker(feesPaid);
            }
            else if (exam_score >= 25 && assessment_score < 14) {
                System.out.println("EXAMINATION .... PASSED \nASSESSMENT  .... FAILED \nSORRY, YOU ARE NOT ELIGIBLE TO RECEIVE A CERTIFICATE");
            }
            else if (exam_score <= 24 && assessment_score > 15) {
                System.out.println("EXAMINATION .... FAILED \nASSESSMENT  .... PASSED \nYOU ARE NOT ELIGIBLE TTO RECEIVE A CERTIFICTATE");
            }
        }
        if (exam_score + assessment_score != 39) {
            if (exam_score >= 25 && assessment_score >=15 ) {
                System.out.println("EXAMINATION .... PASSED \nASSESSMENT  .... PASSED");
                feeChecker(feesPaid);
            }
            else if (exam_score >= 25 && assessment_score < 14 ) {
                System.out.println( "EXAMINATION .... PASSED \nASSESSMET .... FAILED \nYOU ARE NOT ELIGIBLE TO RECEIVE A CERTIFICATE.");
            }
            else if (exam_score <= 24 && assessment_score >15) {
                System.out.println("EXAMINATION .... FAILED \nASSESSMENT  .... PASSED \nYOU ARE NOT ELIGIBLE TO RECEIVE A CERTIFICATE.");
            }
            else if (exam_score < 24 && assessment_score < 14 ) {
                System.out.println("EXAMINATION .... FAILED \nASSESSMENT  .... FAILED \nYOU HAVE FAILED THE COURSE THEREFORE YOU HAVE BEEN REPEATED. YOU WILL NOT RECEIVE A CERTIFICATE!" );
            }
        }
           input.close();
    }
    
}
