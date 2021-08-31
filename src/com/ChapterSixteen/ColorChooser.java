package com.ChapterSixteen;

import java.util.HashMap;

public class ColorChooser {
    public static void main(String[] args) {
        HashMap<String ,MapPracticeColors> colorMapping =new HashMap<>();
        MapPracticeColors mapPracticeColors=new MapPracticeColors();
        MapPracticeColors mapPracticeColors1=new MapPracticeColors();
        MapPracticeColors mapPracticeColors2=new MapPracticeColors();
        MapPracticeColors mapPracticeColors3=new MapPracticeColors();
        MapPracticeColors mapPracticeColors4=new MapPracticeColors();
        MapPracticeColors mapPracticeColors5=new MapPracticeColors();
        colorMapping.put("blue",mapPracticeColors);
        colorMapping.put("red",mapPracticeColors);
         colorMapping.put("blue",mapPracticeColors2);

     colorMapping.put("blue",mapPracticeColors3);
//        colorMapping.put("blue",mapPracticeColors4);
//        colorMapping.put("blue",mapPracticeColors5);

        System.out.println(colorMapping.size());

//        System.out.println(colorMapping);
        if(colorMapping.containsKey("blue")){
            System.out.println(colorMapping.get("blue"));
        }
    }






}
