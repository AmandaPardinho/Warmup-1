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

        String country;

        System.out.println("""
                Choose the number that represents your country's time zone or the one nearest to it:   
                        1 - Africa/Cairo
                        2 - America/Chicago                        
                        3 - America/Los_Angeles
                        4 - America/Puerto_Rico
                        5 - America/Sao_Paulo
                        6 - Asia/Dhaka                        
                        7 - Asia/Ho_Chi_Minh
                        8 - Asia/Shanghai
                        9 - Asia/Tokyo
                        10 - Australia/Sydney                        
                        11 - Europe/Paris                                                
                        12 - Pacific/Auckland
                        13 - Pacific/Guadalcanal                        
                """);

        //Shows the day and time at the moment the program is executed
        String dateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo")).
                format(DateTimeFormatter.ofPattern("\ndd.MM.yyyy\nhh:mm:ss a"));
        System.out.println("\nDay and time now: " + dateTime);

        boolean isWeekday = false;
        boolean isVacation = false;
        boolean sleepIn = false;

    }
}
