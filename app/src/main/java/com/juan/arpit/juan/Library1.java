package com.juan.arpit.juan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Library1 extends AppCompatActivity {

    public void lrc(View view)
    {
        Intent intentb = new Intent(getApplicationContext(),LRC.class);

        startActivity(intentb);
    }
    public void delnet(View view)
    {
        Intent intent = new Intent(getApplicationContext(),DELNET.class);

        startActivity(intent);
    }

    public void ndl(View view)
    {
        Intent L=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("https://ndl.iitkgp.ac.in/");
        L.setData(uri);

        startActivity(L);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library1);
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
            Intent intent=new Intent(getApplicationContext(),firstActivity.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.about)
        {
            Intent intent=new Intent(getApplicationContext(),Aboutjuan.class);
            startActivity(intent);
            return true;
        }
        if(id==R.id.developers) {
            Intent intent = new Intent(getApplicationContext(), Developers.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

}
