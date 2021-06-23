package ChapterSeventeen;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraysAndStreams1 {
    public static void main(String[] args) {
        String [] strings={"Red","Blue","Pink","Green","Orange","Violet"};
        System.out.printf("The Original string is %s%n", Arrays.asList(strings));

        System.out.printf("strings in uppercase: %s%n",
                Arrays.stream(strings)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList())
                );



        System.out.printf("strings in lowercase: %s%n",
                Arrays.stream(strings)
                        .map(String::toLowerCase)
                        .collect(Collectors.toList())
        );
        System.out.printf("strings greater than m sorted as ascending order: %s%n",
                Arrays.stream(strings)
                        .filter(s->s.compareToIgnoreCase("n")<0)
                        .collect(Collectors.toList())
        );

        System.out.printf("strings greater than m sorted as ascending order: %s%n",
                Arrays.stream(strings)
                        .filter(s->s.compareToIgnoreCase("n")>0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList())
        );

        System.out.printf("strings greater than m sorted as descending order: %s%n",
                Arrays.stream(strings)
                        .filter(s->s.compareToIgnoreCase("n")>0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList())
        );

    }
}
