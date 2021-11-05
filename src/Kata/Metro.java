package Kata;

import java.util.ArrayList;
import java.util.Arrays;

public class Metro {

    public int countPassengers(ArrayList<int[]> list) {
        int result=0;
        int outOfTheBus=0;
        for(int counter=0;counter<list.size();counter++){
          for(int count=0;count<list.get(counter).length;count++){
          }
            outOfTheBus+=list.get(counter)[1];
            result+=list.get(counter)[0];
        }
       return  result-outOfTheBus;
    }

}
