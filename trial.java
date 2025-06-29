public class trial {
    public static void main(String[] args){
        System.out.println("EVEN NUMBERES");
        
        for(int i=0;i<=20; i++){
            if(i==0 || i==20 ) continue;
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("ODD NUMBERS");
        for(int i=0;i<=10; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("COMPOUND OPERATIONS");
        //the loop runs over.. the value of i is incremented by 2 and goes back to the for loop to be incremented by one again.
        int i;
        for (i=0; i<5; i++){
            System.out.println(i+=2);
        }
        System.out.println("BREAK STATEMENT");
        for (i=0; i<=25; i+=3){
            if (i==13)break;
            System.out.println(i*=2);
        }
        System.out.println("break eg 2");
        for (i=2; i<25; i--){
            if (i==15)break;
            System.out.println(i*=2);
        }
        System.out.println("ARRAYS");
        int hello[];
        for (int j=0; j<5; j++){
            hello = new int[5];
            hello[j] = j;
            System.out.println(hello[j]);
        }
        //int[] okay = {1,2,3,4,5};
        System.out.println("ARRAYS 2");
        int []a = new int[10];
        for (int j=0; j< a.length;j++){
            a[j] = j;
            System.out.println(a[j]);
        }

      /*   System.out.println("ARRAYS 3");
        System.out.println("ODD NUMBERS");
        //int []odd_numbers ;int count = 0;
        for(int u=0;i<=10; i++){
            if (u % 2 != 0){
                count +=1;
                System.out.println(u);
                odd_numbers = new int[count];
                //odd_numbers[u] = u;
            }
        }
        for (int p=5; p>= 0; i--){
         //  System.out.println( odd_numbers[p]); ;
*/
        }
    }

// compound operation eg i+= 2 == i= i+2
// values needed for the java scanner class
/* 
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int hello = input.nextInt();// this is used for integers to be inputed
String hi = input.nextLine(); // this is used for strings to be inputed
input.close(); // this is used to close the scanner class
*/// this is really important so remeber to memorize it
