package ChapterSeventeen;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class LambdasPracticesTest {
    @Test
    void methodOne(){
        LambdasPractice lambdasPractice=new LambdasPractice();


        int[] values={3,10,4,5,6,7,8,9,4,10};
        System.out.println("Original values: ");
        IntStream.of(values)
                .forEach((value -> System.out.printf("%d ", value)));
    }
}
