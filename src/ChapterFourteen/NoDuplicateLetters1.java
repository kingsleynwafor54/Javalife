package ChapterFourteen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class NoDuplicateLetters1 {
    public static boolean noDuplicateLetters(String word) {
        boolean result1 = false;
        String word1=word.toLowerCase(Locale.ROOT);
        String[] words = word1.split("");
        Set<String> wordSet = new HashSet<>();
        for (int count = 0; count < words.length; count++) {
            wordSet.add(words[count]);
            if (words.length == wordSet.size()) {

                result1 = true;
            }
        }
        return result1 ;
    }
    public static void main(String[] args) {
        String word="kingsleymyMan";
        System.out.println(noDuplicateLetters(word));
    }
}
