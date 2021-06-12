package ChapterSeven;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DisplayingArrays {
    public static int[] countLetters(int[] chars){
       int [] counts =new int [100];
       for(int counter=0;counter<chars.length;counter++)
           counts[chars[counter]-0]++;

       for(int count=0;count< counts.length;count++){
           System.out.println(count+" "+counts[count]);
       }
        return  null;
    }

    public static String displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
             if ((i + 1) % 10 == 0)
                 System.out.println(counts[i] + " " +(i + 1));
            else
             System.out.print(counts[i] + " " + (i + 1) + " ");
             }
return "";
    }
    public static String displayReverseNumbers(int[] arrays){
        for(int counter= arrays.length-1;counter>=0;counter--){
            if((counter+1)%10==0){
                System.out.println();
            }
            System.out.print(arrays[counter]+"  ");
        }
    return "";
    }
public static boolean displayDistinctNumbers(int[] arrays,int score) {


    for (int counter = 0; counter < arrays.length; counter++) {
        if (arrays[counter] == score) {
            return  true;
        }

    }
    return false;
}
public static void displayTwoByTwoArray(){
    int[][] array = {{1, 2}, {3, 4}, {5, 6}};
    for (int i = array.length - 1; i >= 0; i--) {
        for (int j = array[i].length - 1; j >= 0; j--){
        System.out.print(array[i][j] + " ");

    }
        System.out.println();
    }
    }
    public static void displayTwoByTwoArray1(){
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length - 1; j >= 0; j--){
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }
    public static void displaySumInTwoDimensionalArray(){
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i][0];
        System.out.println(sum);
    }
    public static void main(String[] args) {
//        int[] randomLetters = {2,5, 6, 5, 4 ,3 ,23 ,43 ,2 ,0,2,5, 6, 5, 4 ,3 ,23 ,43 ,2 ,0,2,5, 6, 5, 4 ,3 ,23 ,43 ,2 ,0,2,5, 6, 5, 4 ,3 ,23 ,43 ,2 ,0};
////        System.out.println(Arrays.toString(countLetters(randomLetters)));
////        System.out.println();
////        System.out.println(displayReverseNumbers(randomLetters));
//        Scanner scan = new Scanner(System.in);
//        int[] myArr = new int[5];
//        int number;
//
//        for(int counter = 0; counter < myArr.length; counter++) {
//            System.out.print("Enter value between 1 to 100: ");
//            number = scan.nextInt();
//            if (!displayDistinctNumbers(myArr, number)) {
//                myArr[counter] = number;
//            } else {
//                System.out.printf("Number %d Already exit!%n", number);
//            }
//        }
//            for(int count = 0; count < myArr.length; count++){
//                if(myArr[count] != 0){
//                    System.out.print(myArr[count]+" ");
//                }
//            }

//      displayTwoByTwoArray();
//      displayTwoByTwoArray1();
        displaySumInTwoDimensionalArray();
        }
    }


