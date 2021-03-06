package com.juan.arpit.juan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LRC extends AppCompatActivity {


    public void elrc(View view)
    {
        Intent elrc=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("http://172.16.21.13:8280/liberty/libraryHome.do");
        elrc.setData(uri);

        startActivity(elrc);
    }

    public void jgate(View view)
    {
        Intent jgat=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("http://www.jgateplus.com");
        jgat.setData(uri);

        startActivity(jgat);
    }
    public void ieee(View view)
    {
        Intent ie=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("http://ieeexplore.ieee.org");
        ie.setData(uri);

        startActivity(ie);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lrc);
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

        if (id == R.id.home) {
            Intent intent = new Intent(getApplicationContext(), firstActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.about) {
            Intent intent = new Intent(getApplicationContext(), Aboutjuan.class);
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