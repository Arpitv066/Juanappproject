package com.juan.arpit.juan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Internals extends AppCompatActivity {

    private RecyclerView rccviewrr;
    private RecyclerAdpters recyclerAdapter;
    private ArrayList<DataMode> dataModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internals);



        rccviewrr = (RecyclerView) findViewById(R.id.rci);
        rccviewrr.setLayoutManager(new LinearLayoutManager(this));
        rccviewrr.setHasFixedSize(true);
        rccviewrr.setAdapter(recyclerAdapter);
        dataModelArrayList = new ArrayList<>();
        recyclerAdapter = new RecyclerAdpters(dataModelArrayList, this, this);

        DataMode dataModel = new DataMode();
        dataModel.setText("Cafeteria");
        dataModel.setNumber("8958507122");
        dataModel.setImage(R.drawable.hcafe);
        dataModel.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModel);


        DataMode dataModelm = new DataMode();
        dataModelm.setText("A to Z");
        dataModelm.setNumber("8958507122");
        dataModelm.setImage(R.drawable.haz);
        dataModelm.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModelm);




        DataMode dataModely = new DataMode();
        dataModely.setText("Food Point(near Temple)");
        dataModely.setNumber("7535822304");
        dataModely.setImage(R.drawable.hcafet);
        dataModely.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModely);

        DataMode dataModelz = new DataMode();
        dataModelz.setText("Restaurant(Shaadi Lal)");
        dataModelz.setNumber("9720990784");
        dataModelz.setImage(R.drawable.hrest);
        dataModelz.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModelz);

        DataMode dataModelzx = new DataMode();
        dataModelzx.setText("Keshav Hotel");
        dataModelzx.setNumber("9720990784");
        dataModelzx.setImage(R.drawable.keshav);
        dataModelzx.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModelzx);


        rccviewrr.setAdapter(recyclerAdapter);
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
