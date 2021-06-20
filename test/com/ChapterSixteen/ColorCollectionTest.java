package com.ChapterSixteen;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColorCollectionTest {
    ColorCollection colorCollection;
    @BeforeEach
    void beforeEach(){
        colorCollection=new ColorCollection();
    }
@AfterEach
    void afterEach(){
        colorCollection=null;
}

@Test
    void addingIntoCollectionsUsingArrayList(){
   ColorCollection  colorCollection =new ColorCollection("Yellow");
   ColorCollection  colorCollection1 =new ColorCollection("White");
   ColorCollection  colorCollection2=new ColorCollection("Green");
   ColorCollection  colorCollection3=new ColorCollection("Pink");
   ColorCollection  colorCollection4=new ColorCollection("Blue");
    List<ColorCollection>colors=new ArrayList<>();
    colors.add(colorCollection);
    colors.add(colorCollection1);
    colors.add(colorCollection2);
    colors.add(colorCollection3);
    colors.add(colorCollection4);
            for(int counter=0;counter<colors.size();counter++){
                System.out.println(colors.get(counter));
            }

    assertEquals(5, colors.size());
    }
    @Test
    void addingIntoCollectionsUsingLinkedList(){
        ColorCollection  colorCollection =new ColorCollection("Yellow");
        ColorCollection  colorCollection1 =new ColorCollection("White");
        ColorCollection  colorCollection2=new ColorCollection("Green");
        ColorCollection  colorCollection3=new ColorCollection("Pink");
        ColorCollection  colorCollection4=new ColorCollection("Blue");

        List<ColorCollection>colors=new LinkedList<>();
        colors.add(colorCollection);
        colors.add(colorCollection1);
        colors.add(colorCollection2);
        colors.add(colorCollection3);
        colors.add(colorCollection4);

        for(int counter=0;counter<colors.size();counter++){
            System.out.println(colors.get(counter));
        }
        assertEquals(5, colors.size());

    }
    @Test
    void usingStaticMethodsOfTheCollectionClassToPerformIterationTask(){
        ColorCollection  colorCollection =new ColorCollection("Yellow");
        ColorCollection  colorCollection1 =new ColorCollection("White");
        ColorCollection  colorCollection2=new ColorCollection("Green");
        ColorCollection  colorCollection3=new ColorCollection("Pink");
        ColorCollection  colorCollection4=new ColorCollection("Blue");
        ColorCollection  colorCollection5=new ColorCollection("Blue");
        ColorCollection  colorCollection6=new ColorCollection("Blue");
        ColorCollection  colorCollection7=new ColorCollection("Blue");
        List<ColorCollection>colors=new LinkedList<>();
        colors.add(colorCollection);
        colors.add(colorCollection1);
        colors.add(colorCollection2);
        colors.add(colorCollection3);
        colors.add(colorCollection4);

        List<ColorCollection>color=new LinkedList<>();
        color.add(colorCollection);
        color.add(colorCollection1);
        color.add(colorCollection2);
        color.add(colorCollection3);
        color.add(colorCollection4);
        color.add(colorCollection5);
        color.add(colorCollection6);
        removeColor(color,colors);
        color.add(colorCollection7);

        for(int counter=0;counter<color.size();counter++){
            System.out.println(color.get(counter));
        }

        assertEquals(3, color.size());

    }
private static void removeColor(Collection<ColorCollection> collection1,Collection<ColorCollection> collection2){
    Iterator<ColorCollection> iterator = collection1.iterator();
//    collection1.removeIf(collection2::contains); this also performs the-same task as
//the whole of the program inside this coil-braces  (from 97 to 103)
   while (iterator.hasNext()){

if(collection2.contains(iterator.next())){
     iterator.remove();

}
    }

}
@Test
    void useArraylistAndLinkedListInDemonstratingCollectionsStaticMethod(){
        ColorCollection colorCollection=new ColorCollection("White");
        ColorCollection colorCollection1=new ColorCollection("Black");
        ColorCollection colorCollection2=new ColorCollection("Pink");
        ColorCollection colorCollection3=new ColorCollection("Purple");
        ColorCollection colorCollection4=new ColorCollection("Green");
        ColorCollection colorCollection5=new ColorCollection("Red");
        ColorCollection colorCollection6=new ColorCollection("Orange");
    ColorCollection[] collections={colorCollection,colorCollection1,colorCollection2};
    ColorCollection[] collections1={colorCollection,colorCollection1,colorCollection2,colorCollection3,colorCollection4,colorCollection5,colorCollection6};
    List<ColorCollection>list1=new LinkedList<>();
    List<ColorCollection>list2=new LinkedList<>();
//   for(ColorCollection color:collections) {
//   list1.add(color);
//   }

   for(int counter=0;counter<collections.length;counter++){
       list1.add(collections[counter]);
   }
    for(int counter=0;counter<collections1.length;counter++){
        list2.add(collections1[counter]);
    }


for (int counter=0;counter<list1.size();counter++) {
    System.out.println(list1.get(counter));
}
    for (int counter=0;counter<list2.size();counter++) {
        System.out.println(list2.get(counter));
    }
    list1.addAll(list2);
    printList(list1);
    String[] list={"kingsley","John","kings","House","Paint"};
    List<String> stringList=new LinkedList<>();

    System.out.println(stringList);
    for(String string:stringList){
         convertToUppercaseStrings(stringList);
    }

// before the addAll method to list1
//assertEquals(3,list1.size());
//after the add allAdd all method to list1
    assertEquals(10,list1.size());
assertEquals(7,list2.size());
    }
    private static void printList(List<ColorCollection> list){
        for(int counter=0;counter<list.size();counter++){
            System.out.println(list.get(counter));
            System.out.println();
        }
    }
    private static void convertToUppercaseStrings(List<String> collections){
        ListIterator<String> iterator = collections.listIterator();
   while(iterator.hasNext()){
       String collection=iterator.next();
       iterator.set(collection.toUpperCase());
   }

    }


}
