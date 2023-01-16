package warmup1;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalQuery;
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
        int zone;

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
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("Invalid number");
        }


    }
}
