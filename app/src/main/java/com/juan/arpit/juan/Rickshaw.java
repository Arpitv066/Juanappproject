package com.juan.arpit.juan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Rickshaw extends AppCompatActivity {

    private RecyclerView rccviewr;
    private RecyclerAdpterr recyclerAdapter;
    private ArrayList<DataMod> dataModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rickshaw);



        rccviewr = (RecyclerView) findViewById(R.id.rca);
        rccviewr.setLayoutManager(new LinearLayoutManager(this));
        rccviewr.setHasFixedSize(true);
        rccviewr.setAdapter(recyclerAdapter);
        dataModelArrayList = new ArrayList<>();
        recyclerAdapter = new RecyclerAdpterr(dataModelArrayList, this, this);

        DataMod dataModel = new DataMod();
        dataModel.setText("Babu Bhai");
        dataModel.setNumber("8958507122");
        dataModel.setImage(R.drawable.hrickshaw);
        dataModel.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModel);







        DataMod dataModely = new DataMod();
        dataModely.setText("Raees");
        dataModely.setNumber("7535822304");
        dataModely.setImage(R.drawable.hrrrick);
        dataModely.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModely);

        DataMod dataModelz = new DataMod();
        dataModelz.setText("Saabu");
        dataModelz.setNumber("9720990784");
        dataModelz.setImage(R.drawable.hrrick);
        dataModelz.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModelz);

        rccviewr.setAdapter(recyclerAdapter);
        recyclerAdapter.notifyDataSetChanged();


    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id==R.id.home)
        {
            Intent intentq=new Intent(getApplicationContext(),firstActivity.class);
            startActivity(intentq);
            return true;
        }

        if(id==R.id.about)
        {
            Intent intent=new Intent(getApplicationContext(),Aboutjuan.class);
            startActivity(intent);
            return true;
        }
        if(id==R.id.exit)
        {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
        if(id==R.id.developers) {
            Intent intent = new Intent(getApplicationContext(), Developers.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
