package com.ChapterSixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapPracticeColors {
 private   String[] colors={"blue","red","pink","black ","purple","violet","yellow","green","brown","white","orange","pink","wine","indigo"};
    public void getColors(){
        for( int counter =0;counter< colors.length;counter++){

        }
    }

    List<String> listOfColors= Arrays.asList(colors);


    public List<String> getColor() {
        return listOfColors;
    }

    @Override
    public String toString() {
        return "MapPracticeColors{" +
//                "colors=" + Arrays.toString(colors) +
                ", listOfColors=" + listOfColors +
                '}';
    }
}
