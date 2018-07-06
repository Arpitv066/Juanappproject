package com.juan.arpit.juan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class jyc extends AppCompatActivity {

    private RecyclerView rccviewrrs;
    private RecyclerAdpterss recyclerAdapter;
    private ArrayList<DataModels> dataModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jyc);



        rccviewrrs = (RecyclerView) findViewById(R.id.rcj);
        rccviewrrs.setLayoutManager(new LinearLayoutManager(this));
        rccviewrrs.setHasFixedSize(true);
        rccviewrrs.setAdapter(recyclerAdapter);
        dataModelArrayList = new ArrayList<>();
        recyclerAdapter = new RecyclerAdpterss(dataModelArrayList, this, this);

        DataModels dataModel = new DataModels();
        dataModel.setText("Panosophy");
        dataModel.setNumber("The Literary club of Jaypee University Anoopshahr which conducts activities related to Literary such as quizes,Debates,Speech and plays.");
        dataModel.setImage(R.drawable.jyclit);
        dataModel.setImagecall(R.drawable.fb);
        dataModelArrayList.add(dataModel);








        DataModels dataModelz = new DataModels();
        dataModelz.setText("Media Club");
        dataModelz.setNumber("The Official Media Club of Jaypee University Anoopshahr which conducts events such as face painting,photography,video making etc.");
        dataModelz.setImage(R.drawable.jycmedia);
        dataModelz.setImagecall(R.drawable.fb);
        dataModelArrayList.add(dataModelz);


        DataModels dataModelzq = new DataModels();
        dataModelzq.setText("Sports Club");
        dataModelzq.setNumber("The Official Sports Club of Jaypee University Anoopshahr which conducts sports events such as Cricket,Football,Volley Ball,Basketball,Badminton etc.");
        dataModelzq.setImage(R.drawable.jycsports);
        dataModelzq.setImagecall(R.drawable.fb);
        dataModelArrayList.add(dataModelzq);

        rccviewrrs.setAdapter(recyclerAdapter);
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
