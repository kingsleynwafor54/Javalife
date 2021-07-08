package Kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IndexSearch {
    ArrayList<Integer> list1=new ArrayList<>();
  public void FindingTheStartAndEndOfANumberAfterSortingAnArray(int[] numbers,int n){
      int [] numb={-1,-1};

      Arrays.sort(numbers);
      System.out.println(Arrays.toString(numbers));
      int counter;
      for( counter=0;counter<numbers.length;counter++){
          if(numbers[counter]==n){
             list1.add(counter);

          }
      }
     if(list1.size()==0){
         System.out.println(Arrays.toString(numb));
     }
     else
         System.out.println(list1);
  }

    public static void main(String[] args) {

      IndexSearch indexSearch=new IndexSearch();
      int [] arrays={2,4,3,4,4,5,6,7,8};
      indexSearch.FindingTheStartAndEndOfANumberAfterSortingAnArray(arrays,1);
    }
}
