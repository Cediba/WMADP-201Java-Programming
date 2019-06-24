package holidayis;

public class Holiday {
    private String name; //read-only
    private int day; //read-only
    private String month; //read-only

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }
}
