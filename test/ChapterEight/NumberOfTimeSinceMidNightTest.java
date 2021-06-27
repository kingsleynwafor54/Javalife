package ChapterEight;

import chapterEight.NumberOfSecondsSinceMidNight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfTimeSinceMidNightTest {
    NumberOfSecondsSinceMidNight numberOfSecondsSinceMidNight;
    @BeforeEach
    void setUp() {
        numberOfSecondsSinceMidNight=new NumberOfSecondsSinceMidNight();
    }

    @AfterEach
    void tearDown() {
      numberOfSecondsSinceMidNight=null;
    }

    @Test
    void canTestForTheSeconds(){
        numberOfSecondsSinceMidNight=new NumberOfSecondsSinceMidNight(1,30,30);
        assertEquals(30,numberOfSecondsSinceMidNight.getSeconds());
    }
    @Test
    void canTestForTheMinute(){
        numberOfSecondsSinceMidNight=new NumberOfSecondsSinceMidNight(1,30,30);
        assertEquals(30,numberOfSecondsSinceMidNight.getMinute());
    }
    @Test
    void canTestForHour(){
        numberOfSecondsSinceMidNight=new NumberOfSecondsSinceMidNight(1,30,30);
        assertEquals(1,numberOfSecondsSinceMidNight.getHour());
    }

    @Test
    void convertTimeToNumberOfSecondsFromMidNight() {
        numberOfSecondsSinceMidNight = new NumberOfSecondsSinceMidNight(1, 30, 30);
        assertEquals(5430, numberOfSecondsSinceMidNight.numberOfSecondsSinceMidnight());
    }
}
