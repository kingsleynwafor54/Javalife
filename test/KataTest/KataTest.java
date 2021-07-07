package KataTest;

import Kata.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    Kata kata=new Kata();
    @Test
    void nextNumberTest(){

        assertEquals(7,kata.nextNumberInTheSeries(1,3,5));

    }
@Test
    void findingTheNextFiveNumbers(){

     kata.nextNumberFinder(2,4,6);

}
@Test
    void findingTheNextSeries(){
        kata.nextSeriesOfNumber(1,3,5);
}
}
