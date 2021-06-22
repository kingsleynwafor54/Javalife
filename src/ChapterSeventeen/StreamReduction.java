package ChapterSeventeen;


import java.util.stream.IntStream;

public class StreamReduction {
    public static void main(String[] args) {
        System.out.printf("Sum of the even numbers from 1to 20 is :%d%n",
                IntStream.rangeClosed(1,10)
                         .map(x->(x%2*3))
                          .sum()

                );
    }
}
