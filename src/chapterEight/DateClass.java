package chapterEight;

public class DateClass {
    private int day;
    private int month;
    private int year;
    private String month1;
    String [] monthOfTheYear={"Jan","February","March","April","May","June","July","August","Sept","Oct","Nov","Dec"};
   int [] daysOfTheMonth={  31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public DateClass(){
    }
    public DateClass(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;

    }
    public DateClass(int day,int year){
        this.day=day;
        this.year=year;
    }
    public DateClass(int day){
        this.day=day;
    }
    public String setMonthInWords() {
        month1 = monthOfTheYear[this.month - 1];
        return month1;
    }
public int CalculatingNumberOfDaysInAYear() {
    for (int counter = 0; counter < monthOfTheYear.length; counter++) {

    }
    return 0;
}
    @Override
    public String toString() {
        return String.format("%-2d %-2d %-2d",this.day,month,year);
    }
    public String toString2() {
        return String.format("%-2s %-2d %-2d ", setMonthInWords(),day,year);
    }

    public static void main(String[] args) {
        DateClass d=new DateClass(12,10,2001);
        System.out.println(d.toString());
        System.out.println(d.toString2());
    }
}
