package com.ChapterSixteen;

import java.util.Arrays;
import java.util.LinkedList;

public class CopyingAndReversingALinkedList {
    public static void main(String[] args) {
        String[] suits={"Hearts","King","Clubs","James"};
        LinkedList<String> list= new LinkedList<>();
        System.out.println("List  "+list);
        for(int counter=0;counter<suits.length;counter++){
            list.add(suits[counter]);
        }
        System.out.println("Actual Linkedlist:"+list);
        //copying a list to copy
      LinkedList<String> copy= (LinkedList<String>) list.clone();
        System.out.println("The copied LinkedList is "+copy);
        for(int count= suits.length-1;count>=0;count--){
            System.out.print(copy.get(count)+" ");
        }

    }
}
