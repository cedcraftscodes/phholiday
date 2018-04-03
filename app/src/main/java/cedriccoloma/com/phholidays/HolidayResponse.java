package cedriccoloma.com.phholidays;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Icorrelate on 4/3/2018.
 */

public class HolidayResponse {
    @SerializedName("message")
    private String message;

    @SerializedName("server_time")
    private String servertime;

    @SerializedName("holidays")
    public List<Holiday> data = new ArrayList();

    public List<Holiday> getData() {
        return data;
    }

    public void setData(List<Holiday> data) {
        this.data = data;
    }

    public String getServertime() {
        return servertime;
    }

    public void setServertime(String servertime) {
        this.servertime = servertime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
