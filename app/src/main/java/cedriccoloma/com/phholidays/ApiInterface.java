package cedriccoloma.com.phholidays;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Icorrelate on 4/3/2018.
 */

public interface ApiInterface {
    @GET("{year}")
    Call<HolidayResponse> getHolidays(@Path("year") int year);
}
