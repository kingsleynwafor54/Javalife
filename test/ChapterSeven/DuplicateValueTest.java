package ChapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DuplicateValueTest {
    DuplicateValues duplicateValues=new DuplicateValues();
    @Test
    void verifyThatAParticularNumberIsAMemberOfAnArray(){
        int[] scores={23,25,24,24,23,23,25,23};


        System.out.println( duplicateValues.getDuplicateValues(scores));
     //  assertEquals(duplicateValues.getDuplicateValues(scores));
    }


}
