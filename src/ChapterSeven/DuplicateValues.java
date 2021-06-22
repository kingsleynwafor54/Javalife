package ChapterSeven;

import java.util.Arrays;


public class DuplicateValues {

    public String getDuplicateValues(int[] scores) {

        int counts = 0;
        for (int counter = 0; counter < scores.length; counter++) {
            for (int count = counter + 1; count < scores.length; count++) {
                if (scores[counter] == scores[count]) {
                    scores[counter] = 0;

                        if (scores[counter] != 0) {
                            System.out.println(scores[counter]);
                            counts++;
                        }
                    }
                    System.out.println("Your new length is: " + counts);

                }




        }
   return "";
    }
}