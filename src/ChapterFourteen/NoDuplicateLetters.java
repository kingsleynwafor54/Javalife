package ChapterFourteen;

import java.util.Arrays;
import java.util.Locale;

public class NoDuplicateLetters {
    public static boolean noDuplicateLetters(String word){
        boolean result=false;

       String[] words=word.split("");
        System.out.println(Arrays.toString(words));
        for(int counter=0;counter<words.length;counter++){
            for(int count=counter+1;count<words.length;count++){
                if(words[counter].equalsIgnoreCase(words[count])){

                    System.out.println(words[counter]+" "+ words[count]);
                    result= true;

                }
            }
        }
    return result;
    }
    public static void main(String[] args) {
        String word="kingsleybigge";
        System.out.println(!noDuplicateLetters(word));
    }
}
