package warmup1;

import java.util.Scanner;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Warmup1 {
    public static void main(String[] args) {
        System.out.println("""
                Suppose you are a teacher. The parameter weekday is true if it is a weekday, and the parameter vacation 
                is true if you are on vacation. Teachers sleep in if it is not a weekday or they're on vacation. Return 
                true if you sleep in today.\n
                """);
        Scanner scanner = new Scanner(System.in);

        int zone;

        System.out.println("""
                Choose the number corresponding to the continent in which your country is located:   
                          1 - North America (America/Chicago)
                          2 - South America (America/Sao_Paulo)
                          3 - Europe (Europe/Paris)
                          4 - Africa (Africa/Cairo)
                          5 - Asia (Asia/Shanghai)
                          6 - Oceania (Australia/Sydney)                       
                """);
        zone = scanner.nextInt();

        //Shows the day and time at the moment the program is executed
        String dateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo")).
                format(DateTimeFormatter.ofPattern("\ndd.MM.yyyy\nhh:mm:ss a"));
        System.out.println("\nDay and time now: " + dateTime);

        boolean isWeekday = false;
        boolean isVacation = false;
        boolean sleepIn = false;

    }
}
