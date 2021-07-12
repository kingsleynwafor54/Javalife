package Kata;

import java.util.Arrays;
import java.util.Scanner;

public class AdvanceShuffle {
    public static void advanceShuffleForPositiveNumbers(int [] array,int number){
        number%= array.length;
        int[] newArray = new int[array.length];
        int counter = 0;
        int count=1;
        while (counter < number) {
            int arrayNumber = array.length - count;
            int arrayNumber2 = number - count;
            int fixedNumber=array[arrayNumber];
            newArray[arrayNumber2]=fixedNumber;
            counter++;
            count++;

        }
        System.out.println(counter);
        int c=0;
        for(int county=number;county< array.length;county++){
            newArray[county]=array[c];
            c++;

        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void advanceShuffleForNegative(int[] array,int number){
        number%=array.length;
        int [] newArray=new int[array.length];
        int counter=0;
        int count=1;
        while (counter < Math.abs(number)) {
            int arrayNumber = (Math.abs(number)-1)- counter;
            int arrayNumber2 = array.length - count;
            int fixedNumber=array[arrayNumber];
            newArray[arrayNumber2]=fixedNumber;
            counter++;
            count++;


        }
        int y= (array.length)-Math.abs(number);
        int x=Math.abs(number);
        for(int u=0;u<y;u++){

            newArray[u]=array[x];

            x++;

        }

        System.out.println(Arrays.toString(newArray));


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter you Preferred Number");
        int number = scanner.nextInt();

        int[] array = {1, 2, 3, 4,5,7,8,9,12};
        if(number>0){
    advanceShuffleForPositiveNumbers(array,number);
}
  else      advanceShuffleForNegative(array,number);

}
}