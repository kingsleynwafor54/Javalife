package chapterEight;

public class EnhancingTime {
    private int seconds;
    private int minute;
    private int hour;
    private int day;

    public EnhancingTime(){}

    public EnhancingTime(int hour ,int minute,int seconds){
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
public void incrementSeconds() {
 this.seconds++;

    }


    public void incrementMinute() {
       this.minute++;
    }
    public void increaseHour() {
        this.hour++;
    }
  public void tick(int incrementTime){
   for(int counter=0;counter<incrementTime;counter++){
       if(this.seconds==59){
           this.seconds=0;
           incrementMinute();
       }
       else incrementSeconds();
       if(this.minute==59){
           this.minute=0;
           increaseHour();
       }
       if(this.hour==24){
           increaseDay();
           hour=0;
       }

   }
  }
  public  void increaseDay(){
        this.day++;
  }

    public String toUniversalTime() {
        return String.format("Hour:%-8d Minute:%-8d Second:%-3d %s%n",
                getHour(),getMinute(),getSeconds(), (getHour()<12?"AM":"PM"));
    }
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                 ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSeconds(), (getHour() < 12 ? "AM" : "PM"));}
public int getDay(){
        return day;
}
}



