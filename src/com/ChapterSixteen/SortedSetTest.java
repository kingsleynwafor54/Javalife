package com.ChapterSixteen;

import java.util.Arrays;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        String [] colors={"yellow","black","pink","orange","blue"};
        SortedSet<String>tree=new TreeSet<>(Arrays.asList(colors));
        printSet(tree);
        System.out.println("Fetching out the first element of the set");
        System.out.println(tree.first());
    }
    private static void printSet(SortedSet<String> set ){
        for(String s:set){
            System.out.println(s);
        }
    }
}
