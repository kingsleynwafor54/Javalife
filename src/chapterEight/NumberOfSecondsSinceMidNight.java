package chapterEight;

public class NumberOfSecondsSinceMidNight {
    private int seconds;
    private int minute;
    private int hour;

    public NumberOfSecondsSinceMidNight(){}

    public NumberOfSecondsSinceMidNight(int hour ,int minute,int seconds){
        if((hour<0||hour>23)||(minute<0||minute>60)||(seconds<0||seconds>60)){
            throw new IllegalArgumentException("hour is from 0-23, while minute is for 0-60 and seconds 0-60")
        ;}
        this.hour=hour;
        this.minute=minute;
        this.seconds=seconds;
    }

    public int getSeconds() {

        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds<1||seconds>60){
            throw new IllegalArgumentException("seconds is from one to sixty");
        }
        this.seconds = seconds;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute<0||minute>60){
            throw new IllegalArgumentException("minute is from 1-60");
        }
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour<0||hour>23){
            throw  new IllegalArgumentException("hour is from 1-23");
        }
        this.hour = hour;
    }


    public int numberOfSecondsSinceMidnight(){
            if(getSeconds()==23&&getMinute()==60){
                return   (getHour()*60+getMinute())*60;
            }
            else return (getHour()*60+getMinute())*60+getSeconds();
        }
    }

