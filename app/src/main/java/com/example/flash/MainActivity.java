package com.example.flash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView i1;
    TextView t1;
    Animation TA,LA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1=findViewById(R.id.image);
        t1=findViewById(R.id.text);

        LA= AnimationUtils.loadAnimation(this,R.anim.logo);
        TA=AnimationUtils.loadAnimation(this,R.anim.title);

        i1.setAnimation(LA);
        t1.setAnimation(TA);

        final Intent i=new Intent(getApplicationContext(),HomeScreen.class);

        Thread timer=new Thread()
        {
            @Override
            public void run() {
                try
                {
                    sleep(4000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();





    }


}
