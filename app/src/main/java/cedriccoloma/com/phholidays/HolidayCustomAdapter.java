package cedriccoloma.com.phholidays;

/**
 * Created by Icorrelate on 4/3/2018.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class HolidayCustomAdapter extends RecyclerView.Adapter<HolidayCustomAdapter.ViewHolder> {
    Context context;


    private List<Holiday> mDataset;


    public HolidayCustomAdapter(List<Holiday> myDataset, Context context) {
        mDataset = myDataset;
        this.context = context;
    }

    public void add(int position, Holiday item) {
        mDataset.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(Holiday item) {
        int position = mDataset.indexOf(item);
        mDataset.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public HolidayCustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.holidayrecycler_card, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        final Holiday holiday = mDataset.get(position);

        holder.holiday_name.setText(holiday.getHolidayName());
        holder.holiday_date.setText(holiday.getDate());
        holder.holiday_weekday.setText(holiday.getWeekday());
        holder.holiday_type.setText(holiday.getHolidayType());


    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public TextView holiday_name;
        public TextView holiday_date;
        public TextView holiday_weekday;
        public TextView holiday_type;


        public ViewHolder(View v) {
            super(v);

            holiday_name = v.findViewById(R.id.holiday_name);
            holiday_date = v.findViewById(R.id.holiday_date);
            holiday_weekday = v.findViewById(R.id.holiday_weekday);
            holiday_type = v.findViewById(R.id.holiday_type);


        }
    }
}