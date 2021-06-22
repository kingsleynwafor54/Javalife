package com.ChapterSixteen;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {
    //    Collection collection;
//    @BeforeEach
//    void setUp() {
//        collection=new Collection();
//    }
//
//    @AfterEach
//    void tearDown() {
//        collection=null;
//    }
//    @Test
//    void collectionFirstTest(){
//        assertNotNull(collection);
//    }
    @Test
    void collectionSecondTest() {

        Laptops collection1 = new Laptops("Kingsley");
        Laptops collection2 = new Laptops("Joseph");
        Laptops collection3 = new Laptops("Mama");
        Laptops collection4 = new Laptops("John");
        Laptops collection5 = new Laptops("Daniel");
        Laptops collection6 = new Laptops("Paul");
        List<Laptops> collections = new ArrayList<>();
        collections.add(collection1);
        collections.add(collection2);
        collections.add(collection3);
        collections.add(collection4);
        collections.add(collection5);
        collections.add(collection6);
        assertEquals(6, collections.size());
        for (int counter = 0; counter < collections.size(); counter++) {
            System.out.println((collections.get(counter)));
        }
    }

    @Test
    void addingIntoCollectionUsingLinkedListTest() {

        Laptops collection1 = new Laptops("Kingsley");
        Laptops collection2 = new Laptops("Joseph");
        Laptops collection3 = new Laptops("Mama");
        Laptops collection4 = new Laptops("John");
        Laptops collection5 = new Laptops("Daniel");
        Laptops collection6 = new Laptops("Paul");
        List<Laptops> collections = new LinkedList<>();
        collections.add(collection1);
        collections.add(collection2);
        collections.add(collection3);
        collections.add(collection4);
        collections.add(collection5);
        collections.add(collection6);
        assertEquals(6, collections.size());
        for (int counter = 0; counter < collections.size(); counter++) {
            System.out.println((collections.get(counter)));
        }
    }

    @Test
    void operationOnLinkedListTest() {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        links.addLast("red");
        links.add("pink");
        links.add(3, "green");
        links.addFirst("cyan");
        // geting LinkedList element as an array
        colors = links.toArray(new String[links.size()]);
        System.out.println("colors: ");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println(Arrays.toString(colors));

    }

    @Test
    void methodTwo() {
        int [] Score={23,34,56,45,56,34,45};
        isEqual(67,Score);
//        System.out.println( practice());
//        System.out.println( practice1());
    }

    private static void practice() {
        int [] Score={23,34,56,45,56,34,45};
        int temp ;
        for(int counter=0; counter < Score.length; counter++){
            for(int count=1; count < Score.length-counter; count++){
                if(Score[count-1] > Score[count]){
                    //swap elements
                    temp = Score[count-1];
                    Score[count-1] = Score[count];
                    Score[count] = temp;
                }

            }
        }
        isEqual(67,Score);
//return Arrays.toString(Score);
    }
    private static String practice1() {
        int [] Score={23,34,56,45,56,34,45};
        int temp = 0;
        for(int counter=0; counter < Score.length; counter++){
            for(int count=1; count < Score.length-counter; count++){
                if(Score[count-1] < Score[count]){
                    //swap elements
                    temp = Score[count-1];
                    Score[count-1] = Score[count];
                    Score[count] = temp;
                }

            }
        }
        return Arrays.toString(Score);
    }
    public static boolean isEqual(int flightLength,int[] movie){
        boolean isEqual=false;
        for(int counter=0;counter<movie.length;counter++){
            for(int count=counter+1;count<movie.length;count++){
                if(movie[counter]+movie[count]==flightLength){
                    System.out.println(counter+" "+count);
                    isEqual=true;
                }
            }
        }
    return isEqual;
    }

    private static void isEqual(int[] array){

    }
}