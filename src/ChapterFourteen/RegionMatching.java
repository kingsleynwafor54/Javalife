package ChapterFourteen;

import java.util.Locale;

public class RegionMatching {
    public static int numberOfOccurrenceOfAStringInASentence(String word,String wordToMatch) {
        int count = 0;
        int start = 0;
        int county = 0;
       int counter=0;
        String word2 = word.toLowerCase(Locale.ROOT);
      for( count=0;count<word.length();count++){
          for ( counter =count+ counter < word.length()+county; counter++) {
                if (counter % 4 == 0) {
                    System.out.println();
                }

                System.out.print(word2.charAt(counter));
                if (word.regionMatches(counter, wordToMatch, counter, 4)) {
                    count++;
                }
            }

            county++;
            start++;
        }


        System.out.println(start);
        return count;
    }
        public static  void main(String... args){
        String s1="Kojo";
        String s2="bolaleKojo";
        if(s2.regionMatches(0,s1,0,9)){
            System.out.println("correct");
        }
        else
            System.out.println("you lie");

        System.out.println(numberOfOccurrenceOfAStringInASentence(s2,s1));
    }


}
