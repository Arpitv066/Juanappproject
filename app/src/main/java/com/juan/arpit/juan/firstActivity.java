package com.juan.arpit.juan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class firstActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Redirecting to discussion panel", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent chat=new Intent(Intent.ACTION_VIEW);

                Uri uri=Uri.parse("https://m.me/join/AbbQ8Ek16QLjTDFR");
                chat.setData(uri);
                startActivity(chat);


            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

            Intent intentm=new Intent(getApplicationContext(),Aboutjua.class);
            startActivity(intentm);
            return true;



        } else if (id == R.id.nav_gallery)
        {

            Intent La=new Intent(Intent.ACTION_VIEW);

            Uri uri=Uri.parse("http://172.16.1.6/corporate/webpages/login.jsp?webclient=myaccount");
            La.setData(uri);

            startActivity(La);


        }
        else if (id == R.id.nav_slideshow)
        {
            Intent Lc=new Intent(Intent.ACTION_VIEW);

            Uri uri=Uri.parse("https://drive.google.com/open?id=1gqQXRUDR81F4zw7xRlPvzF_x4XjQufoW");
            Lc.setData(uri);

            startActivity(Lc);


        } else if (id == R.id.nav_manage) {

            Intent jl = new Intent(Intent.ACTION_VIEW);

            Uri uri = Uri.parse("https://www.facebook.com/JualivePage/");
            jl.setData(uri);

            startActivity(jl);
        }

else if (id == R.id.signout) {

            Intent intentghj = new Intent(getApplicationContext(),MainActivity.class);

            startActivity(intentghj);

        } else if (id == R.id.nav_share) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "JUAN");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "All university services at one place");
            startActivity(Intent.createChooser(sharingIntent, "Share via"));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void Academics(View view)
    {
        Intent intent = new Intent(getApplicationContext(),AcademicsActivity.class);

        startActivity(intent);
    }
    public void library(View view)
    {
        Intent intentv = new Intent(getApplicationContext(),Library1.class);

        startActivity(intentv);
    }


    public void contacts(View view)
    {
        Intent intentw = new Intent(getApplicationContext(),Contacts.class);

        startActivity(intentw);
    }
    public void kiosk(View view)
    {
        Intent L=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("http://125.19.185.49:8080/JaypeeU/index.jsp");
        L.setData(uri);

        startActivity(L);
    }

    public void chat(View view)
    {
        Intent chat=new Intent(Intent.ACTION_VIEW);

        Uri uri=Uri.parse("https://m.me/join/AbbQ8Ek16QLjTDFR");
        chat.setData(uri);
        startActivity(chat);
    }
    public void jyc(View view)
    {
        Intent intentj = new Intent(getApplicationContext(),jyc.class);

        startActivity(intentj);
    }
    public void guide(View view)
    {
        Intent intentj = new Intent(getApplicationContext(),Guidelines.class);

        startActivity(intentj);
    }
}
