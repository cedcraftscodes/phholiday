package cedriccoloma.com.phholidays;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Icorrelate on 4/3/2018.
 */

public class Holiday {
    @SerializedName("date")
    private String date;

    @SerializedName("weekday")
    private String weekday;

    @SerializedName("holidayName")
    private String holidayName;

    @SerializedName("holidayType")
    private String holidayType;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public String getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(String holidayType) {
        this.holidayType = holidayType;
    }
}
