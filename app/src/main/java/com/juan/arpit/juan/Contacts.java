package com.juan.arpit.juan;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Contacts extends AppCompatActivity {



    public void Emergency(View view)
    {
        Intent intentw = new Intent(getApplicationContext(),Emergency.class);

        startActivity(intentw);
    }
    public void Rickshaw(View view)
    {
        Intent intentx = new Intent(getApplicationContext(),Rickshaw.class);

        startActivity(intentx);
    }
    public void Internal(View view)
    {
        Intent intenty = new Intent(getApplicationContext(),Internals.class);

        startActivity(intenty);
    }
    public void Administration(View view)
    {
        Intent intentz = new Intent(getApplicationContext(),Administration.class);

        startActivity(intentz);
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
            Intent intentc=new Intent(getApplicationContext(),firstActivity.class);
            startActivity(intentc);
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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

    }
}
