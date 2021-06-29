package chapterEight;

public class PrimeNumbers {
    public static boolean isPrimeNumber(int number) {
        for (int counter = 2; counter < number ; counter++) {
            if (number % counter == 0) {
                return false;
            }
        }
            return true;


    }

    public static void main(String[] args) {
        for (int counter=2;counter<10;counter++){
            if(isPrimeNumber(counter)){
                System.out.print(counter+" ");
            }

        }
    }
    }
