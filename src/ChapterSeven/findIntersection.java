package ChapterSeven;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class findIntersection {
    public void findTheIntersection(int[] array){

    }

    public static void main(String[] args) {
        String [] array={"1,3,4,7,13","1,2,4,13,15"};
        String[] A=array[0].split(",");
        String [] B=array[1].split(",");
//        ArrayList<String> arrayList=new ArrayList<>();


        for(int counter=0;counter<A.length;counter++){
            for(int count=0;count<B.length;count++){
                if(A[counter].equals(B[count])){
                    System.out.print(A[counter]+" ");
//                    arrayList.add(A[counter]);
                }
            }

        }
//        for(int counter=0;counter<arrayList.size();counter++){
//            System.out.print(arrayList.get(counter)+" ");
//        }
//        System.out.println();
//        System.out.println(arrayList.size());
        }
    }

