package AirLineReservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirLine {
    private final boolean[] arraySeat = new boolean[10];
    int firstClassCounter=0;
    boolean firstClassSeats=false;
    boolean economyClassSeats=false;


    int economyCounter=0;
//   private boolean[] firstClass = new boolean[5];
//    private boolean[] economy = new boolean[5];

    public boolean firstClassSeat(int seat) {
        if (seat >= 1 && seat <= 5) {
            return arraySeat[seat - 1] = true;

        }
        return false;
    }






public boolean economy(int seat){
        if (seat >=6 && seat<=10){
            return arraySeat[seat-1]=true;
        }
return  false;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "arraySeat=" + Arrays.toString(arraySeat) +
                '}';
    }
public int getFirstClassSeat(int firstClassCounter){
        String message="";
        if(firstClassCounter==5){
            message="No more seat for first class ";
            System.out.println(message);
        }
        return firstClassCounter;

}
    public int getEconomySeat(int economyCounter){
        String message="";
        if(economyCounter==5){
            message="No more seat for Economy class ";
            System.out.println(message);
        }
        return economyCounter;

    }


}

