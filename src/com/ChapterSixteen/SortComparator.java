package com.ChapterSixteen;

import chapterEight.EnhancingTime;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortComparator {
    public static void main(String[] args) {
        List<EnhancingTime>list=new ArrayList<>();
        list.add(new EnhancingTime(6,24,34));
        list.add(new EnhancingTime(18,14,58));
        list.add(new EnhancingTime(6,05,34));
        list.add(new EnhancingTime(6,24,24));
        System.out.printf("Unsorted array elements:%n%s%n", list);
        Collections.sort(list,new TimeComparator());
        System.out.printf("Sorted list elements:%n%s%n", list);

//        String[] arr={"1","2","3","4"};
//        List<String> ls= Arrays.asList(arr);
//        Collections.sort(ls);
    }
}
