package com.juan.arpit.juan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Emergency extends AppCompatActivity {

    private RecyclerView rccview;
    private RecyclerAdapter recyclerAdapter;
    private ArrayList<DatasModel> dataModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);



    rccview = (RecyclerView) findViewById(R.id.rcc);
        rccview.setLayoutManager(new LinearLayoutManager(this));
        rccview.setHasFixedSize(true);
        rccview.setAdapter(recyclerAdapter);
    dataModelArrayList = new ArrayList<>();
    recyclerAdapter = new RecyclerAdapter(dataModelArrayList, this, this);

    DatasModel dataModel = new DatasModel();
        dataModel.setTexts("DOCTOR");
        dataModel.setNumber("05734-275223");
        dataModel.setImage(R.drawable.hdoc);
        dataModel.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModel);


        DatasModel dataModela = new DatasModel();
        dataModela.setTexts("POLICE STATION");
        dataModela.setNumber("05734-275223");
        dataModela.setImage(R.drawable.hppp);
        dataModela.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModela);


        DatasModel dataModelb = new DatasModel();
        dataModelb .setTexts("SDM (Anoopshahr)");
        dataModelb .setNumber("05734-275223");
        dataModelb .setImage(R.drawable.hsdm);
        dataModelb .setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModelb);

        DatasModel dataModelc = new DatasModel();
        dataModelc.setTexts("Washerman");
        dataModelc.setNumber("9627685105");
        dataModelc.setImage(R.drawable.hwash);
        dataModelc.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModelc);


        rccview.setAdapter(recyclerAdapter);
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
