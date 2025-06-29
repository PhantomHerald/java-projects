public class frequencyofrating {
    public static void main(String[] args) {
        int[] ratings = {1,2,5,4,3,5,2,1,3,3,1,4,3,2,5,3,4,5,3,1};
        int[] frequency = {1,2,3,4,5};
        int[] studentsfrequency ={0,0,0,0,0,};
            for (int i=0; i<ratings.length; i++){
                for (int j=0; j<frequency.length; j++){
                    if (ratings[i]==frequency[j]){
                        studentsfrequency[j]+= 1;
                    } else {
                        continue;
                    }
                }
            }
            System.out.println("Rating 1 has a frequency of "+studentsfrequency[0]);
            System.out.println("Rating 2 has a frequency of "+studentsfrequency[1]);
            System.out.println("Rating 3 has a frequency of "+studentsfrequency[2]);
            System.out.println("Rating 4 has a frequency of "+studentsfrequency[3]);
            System.out.println("Rating 5 has a frequency of "+studentsfrequency[4]);
    }
}
