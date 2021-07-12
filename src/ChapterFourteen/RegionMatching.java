package ChapterFourteen;

import java.util.Locale;

public class RegionMatching {
    public static int numberOfOccurrenceOfAStringInASentence(String s2, String s1) {
        String word=s2.toLowerCase(Locale.ROOT);
        int counter = 0;
        for (int count = 0; count < s2.length(); count++) {
            if (word.regionMatches(count, s1, 0, 4)) {

                counter++;

            }
        }
        return counter;
    }

    public static void main(String... args) {
        String s1 = "lale";
        String s2 = "bolaleklale";
        System.out.println(numberOfOccurrenceOfAStringInASentence(s2,s1));

    }
}