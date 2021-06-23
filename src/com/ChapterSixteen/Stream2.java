package com.ChapterSixteen;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.Scanner;

public class Stream2 {

    public void saveNumbers(){
        try (Formatter formatter = new Formatter("number.txt");
             Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Students records and ENTER + CTRL + D to stop");

            formatter.format("%s%10s%n", "Rating", "Frequency");

            while (input.hasNext()) {
                int Rating = input.nextInt();
                int Frequency = input.nextInt();

                formatter.format("%6d%10d%n", Rating, Frequency);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Stream2 numberFrequency = new Stream2();
        numberFrequency.saveNumbers();
    }
}