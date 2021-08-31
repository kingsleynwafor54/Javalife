package com.ChapterSixteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyreTest {
    MyreBriggs myreBriggs;
    Question question;
    @BeforeEach
    void setUp() {
        myreBriggs=new MyreBriggs();
        question=new Question();
    }

    @Test
    void test1() {
        assertNotNull(myreBriggs);
        myreBriggs.setQuestion(question);
        System.out.println(myreBriggs.getQuestion()[1]);
       assertEquals(5,myreBriggs.getQuestion().length);
    }
}
