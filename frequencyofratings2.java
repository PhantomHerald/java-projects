public class frequencyofratings2{
    public static void main(String[] args) {
        int[] ratings= {1,2,5,4,3,5,2,1,3,3,1,4,3,2,5,3,4,5,3,1};
              int count1=0, count2=0, count3=0, count4=0, count5=0;
             for (int i = 0; i<ratings.length; i++) {
                if (ratings[i] == 1) {
             count1 += 1; }
              else if (ratings[i] == 2) {
              count2 += 1; }
              else if (ratings[i] == 3) {
              count3 += 1; }
              else if (ratings[i] == 4) {
              count4 += 1; }
              else if (ratings[i] == 5) {
              count5 += 1; }
              }
              System.out.println("the frequency of 1 is " + count1);
              System.out.println("the frequency of 2 is " + count2);
              System.out.println("the frequency of 3 is " + count3);
              System.out.println("the frequency of 4 is " + count4);
              System.out.println("the frequency of 5 is " + count5);    
    }
}
// this code uses basically the if clause and only one array to get the frequency of the ratings.