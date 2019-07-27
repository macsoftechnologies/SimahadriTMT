package com.macsof.simhadritmt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.macsof.simhadritmt.activities.DashboardActivity;
import com.macsof.simhadritmt.activities.NavigationActivity;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;
    Boolean isLogin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(MainActivity.this, DashboardActivity.class));
                    finish();
                }
            }, 3000);
        }
    }

