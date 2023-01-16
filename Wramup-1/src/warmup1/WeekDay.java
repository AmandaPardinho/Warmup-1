package warmup1;

public class WeekDay {

    private String zoneId;
    private String dateTime;

    public WeekDay(String zoneId, String dateTime) {
        this.zoneId = zoneId;
        this.dateTime = dateTime;
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
}
