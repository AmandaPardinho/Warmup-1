package warmup1;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Warmup1 {
    public static void main(String[] args) {
        System.out.println("""
                \nSuppose you are a teacher. The parameter weekday is true if it is a weekday, and the parameter vacation 
                is true if you are on vacation. Teachers sleep in if it is not a weekday or they're on vacation. Return 
                true if you sleep in today (The code shows the day and time at the moment of it's execution). Suppose 
                that all countries in the northern hemisphere have longer vacations in July and August and short 
                vacations between December 15 and January 15, and in the southern hemisphere the longest vacations occur
                in December and January and short vacations in July.\n
                """);
        Scanner scanner = new Scanner(System.in);

        boolean isWeekDay = false;
        boolean isVacation = false;
        boolean sleepIn = false;
        int zone;
        int year;
        int month;
        int day;
        String zoneId;
        String dateTime;
        String weekDay;


        System.out.println("""
                Select the most appropriate number, considering the location of your country in relation to the Equator.
                Choose the continent that most closely matches your actual location:   
                          1 - North America;
                          2 - South America; 
                          3 - Europe; 
                          4 - Northern Africa Region;
                          5 - Southern Africa Region; 
                          6 - Asia; 
                          7 - Oceania.                       
                """);
        zone = scanner.nextInt();

        switch (zone){
            case 1:
                zoneId = "America/Chicago";
                dateTime = String.valueOf(ZonedDateTime.now(ZoneId.of(zoneId))).
                        format(String.valueOf(DateTimeFormatter.ofPattern("\nYYYY/MM/DD")));
                day = LocalDateTime.of(dateTime).getDayOfWeek().name();
                System.out.println("\nDay and time now: " + dateTime);
                break;
            case 2:
                zoneId = "America/Sao_Paulo";
                dateTime = ZonedDateTime.now(ZoneId.of(zoneId)).
                        format(DateTimeFormatter.ofPattern("\ndd.MM.yyyy\nhh:mm:ss a"));
                System.out.println("\nDay and time now: " + dateTime);
                System.out.println("Enter the year:");
                year = scanner.nextInt();
                System.out.println("Enter the number of month:");
                month = scanner.nextInt();
                System.out.println("Enter the day:");
                day = scanner.nextInt();
                weekDay = LocalDateTime.of(year, month, day, null, null).getDayOfWeek().name();
                break;
            case 3:
                zoneId = "Europe/Paris";
                dateTime = ZonedDateTime.now(ZoneId.of(zoneId)).
                        format(DateTimeFormatter.ofPattern("\ndd.MM.yyyy\nhh:mm:ss a"));
                System.out.println("\nDay and time now: " + dateTime);
                break;
            case 4:
                zoneId = "Africa/Cairo";
                dateTime = ZonedDateTime.now(ZoneId.of(zoneId)).
                        format(DateTimeFormatter.ofPattern("\ndd.MM.yyyy\nhh:mm:ss a"));
                System.out.println("\nDay and time now: " + dateTime);
                break;
            case 5:
                zoneId = "Africa/Harare";
                dateTime = ZonedDateTime.now(ZoneId.of(zoneId)).
                        format(DateTimeFormatter.ofPattern("\ndd.MM.yyyy\nhh:mm:ss a"));
                System.out.println("\nDay and time now: " + dateTime);
                break;
            case 6:
                zoneId = "Asia/Shanghai";
                dateTime = ZonedDateTime.now(ZoneId.of(zoneId)).
                        format(DateTimeFormatter.ofPattern("\ndd.MM.yyyy\nhh:mm:ss a"));
                System.out.println("\nDay and time now: " + dateTime);
                break;
            case 7:
                zoneId = "Australia/Sydney";
                dateTime = ZonedDateTime.now(ZoneId.of(zoneId)).
                        format(DateTimeFormatter.ofPattern("\ndd.MM.yyyy\nhh:mm:ss a"));

                System.out.println("\nDay and time now: " + dateTime);
                break;
            default:
                System.out.println("Invalid number");
        }

        if(isWeekDay == true){
            if(isVacation == true){
                sleepIn = true;
                System.out.println("It's vacation time!");
            }else {
                sleepIn = false;
                System.out.println("Go sleep! Tomorrow you have classes!");
            }
        }
    }
}
