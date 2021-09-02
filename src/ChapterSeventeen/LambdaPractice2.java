package ChapterSeventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class LambdaPractice2 {
    public static void main(String[] args) {
        Integer[] values={2,5,1,4,6,8,3,9,0,7};
        System.out.println("Printing the array as list "+ Arrays.asList(values));
  List<Integer> values1   =   Arrays.stream(values)
                .sorted()
               .collect(Collectors.toList());
        System.out.println(values1);

//filtering values that are greater than four
        List<Integer> values2  =   Arrays.stream(values)
                .sorted()
                .filter(value->value>4)
                .collect(Collectors.toList());
        System.out.println(values2);


        //filtering values that are less than four
        List<Integer> values3  =   Arrays.stream(values)
                .sorted()
                .filter(value->value<4)
                .collect(Collectors.toList());
        System.out.println(values3);

//        Double[] val={1.0,2.1,2.4,3.5,5.6};
//        Arrays.asList(val);
//        List<Double> val1=Arrays.stream(val)
//                .map(val)

        System.out.println(    DoubleStream.of(1.3,2.4)
                .sum());
        int[] value1={2,5,1,4,6,8,3,9,0,7};
        System.out.printf("%nCount: %d%n",IntStream.of(value1).count() );
String[] strings={"kingsley","Amaka","Onyinye","Chukwudi","Franklin"};
        System.out.printf("%s%n",
                Arrays.stream(strings)
                .map(String::toUpperCase)
                .collect(Collectors.toList()));

        System.out.printf("%nCount: %d%n",IntStream.of(value1).count() );
        String[] strings1={"kingsley","Amaka","Onyinye","Chukwudi","Franklin"};
        System.out.printf("%s%n",
                Arrays.stream(strings1)
                        .filter(s->s.compareToIgnoreCase("a")>0)
                        .map(String::toUpperCase)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));

        double sumOfElements = DoubleStream.of(2.2, 4.2, 6.4,
                -2.5, -4.5)
                .filter(num -> num > 2.5)
//                .map()
                .sum();

        // Displaying the calculated sum
        System.out.println(sumOfElements);

    }
}
