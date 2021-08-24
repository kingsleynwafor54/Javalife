package ChapterFourteen;

public class NumbersToWords {
    public static void main(String[] args) {
        String[] numbers={"one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","twelve","thirteen","fourteen","fifteen",
        "sixteen","seventeen","eighteen","nineteen","twenty","twentyOne","twentyTwo","twentyThree","TwentyFour","TwentyFive","TwentySix","TwentySeven",
        "twentyNine","thirty","thirtyOne","thirtyTwo","thirtyThree","thirtyFour","thirtyFive","thirtySix","thirtySeven","thirtyEight","thirtyNine","forty",
        "fortyOne","fortyTwo","fortyThree","fortyFour","fortyFive","fortySix","fortySeven","fortyEight","fortyNine","fifty","fiftyOne","fiftyTwo","FiftyThree",
        "fiftyFour","fiftyFive"};
        String[] numbers3={"","","Hundred","Thousand","Million","Billion","Trillion"};

        String num="1234";
        int num2=Integer.parseInt(num);
        String converter="";
        int remainder=0;
        int normal=0;
        int normal2=1000;
      while(num2>0){
          normal=num2/normal2;

          converter=""+numbers[normal-1]+numbers3[num.length()-1]+"";
          remainder=num2%10;
          num2=remainder;
          normal2=normal2/10;
                num2=  num2/10;
      }
        System.out.println(converter);
    }
}
