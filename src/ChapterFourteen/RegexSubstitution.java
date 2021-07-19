package ChapterFourteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "This string ends with 5 starts *****";
        String secondString = "1,4,3,2,5,6,7,8";
        System.out.printf("Original String 1:%s%n", firstString);
        firstString = firstString.replaceAll("\\*", "\\^");
        System.out.printf("^ substituted for *:%s%n", firstString);


        firstString = firstString.replaceAll("starts", "carets");
        System.out.printf("starts is substituted for carets :%s%n", firstString);
        //comment
        firstString = firstString.replaceAll("\\w+", "words");
        System.out.printf("Original String 2: %s%n", firstString);
        for (int counter = 0; counter < 3; counter++) {
            secondString = secondString.replaceFirst("\\d", "digit");

        }
        System.out.printf("Original String 2: %s%n", secondString);
        String[] results = secondString.split(",\\s*");
        System.out.println(Arrays.toString(results));


        String thirdString = "the, man ,is, going, the ,church,to, pray";
        String FourthString = "the man is going the church to pray";
        String[] kString = thirdString.split(",");
        String[] JString = FourthString.split(",");
        System.out.println(Arrays.toString(kString));
        System.out.println(Arrays.toString(JString));
        String word = "1this,a3, man5,9boy,kjfj6,jfjf7,irjfn8,2is";
        String[] words = word.split(",");

        String[] arrayList = new String[words.length];

        //  Set<String> arrayList = new HashSet<String>();

     int counter=0;

        while (counter < words.length) {
            for (int count = 0; count < words.length; count++) {
                if (words[count].contains("1")) {
                    arrayList[counter] = words[count];
                }
            }
            counter++;
            while (counter < words.length) {
                for (int count = 0; count < words.length; count++) {
                    if (words[count].contains("2")) {
                        arrayList[counter] = words[count];
                    }
                }
                counter++;
                while (counter < words.length) {
                    for (int count = 0; count < words.length; count++) {
                        if (words[count].contains("3")) {
                            arrayList[counter] = words[count];
                        }
                    }
                    counter++;
                    while (counter < words.length) {
                        for (int count = 0; count < words.length; count++) {
                            if (words[count].contains("4")) {
                                arrayList[counter] = words[count];
                            }
                        }
            counter++;
                        while (counter < words.length ){
                            for (int count = 0; count < words.length; count++) {
                                if (words[count].contains("5")) {
                                    arrayList[counter] = words[count];
                                }
                            }
                counter++;
                            while (counter < words.length ){
                                for (int count = 0; count < words.length; count++) {
                                    if (words[count].contains("6")) {
                                        arrayList[counter] = words[count];
                                    }
                                }
                                counter++;
                                while (counter < words.length){
                                    for (int count = 0; count < words.length; count++) {
                                        if (words[count].contains("7")) {
                                            arrayList[counter] = words[count];
                                        }
                                    }
                                    counter++;
                                    while (counter < words.length ){
                                        for (int count = 0; count < words.length; count++) {
                                            if (words[count].contains("8")) {
                                                arrayList[counter] = words[count];
                                            }
                                        }
                                        counter++;
                                        while (counter < words.length ){
                                            for (int count = 0; count < words.length; count++) {
                                                if (words[count].contains("9")) {
                                                    arrayList[counter] = words[count];
                                                }
                                            }
                        counter++;
                        System.out.println(Arrays.toString(arrayList));
                    }
                }

            }
        }

    }} }}}}}
