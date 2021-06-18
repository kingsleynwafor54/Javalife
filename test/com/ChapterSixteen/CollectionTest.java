package com.ChapterSixteen;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
    void collectionSecondTest(){

          Laptops collection1=new Laptops("Kingsley");
          Laptops collection2=new Laptops("Joseph");
          Laptops collection3=new Laptops("Mama");
          Laptops collection4=new Laptops("John");
          Laptops collection5=new Laptops("Daniel");
          Laptops collection6=new Laptops("Paul");
        List<Laptops>collections=new ArrayList<>();
        collections.add(collection1);
        collections.add(collection2);
        collections.add(collection3);
        collections.add(collection4);
        collections.add(collection5);
        collections.add(collection6);
       assertEquals(6,collections.size());
       for(int counter=0;counter<collections.size();counter++){
           System.out.println((collections.get(counter)));
       }
    }
    @Test
    void addingIntoCollectionUsingLinkedListTest(){

        Laptops collection1=new Laptops("Kingsley");
        Laptops collection2=new Laptops("Joseph");
        Laptops collection3=new Laptops("Mama");
        Laptops collection4=new Laptops("John");
        Laptops collection5=new Laptops("Daniel");
        Laptops collection6=new Laptops("Paul");
        List<Laptops>collections=new LinkedList<>();
        collections.add(collection1);
        collections.add(collection2);
        collections.add(collection3);
        collections.add(collection4);
        collections.add(collection5);
        collections.add(collection6);
        assertEquals(6,collections.size());
        for(int counter=0;counter<collections.size();counter++){
            System.out.println((collections.get(counter)));
        }
    }

}