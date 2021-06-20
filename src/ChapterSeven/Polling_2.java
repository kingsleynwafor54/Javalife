package ChapterSeven;

import java.util.Scanner;

public class Polling_2 {

        int [][] rating=new int[5][10];
    int [][] counts=new int[5][10];
    Scanner scanner =new Scanner(System.in);
public void displayRatings(){
    for (int counter=0;counter<rating.length;counter++){
        for(int count=0;count<rating[counter].length;count++){
            if( count%10==0){
                System.out.println();
            }
            System.out.print(rating[counter][count]+" ");
        }
    }
}
public void displayRatingByRow1(){

    for(int counter=0;counter<rating.length;counter++){
        System.out.println("Enter Score");
        rating[0][counter]=scanner.nextInt();
        counts[0][rating[0][counter]-1]++;
        for(int count=0;count< rating.length;count++){

                System.out.print(counts[count]+" ");
            }
        }
    }
    public void displayRatingByRow2(){

        for(int counter=0;counter<counts.length;counter++){

            for(int count=0;count< counts.length;count++){
                System.out.println("Enter Score");
                rating[1][counter]=scanner.nextInt();
                counts[0][rating[1][counter]-1]++;



                System.out.print(counts[counter][count]+" ");
            }
        }
    }
    public void displayArray(){
    for(int counter=0;counter<rating.length;counter++){
        for(int count=0;count<rating[counter].length;count++){
            if(count%10==0){
                System.out.println();
            }
            System.out.print(rating[counter][count]+" ");
        }
    }
    }
        public static void main(String[] args) {
    Polling_2 p=new Polling_2();
p.displayRatingByRow2();
    p.displayRatings();
    p.displayArray();
        }


    }
