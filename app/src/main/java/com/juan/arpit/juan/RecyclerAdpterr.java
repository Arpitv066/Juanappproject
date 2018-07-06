package com.juan.arpit.juan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class    RecyclerAdpterr extends RecyclerView.Adapter<RecyclerAdpterr.DataHolder> {

    private ArrayList<DataMod> dataModelArrayList;
    Context context;
    private Activity activityyyy;

    public RecyclerAdpterr(ArrayList<DataMod> dataModelArrayList, Context context, Activity activityyyy) {
        this.dataModelArrayList = dataModelArrayList;
        this.context = context;
        this.activityyyy = activityyyy;
    }

    @Override
    public RecyclerAdpterr.DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rr, parent, false);
        return new DataHolder(itemView, context, dataModelArrayList);
    }

    @Override
    public void onBindViewHolder(RecyclerAdpterr.DataHolder holder, int position) {

        DataMod dataModel = dataModelArrayList.get(position);

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

        public DataHolder(View itemView, Context context, final ArrayList<DataMod> dataModelArrayList) {
            super(itemView);

            tv = (TextView) itemView.findViewById(R.id.rtext);
            iv = (ImageView) itemView.findViewById(R.id.rimage);
            text=(TextView) itemView.findViewById(R.id.rnumber);
            imagec=(ImageView) itemView.findViewById(R.id.rcalling);

            imagec.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view) {
                    int pos=getAdapterPosition();

                    String Num=dataModelArrayList.get(pos).getNumber();
                    dialContactPhone(Num);



                }
            });
        }


    }

    private void dialContactPhone(final String phoneNumber) {
        activityyyy.startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}
