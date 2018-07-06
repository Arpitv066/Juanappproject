package com.juan.arpit.juan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Developers extends AppCompatActivity
{


    public void arpitmail(View view)
    {
        Intent gmaila=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("https://www.facebook.com/Arpitverma3010");
        gmaila.setData(uri);

        startActivity(gmaila);
    }

    public void arpitfb(View view)
    {
        Intent gmailaf=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("https://www.facebook.com/Arpitverma3010");
        gmailaf.setData(uri);

        startActivity(gmailaf);
    }

    public void arpitlkd(View view)
    {
        Intent gmailal=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("https://www.linkedin.com/in/arpit-verma-759a1110b/");
        gmailal.setData(uri);

        startActivity(gmailal);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);






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
            Intent intentx=new Intent(getApplicationContext(),firstActivity.class);
            startActivity(intentx);
            return true;
        }

        if(id==R.id.about)
        {
            Intent intentg=new Intent(getApplicationContext(),Aboutjuan.class);
            startActivity(intentg);
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
