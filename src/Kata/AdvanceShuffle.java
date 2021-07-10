package Kata;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AdvanceShuffle {
    public static void main(String[] args) {
        int number = 3;
        int[] array = {1, 2, 3, 4};
        int[] newArray = new int[array.length];
        int arrayNumber = array.length - 1;
        int count;
        int counter =0;
        while(counter < array.length) {

            int fixNumber = array[arrayNumber];
            System.out.print(fixNumber + " ");
            for(count=number-1;count<0;count--) {
                newArray[count] = fixNumber;

            }
//            for (int count = number - 1; count >= 0; count--) {
//                newArray[count]=fixNumber;
//                count--;

            counter++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
