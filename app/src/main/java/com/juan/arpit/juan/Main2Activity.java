package com.juan.arpit.juan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class Main2Activity extends AppCompatActivity {


    Button juan;
    Animation frombottom,fromtop;
    ImageView logo;


    private int SLEEP_TIMER=3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        juan=(Button)findViewById(R.id.juan);
        logo=(ImageView)findViewById(R.id.logo);
        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtop=AnimationUtils.loadAnimation(this,R.anim.fromtop);

        juan.setAnimation(frombottom);
        logo.setAnimation(fromtop);

LogoLauncher logoLauncher=new LogoLauncher();

        logoLauncher.start();

    }
    private class LogoLauncher extends Thread
    {
        public void run()
        {
             try {
                sleep(1000*SLEEP_TIMER);

            }catch(InterruptedException e)
            {
               e.printStackTrace();
            }

            Intent  intent =new Intent(Main2Activity.this, MainActivity.class);
            startActivity(intent);
            Main2Activity.this.finish();
        }
    }



        }
