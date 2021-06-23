package com.ChapterSixteen;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Stream {


    private static Formatter formatter;

    public static void openFile() {

        try {
            formatter = new Formatter("numbers.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public static void addRecord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Survey response");
        while (input.hasNext()) {

            try {
                formatter.format("Responses\n");
                formatter.format("%s\n %s\n %s\n %s\n", input.next(), input.next(), input.next(), input.next(), input.nextInt());
            } catch (NoSuchElementException elementException) {
                System.out.println("Invalid input. Please try again");
                input.nextLine();
            } catch (SecurityException securityException) {
                System.out.println("Permission Denied");
            }
        }
    }

    public static void closeFile() {
        if (formatter != null)
            formatter.close();
    }

    public static void main(String[] args) {
        openFile();
        addRecord();
        closeFile();
    }
}