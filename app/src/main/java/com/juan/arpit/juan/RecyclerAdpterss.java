

/**
 * Created by Netcomm on 6/26/2018.
 */

package com.juan.arpit.juan;
import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;





public class    RecyclerAdpterss extends RecyclerView.Adapter<RecyclerAdpterss.DataHolder> {

    private ArrayList<DataModels> dataModelArrayList;
    Context context;
    private Activity activityyyyyy;

    public RecyclerAdpterss(ArrayList<DataModels> dataModelArrayList, Context context, Activity activityyyyy) {
        this.dataModelArrayList = dataModelArrayList;
        this.context = context;
        this.activityyyyyy = activityyyyyy;
    }

    @Override
    public RecyclerAdpterss.DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.xxxx, parent, false);
        return new DataHolder(itemView, context, dataModelArrayList);
    }

    @Override
    public void onBindViewHolder(RecyclerAdpterss.DataHolder holder, int position) {

        DataModels dataModel = dataModelArrayList.get(position);

        holder.tv.setText(dataModelArrayList.get(position).getText());
        holder.iv.setImageResource(dataModelArrayList.get(position).getImage());
        holder.text.setText(dataModelArrayList.get(position).getNumber());
        holder.imagec.setImageResource(dataModelArrayList.get(position).getImagecall());
    }

    @Override
    public int getItemCount() {
        if (dataModelArrayList == null)
            return 0;
        return dataModelArrayList.size();
    }

    public class DataHolder extends RecyclerView.ViewHolder {

        TextView tv,text;
        ImageView iv,imagec;

        public DataHolder(View itemView, Context context, final ArrayList<DataModels> dataModelArrayList)
        {
            super(itemView);

            tv = (TextView) itemView.findViewById(R.id.jjtext);
            iv = (ImageView) itemView.findViewById(R.id.jimage);
            text=(TextView) itemView.findViewById(R.id.jtext);
            imagec=(ImageView) itemView.findViewById(R.id.jcalling);







        }


    }


}

