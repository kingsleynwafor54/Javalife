package ChapterFourteen;

import java.util.Arrays;

public class ArrangementWords {
    public static void main(String[] args) {
        String word = "a3 boy4 i2s this1 hte5 tyt7 dkdk6jfjjf ";
        String[] words = word.split(" ");
        String[] word1 = new String[words.length];
        System.out.println(Arrays.toString(words));
        for (int count = 0; count < words.length; count++) {
            if (words[count].contains("1")) {

                word1[0] = words[count];
            }
           else if (words[count].contains("2")) {

                word1[1] = words[count];
            }
              else if (words[count].contains("3")) {

                word1[2] = words[count];
            }

           else if (words[count].contains("4")) {
                word1[3] = words[count];
            }
           else if (words[count].contains("5")) {

                word1[4] = words[count];
            }
          else  if (words[count].contains("6")) {

                word1[5] = words[count];
            }

           else if (words[count].contains("7")) {

                word1[6] = words[count];
            }
           else if (words[count].contains("8")) {

                word1[7] = words[count];
            }
         else if (words[count].contains("9")) {

                word1[8] = words[count];
            }

        }

        System.out.println(Arrays.toString(word1));
    }
}
