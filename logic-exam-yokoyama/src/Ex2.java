import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex2 {
    public static void main(String[] args) {
        int hour =11;
        int minute = 59;
        int seconds = 59;
    
LocalTime localTime = LocalTime.of(hour, minute, seconds);

        localTime = localTime.plusSeconds(1);
        String next = localTime.format(DateTimeFormatter.ofPattern("HH時mm分ss秒"));
        System.out.println(hour + "時" + minute + "分" + seconds + "秒"+ "の1秒後は" + next + "です");
}
}
