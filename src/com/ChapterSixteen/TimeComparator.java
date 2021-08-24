package com.ChapterSixteen;


import chapterEight.EnhancingTime;

import java.util.Comparator;


public class TimeComparator implements Comparator<EnhancingTime> {

    @Override
    public int compare(EnhancingTime time1,EnhancingTime time2) {
        int hourDifference =time1.getHour()-time2.getHour();
        if(hourDifference!=0){
            return hourDifference;
        }
        int minuteDifference = time1.getMinute() - time2.getMinute();
        if(minuteDifference!=0){
            return minuteDifference;
        }
        int secondDifference=time1.getSeconds()-time2.getSeconds();
        return secondDifference;
    }


}
