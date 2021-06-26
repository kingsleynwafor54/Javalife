package chapterEight;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour,int minute,int second){
        if((hour<0||hour>23)||(minute<0||minute>60)||(second<0||second>60)){
            throw new IllegalArgumentException("ogbeni hour na 24 in a day while minute na 60 and seconds also theSame");
        }
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    @Override
    public String toString(){
        return String.format("hour: %02d minute:%02d second: %02d %s%n",((hour==0||hour==12)?12:hour%12),minute,second,(hour<12?"AM":"PM"));
    }
    public String normalTime(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public static void main(String[] args) {
        Time time=new Time(33,54,43);
        try{
            System.out.println(time);
        }
        catch ( IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(time.normalTime());
        displayTime("The Time",time);
    }
    private static void displayTime(String header, Time t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header,t.toString() ,t.normalTime() );
         }
}
