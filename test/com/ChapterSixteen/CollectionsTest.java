package com.ChapterSixteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

public class CollectionsTest {
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void methodOne() {
        String[] suits = {"Heart", "Diamonds", "Club", "Suit"};
       LinkedList<String> list = new LinkedList<>();
       for(int count=0;count<suits.length;count++){
           list.add(suits[count]);
       }
        LinkedList<String> linkedList = (LinkedList<String>) list.clone();

Collections.sort(linkedList,Collections.reverseOrder());

        System.out.println(linkedList);
    }

}
