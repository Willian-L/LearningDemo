package com.william.learningdemo.ServiceDemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.william.learningdemo.R;

public class ServiceDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_demo);
    }

    public void toPhone(View view) {
        Intent intent = new Intent(this, PhoneActivity.class);
        startActivity(intent);
    }

    public void toBind(View view) {
        Intent intent = new Intent(this, BindActivity.class);
        startActivity(intent);
    }
}
