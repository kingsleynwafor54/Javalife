package Kata;

import java.util.ArrayList;
import java.util.List;

public class MultiplyingNumbers {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        int [] array={1,2,3,4};

        for(int counter=0;counter<array.length;counter++){
            int total=1;
            for(int count=0;count< array.length;count++){
              if(count==counter){
                  continue;

              }
                total*=array[count];

            }
            list1.add(total);
        }
       System.out.println(list1);
    }
}
