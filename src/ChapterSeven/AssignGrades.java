package ChapterSeven;

import java.util.Scanner;

public class AssignGrades {
    private double bestScore;
    double[] arr;


    public double bestGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number  of Student");
        int numberOfStudent=scanner.nextInt();
        arr = new double[numberOfStudent];

        String grade = "";
        int counter;

        bestScore = arr[0];
        int score;
        for (counter = 0; counter < arr.length; counter++) {
            System.out.println("Enter scores");
            score = scanner.nextInt();
            arr[counter] = score;
            if (arr[counter] > bestScore) {
                bestScore = arr[counter];
            }

        }
   return bestScore;
    }
    public  String assignGrades() {
        for (int counter = 0; counter < arr.length; counter++) {
            if (arr[counter] >= bestScore - 10) {
                System.out.println(arr[counter]+" "+"A");
            }
            else if(arr[counter] >= bestScore - 20) {
                System.out.println(arr[counter]+" "+"B");
            }
          else   if (arr[counter] >= bestScore - 30) {
                System.out.println(arr[counter]+" "+"C");
            }
          else  if (arr[counter] >= bestScore - 40) {
                System.out.println(arr[counter]+" "+"D");
            }
        else
            System.out.println(arr[counter]+" "+"F");


    }
        return " ";
    }
    public static void main(String[] args) {
        AssignGrades assignGrades=new AssignGrades();
        System.out.println(assignGrades.bestGrades());
        assignGrades.assignGrades();
    }
}