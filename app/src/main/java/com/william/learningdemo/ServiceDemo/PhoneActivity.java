package com.william.learningdemo.ServiceDemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.william.learningdemo.R;
import com.william.learningdemo.ServiceDemo.Service.PhoneService;

public class PhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
    }

    public void startPhone(View view) {
        Intent start = new Intent(getApplicationContext(), PhoneService.class);
        startService(start);
    }

    public void stopPhone(View view) {
        Intent stop = new Intent(getApplicationContext(), PhoneService.class);
        stopService(stop);
    }
}
