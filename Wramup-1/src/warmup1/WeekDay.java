package warmup1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class WeekDay {

    private String zoneId;
    private String dateTime;

    public WeekDay(String zoneId, String dateTime) {
        this.zoneId = zoneId;
        this.dateTime = dateTime;
    }

    public WeekDay(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void showDateNow(String zoneId){
        dateTime = ZonedDateTime.now(ZoneId.of(zoneId)).
                format(DateTimeFormatter.ofPattern("\ndd-MM-yyyy\nhh:mm:ss a"));
        System.out.println(dateTime);
    }
}
