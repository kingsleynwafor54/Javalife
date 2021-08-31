package ChapterSeventeen;

import java.util.stream.IntStream;

public class LambdaPractices {
    public static void main(String[] args) {
        System.out.printf("sum of 1 through a 10 %d%n",
                IntStream.rangeClosed(1,10)
                        .sum());
        int total=IntStream.rangeClosed(1,10)
                .sum();
        System.out.println(total);
        int total1=0;
        // external ways of summing even numbers
        for(int counter=2;counter<=20;counter+=2){
            total1+=counter;
        }
        System.out.println(total1);


        System.out.printf("Time 2 of 1 through a 10 %d%n",
                IntStream.rangeClosed(1,10)
                        .map((int x)->{return x*2;})
                .sum());


        System.out.printf("Time 2 of 1 through a 10  and multiplying by 3 = %d%n",
                IntStream.rangeClosed(1,10)
                        .filter(x-> x%2==0)
                        .map(x->x*3)
                        .sum());

        //    using internal
        // This an example of reduction

    }

}
