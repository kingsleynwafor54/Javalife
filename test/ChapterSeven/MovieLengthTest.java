package ChapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovieLengthTest {
    MovieLength movieLength;
    @BeforeEach
    void setUp() {
         movieLength=new MovieLength();
    }

    @AfterEach
    void tearDown() {
       movieLength=null;
    }
@Test
    void movieLengthIsNotVoidTest(){
        assertNotNull(movieLength);
}
    @Test
    void movieLengthCanBeDetectedTest(){
        int[] airLineMovieThings={50,50,40,10,40,50};
       assertTrue(movieLength.isMovieLengthEqualsToAirLineTime(airLineMovieThings,100));

    }
}
