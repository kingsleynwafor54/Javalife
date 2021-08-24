import java.time.LocalDateTime;

public class Time {
  private LocalDateTime time;

    public LocalDateTime getTime() {
        return time;
    }
public int getHour(){
        return time.getHour();
}
    public int getMinute(){
        return time.getMinute();
    }
    public int getSeconds(){
        return time.getSecond();
    }
}
