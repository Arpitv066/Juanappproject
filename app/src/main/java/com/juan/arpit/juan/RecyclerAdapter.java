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



public class    RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.DataHolder> {

    private ArrayList<DatasModel> dataModelArrayList;
    Context context;
    private Activity activityyy;

    public RecyclerAdapter(ArrayList<DatasModel> dataModelArrayList, Context context, Activity activityyy) {
        this.dataModelArrayList = dataModelArrayList;
        this.context = context;
        this.activityyy = activityyy;
    }

    @Override
    public RecyclerAdapter.DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerrows, parent, false);
        return new DataHolder(itemView, context, dataModelArrayList);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.DataHolder holder, int position) {

        DatasModel dataModel = dataModelArrayList.get(position);

        holder.tv.setText(dataModelArrayList.get(position).getTexts());
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

        public DataHolder(View itemView, Context context, final ArrayList<DatasModel> dataModelArrayList) {
            super(itemView);

            tv = (TextView) itemView.findViewById(R.id.ev_text);
            iv = (ImageView) itemView.findViewById(R.id.ev_image);
            text=(TextView) itemView.findViewById(R.id.ev_number);
            imagec=(ImageView) itemView.findViewById(R.id.emagecalling);

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
        activityyy.startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}

