package com.austinegwa64.learngeography;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Flash_Screen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash__screen);

        Thread th = new Thread(){
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent i = new Intent(getBaseContext(), Home.class);
                startActivity(i);
                finish();
            }
        };

        th.start();
    }
}
