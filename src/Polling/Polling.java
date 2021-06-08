package Polling;

import java.security.SecureRandom;
import java.util.Scanner;

public class Polling {
int[][]ratings=new int[5][10];
    int counter = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0, counter6 = 0, counter7 = 0, counter8 = 0, counter9 = 0, counter10 = 0;
    int counter11= 0, counter12 = 0, counter13 = 0, counter14 = 0, counter15 = 0, counter16 = 0, counter17 = 0, counter18 = 0, counter19 = 0, counter20 = 0;
    int counter21= 0, counter22 = 0, counter23 = 0, counter24 = 0, counter25 = 0, counter26 = 0, counter27 = 0, counter28 = 0, counter29 = 0, counter30 = 0;
    int counter31= 0, counter32 = 0, counter33 = 0, counter34 = 0, counter35 = 0, counter36 = 0, counter37 = 0, counter38 = 0, counter39 = 0, counter40 = 0;
    int counter41= 0, counter42 = 0, counter43 = 0, counter44 = 0, counter45 = 0, counter46 = 0, counter47 = 0, counter48 = 0, counter49 = 0, counter50 = 0;





    String voterApathy = "Rate how people vote ---------?" ;
    String depression = "Rate how you handle depression?" ;
    String Poverty = "How much do you have in ur aza?" ;
    String climateChange = "Rate the color of the sky to d?" ;
    String GenderInequality = "How do men and women relate---?" ;
    String[] courses = {voterApathy, depression, Poverty, climateChange, GenderInequality};

    public void display() {
        for (int counter = 0; counter < courses.length; counter++) {
            System.out.println(courses[counter]);
        }
    }

    public void displayEverything() {
        SecureRandom random = new SecureRandom();
        int rand = 0;
        int total = 0;
        double average= 0;
        for (int counter = 0; counter < ratings.length; counter++) {
            System.out.printf(courses[counter] + " ");
            for (int count = 0; count < ratings[counter].length; count++) {
                rand = random.nextInt(10);
               ratings[counter][count] = rand;

                total += rand ;
                average=total/10.0;
                System.out.printf("%3d",ratings[counter][count] = rand);


            }

            System.out.printf("%3s%.2f "," ",average);
            System.out.printf("%3s%2d "," ",total);
            System.out.println();
            total=0;
            average=0;
        }
    }

    public void displayEverything2() {
        for (int counter = 0; counter < ratings.length; counter++) {
            System.out.printf(courses[counter] + " ");
            for (int count = 0; count < ratings[counter].length; count++) {

                System.out.printf("%3d", ratings[counter][count]);


            }
            System.out.println();
        }
    }

    public void displayCode() {
        int question=0, numbers=0;
        Scanner scanner = new Scanner(System.in);

        while (question != -1) {

            System.out.println("Enter question");
            question = scanner.nextInt();
            System.out.println("enter rating");
            numbers = scanner.nextInt();


            if (question == 1) {
                switch (numbers) {
                    case 1:

                        counter++;
                        break;
                    case 2:

                        counter2++;

                        break;
                    case 3:
                        counter3++;
                        break;
                    case 4:
                        counter4++;
                        break;
                    case 5:
                        counter5++;
                        break;
                    case 6:
                        counter6++;
                        break;
                    case 7:
                        counter7++;
                        break;
                    case 8:
                        counter8++;
                        break;
                    case 9:

                        counter9++;
                        break;
                    case 10:
                        counter10++;
                        break;
                }


            }
            if (question == 2) {
                switch (numbers) {
                    case 1:
                        counter11++;
                        break;
                    case 2:
                        counter12++;
                        break;
                    case 3:
                        counter13++;
                        break;
                    case 4:
                        counter14++;
                        break;
                    case 5:
                        counter15++;
                        break;
                    case 6:
                        counter16++;
                        break;
                    case 7:
                        counter17++;
                        break;
                    case 8:
                        counter18++;
                        break;
                    case 9:
                        counter19++;
                        break;
                    case 10:
                        counter20++;
                        break;

                }

            }
            if (question == 3) {
                switch (numbers) {
                    case 1:
                        counter21++;
                        break;
                    case 2:
                        counter22++;
                        break;
                    case 3:
                        counter23++;
                        break;
                    case 4:
                        counter24++;
                        break;
                    case 5:
                        counter25++;
                        break;
                    case 6:
                        counter26++;
                        break;
                    case 7:
                        counter27++;
                        break;
                    case 8:
                        counter28++;
                        break;
                    case 9:
                        counter29++;
                        break;
                    case 10:
                        counter30++;
                        break;

                }
            }
            if (question == 4) {
                switch (numbers) {
                    case 1:
                        counter31++;
                        break;
                    case 2:
                        counter32++;
                        break;
                    case 3:
                        counter33++;
                        break;
                    case 4:
                        counter34++;
                        break;
                    case 5:
                        counter35++;
                        break;
                    case 6:
                        counter36++;
                        break;
                    case 7:
                        counter37++;
                        break;
                    case 8:
                        counter38++;
                        break;
                    case 9:
                        counter39++;
                        break;
                    case 10:
                        counter40++;
                        break;

                }

            }
            if (question == 5) {
                switch (numbers) {
                    case 1:
                        counter41++;
                        break;
                    case 2:
                        counter42++;
                        break;
                    case 3:
                        counter43++;
                        break;
                    case 4:
                        counter44++;
                        break;
                    case 5:
                        counter45++;
                        break;
                    case 6:
                        counter46++;
                        break;
                    case 7:
                        counter47++;
                        break;
                    case 8:
                        counter48++;
                        break;
                    case 9:
                        counter49++;
                        break;
                    case 10:
                        counter50++;
                        break;

                }

            }
            int[][] rating = {{counter, counter2, counter3, counter4, counter5, counter6, counter7, counter8, counter9, counter10},
                    {counter11, counter12, counter13, counter14, counter15, counter16, counter17, counter18, counter19, counter20},
                    {counter21, counter22, counter23, counter24, counter25, counter26, counter27, counter28, counter29, counter30},
                    {counter31, counter32, counter33, counter34, counter35, counter36, counter37, counter38, counter39, counter40},
                    {counter41, counter42, counter43, counter44, counter45, counter46, counter47, counter48, counter49, counter50}};


            System.out.printf("%s%54s%8s%5s%n", "Questions", "1  2  3  4  5  6  7  8  9  10","Average","Total");
for (int c=0;c<rating.length;c++){

    int rand = 0;
    int total=0;
    double average=0;
    int num=0;
    System.out.print(courses[c]+" ");
    for (int d=0;d<rating[c].length;d++){



        total += rating[c][d];
        average=total/10.0;
        System.out.printf("%3d",rating[c][d]);

    }
    System.out.printf("%3s%.2f "," ",average);
    System.out.printf("%3s%2d "," ",total);

    System.out.println();
}
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Polling polling = new Polling();
//This is for random

//     polling.displayEverything();
//while this is for the increment to check your the amount of times people rated a particular question
        polling.displayCode();
        System.out.println();

    }
}
