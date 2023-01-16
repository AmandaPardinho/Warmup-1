import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalQuery;

public class Main {
    public static void main(String[] args) {

        boolean isWeekDay = false;
        boolean isVacation = false;
        boolean sleepIn = false;

        int year;
        int month;
        int day;
        boolean weekend;

        /*switch (zone){
            case 1:
                zoneId = "America/Chicago";
                dateTime = String.valueOf(ZonedDateTime.now(ZoneId.of(zoneId))).
                        format(String.valueOf(DateTimeFormatter.ofPattern("\ndd-MM-yyyy\nhh:mm:ss a")));
                //day = LocalDateTime.of(dateTime).getDayOfWeek().name();
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
                //weekDay = LocalDateTime.of(year, month, day, null, null).getDayOfWeek().name();
                break;
            case 3:
                zoneId = "Europe/Paris";
                dateTime = ZonedDateTime.now(ZoneId.of(zoneId)).
                        format(DateTimeFormatter.ofPattern("\ndd-MM-yyyy\nhh:mm:ss a\n"));
                TemporalQuery<Boolean> fds = t -> {
                    DayOfWeek dow = DayOfWeek.from(t);
                    return dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY;
                };
                weekend = ZonedDateTime.now().query(fds);
                System.out.println("\nDay and time now: " + dateTime + weekend);
                break;
            case 4:
                zoneId = "Africa/Cairo";
                dateTime = ZonedDateTime.now(ZoneId.of(zoneId)).
                        format(DateTimeFormatter.ofPattern("\ndd-MM-yyyy"));
                System.out.println("\nDay and time now: " + dateTime);
                //weekend = new SimpleDateFormat(("EEEE")).format(dateTime);
                break;
            case 5:
                zoneId = "Africa/Harare";
                dateTime = String.valueOf(ZonedDateTime.now(ZoneId.of(zoneId)));//.
                //format(DateTimeFormatter.ofPattern("\ndd.MM.yyyy\nhh:mm:ss a"));
                System.out.println("\nDay and time now: " + dateTime);
                //LocalDateTime dtWeek = LocalDateTime.of(dateTime);
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
                        format(DateTimeFormatter.ofPattern("\ndd-MM-yyyy\nhh:mm:ss a"));

                System.out.println("\nDay and time now: " + dateTime);
                break;
            default:
                System.out.println("Invalid number");
        }

        /*if(isWeekDay == true){
            if(isVacation == true){
                sleepIn = true;
                System.out.println("It's vacation time!");
            }else {
                sleepIn = false;
                System.out.println("Go sleep! Tomorrow you have classes!");
            }
        }else{
            sleepIn = true;
            System.out.println("It's weekend!");
        }*/
    }
}