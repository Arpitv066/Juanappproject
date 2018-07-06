package com.juan.arpit.juan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AcademicsActivity extends AppCompatActivity {


    public void eb(View view)
    {
        Intent L=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("https://drive.google.com/open?id=1RHqn6iTl-euXs_i7yUUM7EWe4t--G9BJ");
        L.setData(uri);

        startActivity(L);
    }

    public void qus(View view)
    {
        Intent qus=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("https://drive.google.com/open?id=1KoYpXAGFNvblTMbyR6mR-hZE2wY1BmVM");
        qus.setData(uri);

        startActivity(qus);
    }

    public void tt(View view)
    {
        Intent L=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("https://drive.google.com/open?id=16XLVLHguad3zxBC8a8mgBd3cHlf7FLdN");
        L.setData(uri);

        startActivity(L);
    }

    public void rs(View view)
    {
        Intent L=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("https://drive.google.com/open?id=1bVKiEAgyoGYpdbp5N9H8et-57msVml4E");
        L.setData(uri);

        startActivity(L);
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



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);
    }
}
