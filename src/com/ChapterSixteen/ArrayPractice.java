package com.ChapterSixteen;

import java.util.Arrays;

public class ArrayPractice {
    int[]arr1={-2,1,4,-3,6,5,7};
    int[] arr2=new int[7];
    public void arrayThings(){

        arr2=Arrays.copyOf(arr1,7);
   //Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


   for(int count=0;count<arr1.length;count++){
       for(int count1=0;count1<arr1.length;count1++){
           if(arr2[count]==arr1[count1]){
               System.out.println(arr2[count]+" "+count1);

           }
       }
   }

    }

    public void copyArray(){
        int smallest=arr1[0];
    for(int count=0;count<1;count++) {

        for (int counter = 0; counter < arr1.length; counter++) {
            if (smallest> arr1[counter]) {
            arr1[count]=smallest;
                arr2[count] = arr1[counter];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
    }
    public void formalHardCopyArray() {
        for (int i = 0; i < arr1.length; i++) {
            int min = arr1[i];
            int index = i;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < min) {
                    min = arr1[j];
                    index = j;
                }
            }
            // swapping
            int temp = arr1[i];
            arr1[i] = min;
            arr1[index] = temp;
        }
        System.out.println(Arrays.toString(arr1));
    }


    public static void main(String[] args) {
        ArrayPractice arrayPractice=new ArrayPractice();
        arrayPractice.arrayThings();
      //  arrayPractice.copyArray();
        arrayPractice.formalHardCopyArray();
    }
}
