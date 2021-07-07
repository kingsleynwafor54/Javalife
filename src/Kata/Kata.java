package Kata;

public class Kata {


    public int nextNumberInTheSeries(int number1, int number2, int number3) {
        int difference = number2 - number1;
        if (number2 - number1 == difference && number3 - number2 == difference) {
            return number3 + difference;
        }
        return 0;
    }

    public void nextNumberFinder(int number1, int number2, int number3) {
        int difference = number2 - number1;
        int number4;
        if (number2 - number1 == difference && number3 - number2 == difference) {
            number4 = number3 + difference;
            System.out.print(number4 + " ");
            System.out.println();
            for (int counter = 0; counter < 5; counter++) {
                System.out.print(number4 += difference);
                System.out.print(" ");

            }

        } else System.out.println("error baba o");

    }

    public void nextSeriesOfNumber(int number1, int number2, int number3) {
        int difference = number2 - number1;
        int  number4;
        if (number2 - number1== difference && number3 - number2 == difference) {
           number4=number3+difference;
//

            for ( int count= 1; count < 10; count++) {
                int number5=number1;
                System.out.print(number5+" ");
                for (int counter = number2; counter < 10; counter++) {
                    System.out.print( (number5+=difference )  +" ");

                }
                System.out.println();
                number1++;

            }
        }
        else
            System.out.println("You are wrong");
    }
}