public class arraylab{
public static void main(String[] args) {

    int[][] HStreet = { {4200, 4800, 5000}, 
                        {5200, 5800, 6000},  
                        {4600, 4900, 5800},
                        {4600, 4900, 5800}};
        int[][] Mail = {{5700, 6300, 6000},  
                        {7000, 6700, 7300},  
                        {6500, 6600, 6200}, 
                        {7200, 6900, 7500}};
        int[][] MonCombSales = new int[4][3];
        int[] QuaCombSales = new int[4];
        int YearCombSales = 0;
        int yearsalemail= 0;
        int yearsalemail1= 0;
        int hstreetvalue =0;
        int mallstreetvalue =0;
        //int []quarterly = new int [3];
        //int []quarterly2= new int [3];
      // int hstreetquatervalue = 0;
      // int mallstreetquatervalue = 0;
        for (int i = 0; i < Mail.length; i++){
            int quarter = i+1;
            for (int j = 0; j < Mail[i].length; j++){
                MonCombSales[i][j] = HStreet[i][j] + Mail[i][j];
                int month = j + 1;
               // mallstreetquatervalue += Mail[i][j];

                if ( HStreet[i][j] > Mail[i][j] ){
                    hstreetvalue +=1;
                }
                else{
                    mallstreetvalue +=1 ;
                }
              //  if (j == 3){
               //     quarterly[i]= 

               // }
                
                System.out.println("Quarter "+ quarter +" Month "+ month + "\nH Street: " + HStreet[i][j] + ", Mail: " + Mail[i][j] + ", Combined: " + MonCombSales[i][j]);
                QuaCombSales[i] += MonCombSales[i][j];
            } YearCombSales += QuaCombSales[i];
            System.out.println("////////////////////////////");
            System.out.println("Quarter" + quarter + " total sales: " + QuaCombSales[i]);
            System.out.println("///////////////////////////////////////");
            if ( mallstreetvalue> hstreetvalue){
                System.out.println("Mallstreet has the best monthly performance with "+ mallstreetvalue +" points");}
                else{
            System.out.println("Hstreet has the best monthly performance withh "+ hstreetvalue +" points");}
        }
        for (int i= 0;  i < Mail.length; i++){
            for (int j = 0; j < Mail[i].length; j++){
                yearsalemail += Mail[i][j];
            }
        }
        yearsalemail= YearCombSales- yearsalemail;
        yearsalemail1 = yearsalemail- YearCombSales;
        if (yearsalemail > yearsalemail1){
            System.out.println( "//////////////////////////////////\nbest yearly performance: Mallstreet ");
        }
        else{
            System.out.println("//////////////////////////////////\nhstreet has the best yearly performance");
        }
        System.out.println("Yearly total sales: " + YearCombSales+"year" + yearsalemail + yearsalemail1);
 
        

















































































































    /*int hstreet[][] = {{4200, 4800, 5000},{5200, 5800, 6000},{4600, 4900, 5800}, {4600, 4900, 5800}};
    int mallbranch[][] = {{5700, 6300, 6000}, {7000, 6700, 7300}, {6500, 6600, 6200}, {7200, 6900, 7500}};
    int []total = new int[2];
    for (int i= 0; i < hstreet.length; i++){
        for (int j = 0; j < hstreet[i].length; j++){
            total[0] += hstreet[i][j];
        }
    }
    System.out.println("the total of hstreet is "+total[0]);
    for (int i= 0; i < mallbranch.length; i++){
        for (int j = 0; j < mallbranch[i].length; j++){
            total[1] += mallbranch[i][j];
        }
    }   
    System.out.println( "the total of mallbranch is "+total[1]);

    // combined quartely sales
    int q1 =0 , q2=0 , q3=0; 
for (int i = 0; i < hstreet.length; i++){
    q1 += hstreet[i][0];
    q2 += hstreet[i][1];
    q3 += hstreet[i][2];
}
System.out.println("the quarterly total of hstreet ");
System.out.println("the total of q1 is "+q1);
System.out.println("the total of q2 is "+q2);
System.out.println("the total of q3 is "+q3);


// combined quarterly sales of mall branch
int mbq1 = 0 , mbq2 = 0 , mbq3=0; 
for (int i = 0; i < mallbranch.length; i++){
    mbq1 += mallbranch[i][0];
    mbq2 += mallbranch[i][1];
    mbq3 += mallbranch[i][2];
}
System.out.println("the quarterly total of mallbranch ");
System.out.println("the total of q1 is "+mbq1);
System.out.println("the total of q2 is "+mbq2);
System.out.println("the total of q3 is "+mbq3);
// total monthky sales
int m1 = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0, m6 = 0, m7 = 0, m8 = 0, m9 = 0, m10 = 0, m11 = 0, m12 = 0;
for (int i = 0; i < hstreet.length; i++){
    for (int j= 0 ; j< mallbranch.length; j++){*/

       /*  m1 = hstreet[i][0] + mallbranch[j][0];
        m2 = hstreet[i][1] + mallbranch[j][1];
        m3 = hstreet[i][2] + mallbranch[j][2];
        m4 = hstreet[i][0] + mallbranch[j][0];
        m5 = hstreet[i][1] + mallbranch[j][1];
        m6 = hstreet[i][2] + mallbranch[j][2];
        m7 += hstreet[i][0] + mallbranch[j][0];
        m8 += hstreet[i][1] + mallbranch[j][1];
        m9 += hstreet[i][2] + mallbranch[j][2];
        m10 += hstreet[i][0] + mallbranch[j][0];
        m11 += hstreet[i][1] + mallbranch[j][1];
        m12 += hstreet[i][2] + mallbranch[j][2];
    }
}
System.out.println("the total monthly sales ");
System.out.println("the total of january is "+m1);
System.out.println("the total of february is "+m2);
System.out.println("the total of march is "+m3);
System.out.println("the total of april is "+m4);
System.out.println("the total of may is "+m5);
System.out.println("the total of june is "+m6); */
            
        
    }  
}