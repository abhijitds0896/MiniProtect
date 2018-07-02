package com.example.hello.miniprotect;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class splashscreen extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    private String MyPREFERENCES = "Preferences";
    Intent intent1, intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        intent1 = new Intent(splashscreen.this, MainActivity.class);
        Thread myThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                        intent1 = new Intent(splashscreen.this, Main2Activity.class);
                        startActivity(intent1);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();

    }
}
