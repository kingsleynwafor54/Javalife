package ChapterSeven;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DisplayingArrays {
    public static int[] countLetters(int[] chars){
       int [] counts =new int [100];
       for(int counter=0;counter<chars.length;counter++)
           counts[chars[counter]-0]++;

       for(int count=0;count< counts.length;count++) {
           if (count%10==0){
               System.out.println();
           }
           System.out.print(counts[count]+" ");
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
    public static int[][] countLetters1(int[][] chars){

        Scanner sc=new Scanner(System.in);
       int[][]  counts =new int[5][10];
        int count;
        for(int counter=0;counter<chars.length;counter++) {

            for (count = 0; count < chars[counter].length; count++) {

            }
        }
            for(int counter=0;counter<chars.length;counter++){
                for( count=0;count<chars[counter].length;count++){
                    if(count%10==0){
                        System.out.println();
                    }
                    System.out.print(chars[counter][count]+" ");
                }

            }


        return  null;
    }



    public static void main(String[] args) {
      int[] randomLetters = {2,5, 6, 5, 4 ,3 ,23 ,43 ,2 ,0,2,5, 6, 5, 4 ,3 ,23 ,43 ,2 ,0,2,5, 6, 5, 4 ,3 ,23 ,43 ,2 ,0,2,5, 6, 5, 4 ,3 ,23 ,43 ,2 ,0};
//        System.out.println(countLetters(randomLetters));


        int[] random={1,2,1,2,1,3,4,3,2,4,5,3,6,7,8,9,8};
//        System.out.println(countLetters1(random));
//int counter=0;
//        while (counter<5){
//            countLetters1(rating);
//            counter++;
//        }


        }
    }


