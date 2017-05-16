package com.example.coolweather;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by len_titude on 2017/5/13.
 */

public class HourAdapter extends RecyclerView.Adapter<HourAdapter.ViewHolder> {

    private List<Hour> mhourList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView hourDegree;
        TextView hourTime;
        TextView hourText;

        public ViewHolder(View itemView) {
            super(itemView);
            hourDegree = (TextView)itemView.findViewById(R.id.hour_degree);
            hourTime = (TextView)itemView.findViewById(R.id.hout_time);
            hourText = (TextView)itemView.findViewById(R.id.hour_text);
        }
    }


    public HourAdapter(List<Hour> hourList) {
        mhourList = hourList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_hourly_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Hour hour = mhourList.get(position);
        holder.hourDegree.setText(hour.getDegree());
        holder.hourText.setText(hour.getText());
        holder.hourTime.setText(hour.getTime());
    }

    @Override
    public int getItemCount() {
        return mhourList.size();
    }
}
