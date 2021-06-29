package ChapterEight;

import chapterEight.EnhancingTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnhancingTimeTest {
    EnhancingTime enhancingTime;
    @BeforeEach
    void setUp() {
      enhancingTime=new EnhancingTime();
    }

    @AfterEach
    void tearDown() {
       enhancingTime=null;
    }
    @Test
    void incrementingSecondsTest(){
        enhancingTime=new EnhancingTime(23,4,45);
        enhancingTime.incrementSeconds();
        System.out.println(enhancingTime.getSeconds());
        assertEquals(46,enhancingTime.getSeconds());
    }
    @Test
    void incrementingMinutesTest(){
        enhancingTime=new EnhancingTime(23,4,45);
        enhancingTime.incrementMinute();
        System.out.println(enhancingTime.getMinute());
        assertEquals(5,enhancingTime.getMinute());
    }
    @Test
    void incrementingHourTest(){
        enhancingTime=new EnhancingTime(13,4,45);
        enhancingTime.increaseHour();
        System.out.println(enhancingTime.getHour());
        assertEquals(14,enhancingTime.getHour());
    }
    @Test
    void incrementingSecondsIntoTheNextMinute(){
        enhancingTime=new EnhancingTime(23,4,45);
        enhancingTime.incrementSeconds();
        System.out.println(enhancingTime.getSeconds());
        System.out.println(enhancingTime.getMinute());
        assertEquals(46,enhancingTime.getSeconds());
        System.out.println(enhancingTime.toUniversalTime());
    }
@Test
    void incrementingToTheNext(){
    enhancingTime=new EnhancingTime(0,0,0);
    enhancingTime.tick(84960);
//    System.out.println(enhancingTime.getSeconds());
//    System.out.println(enhancingTime.getMinute());
//    System.out.println(enhancingTime.getHour());
    System.out.println(enhancingTime.toUniversalTime());
    System.out.println(enhancingTime.toString());
    System.out.println(enhancingTime.getDay()+" day");
}
}
