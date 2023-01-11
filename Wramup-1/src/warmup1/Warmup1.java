package warmup1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Warmup1 {
    public static void main(String[] args) {
        //Shows the day and time at the moment the program is executed
        String dateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo")).
                format(DateTimeFormatter.ofPattern("dd.MM.yyyy, hh.mm.ss a"));
        System.out.println(dateTime);

        boolean isWeekday = false;
        boolean isVacation = false;
        boolean sleepIn = false;

    }
}
