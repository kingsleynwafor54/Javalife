package ChapterSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HangmanGame {
    public static void hangmanGame(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> arraysList = new ArrayList<>();
        String[] secondArrays = {"P", "r", "o", "g", "r", "a", "m"};
        String[] secondArrays1 = {"H", "o", "l", "o", "g", "r", "a", "m"};
        String[] secondArrays2 = {"H", "i", "s", "t", "o", "g", "r", "a", "m"};
        String[] secondArrays3 = {"P", "r", "e", "a", "c", "h"};
        arraysList.add(secondArrays);
        arraysList.add(secondArrays1);
        arraysList.add(secondArrays2);
        arraysList.add(secondArrays3);
        System.out.println("""
                        CLUE!!!!
                1 The first word is  a sequence of order
                2 The second is a shape with a hole in between
                3 The third is graphical representation of data
                4 The teaching of a clergy""");
        int c = 0;
        while (c != -1||c<arraysList.size()) {
            String[] array = new String[arraysList.get(c).length];
            Arrays.fill(array, "*");
            int counter = 0;
            int counter1 = 0;
            String words = "";
            String[] getArray = arraysList.get(c);
            for (; counter < array.length; counter++) {
                System.out.println("Enter a letter");
                words = scanner.next();
                if (words.equals(getArray[counter])) {
                    array[counter] = words;
                    counter1++;
                } else System.out.println("You gat it wrong");
            }
            for (int count = 0; count < array.length; count++)
                System.out.print(array[count] + " ");
            System.out.println();
            System.out.println("You have " + (secondArrays.length - counter1) + "miss(es)");

            System.out.println("Please type "+"yes"+"to continue the game");
            String yes = scanner.next();
            if (yes.equals("yes")) {
                c++;
            } else c = -1;
        }
    }
    public static void main(String[] args) {
     hangmanGame();
    }
}


