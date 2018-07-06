package com.juan.arpit.juan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Administration extends AppCompatActivity {
    private RecyclerView rcview;
    private RecyclerAdpter recyclerAdpter;
    private ArrayList<DataModel> dataModelArrayList ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administration);

        rcview = (RecyclerView) findViewById(R.id.rc);
        rcview.setLayoutManager(new LinearLayoutManager(this));
        rcview.setHasFixedSize(true);
        rcview.setAdapter(recyclerAdpter);
        dataModelArrayList = new ArrayList<>();
        recyclerAdpter = new RecyclerAdpter(dataModelArrayList, this, this);


        DataModel dataModel =new DataModel();
        dataModel.setText("DIRECTOR");
        dataModel.setNumber("9758491547");
        dataModel.setImage(R.drawable.adm);
        dataModel.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModel);


        DataModel dataModel1 =new DataModel();
        dataModel1.setText("DEAN(Academic and Research");
        dataModel1.setNumber("7088400040");
        dataModel1.setImage(R.drawable.hdean);
        dataModel1.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModel1);



        DataModel dataModel2 =new DataModel();
        dataModel2.setText("DEAN(Student Welfare)");
        dataModel2.setNumber("9644904999");
        dataModel2.setImage(R.drawable.hdir);
        dataModel2.setImagecall(R.drawable.hcall);
        dataModelArrayList.add(dataModel2);




        DataModel dataModel3 =new DataModel();
        dataModel3.setText("SECURITY OFFICER");
        dataModel3.setNumber("879000159");
        dataModel3.setImagecall(R.drawable.hcall);
        dataModel3.setImage(R.drawable.hsec);
        dataModelArrayList.add(dataModel3);





        DataModel dataModel4 =new DataModel();
        dataModel4.setText("MESS INCHARGE");
        dataModel4.setNumber("8937045322");
        dataModel4.setImagecall(R.drawable.hcall);
        dataModel4.setImage(R.drawable.hmess);
        dataModelArrayList.add(dataModel4);






        DataModel dataModel5 =new DataModel();
        dataModel5.setText("WARDEN (Boys Hostel)");
        dataModel5.setNumber("8859076586");
        dataModel5.setImagecall(R.drawable.hcall);
        dataModel5.setImage(R.drawable.hwar);
        dataModelArrayList.add(dataModel5);





        DataModel dataModel6 =new DataModel();
        dataModel6.setText("WARDEN (Girls Hostel)");
        dataModel6.setNumber("9758491547");
        dataModel6.setImagecall(R.drawable.hcall);
        dataModel6.setImage(R.drawable.hgirl);
        dataModelArrayList.add(dataModel6);




        DataModel dataModel7 =new DataModel();
        dataModel7.setText("REGISTRAR");
        dataModel7.setNumber("9719434962");
        dataModel7.setImagecall(R.drawable.hcall);
        dataModel7.setImage(R.drawable.hregi);
        dataModelArrayList.add(dataModel7);




        DataModel dataModel8 =new DataModel();
        dataModel8.setText("ADMISSIONS");
        dataModel8.setNumber("7055922888");
        dataModel8.setImagecall(R.drawable.hcall);
        dataModel8.setImage(R.drawable.hadmm);
        dataModelArrayList.add(dataModel8);










        rcview.setAdapter(recyclerAdpter);
        recyclerAdpter.notifyDataSetChanged();

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
