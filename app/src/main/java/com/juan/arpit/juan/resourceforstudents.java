package com.juan.arpit.juan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class resourceforstudents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resourceforstudents);
        WebView webView=new WebView(this);

        webView.getSettings().setJavaScriptEnabled(true);
        setContentView(webView);
       String googleDocs="https://docs.google.com/viewer?url";
        String pdf_url="https://drive.google.com/open?id=1RHqn6iTl-euXs_i7yUUM7EWe4t--G9BJ";

        webView.loadUrl(googleDocs+pdf_url);
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
        } if(id==R.id.exit)
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
