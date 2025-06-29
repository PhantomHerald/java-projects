import java.util.*;
public class descending_oddumbers {
    public static void main(String[] args) {
        System.out.println("ODD NUMBERS BETWEEN ZERO AND TEN IN DESCENDING ORDER:");
        Integer[] oddNumbers = new Integer[5];
        int index = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                oddNumbers[index] = i;
                index++;
            }
        }
        /*for (int i = oddNumbers.length - 1; i >= 0; i--) {
            System.out.println(oddNumbers[i]);
        }*/
        Arrays.sort(oddNumbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(oddNumbers));
    }
}