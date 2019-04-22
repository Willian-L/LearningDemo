package com.william.learningdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.william.learningdemo.ActivityDemo.ActivityDemo;
import com.william.learningdemo.BroadcastDemo.BroadcastDemoActivity;
import com.william.learningdemo.LaunchModeDemo.LaunchModeDemoActivity;
import com.william.learningdemo.ServiceDemo.ServiceDemoActivity;

public class DirectoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
    }

    public void toActivity(View view) {
        Intent intent = new Intent(this, ActivityDemo.class);
        startActivity(intent);
    }

    public void toLaunchMode(View view) {
        Intent intent = new Intent(this, LaunchModeDemoActivity.class);
        startActivity(intent);
    }

    public void toBroadcast(View view) {
        Intent intent = new Intent(this, BroadcastDemoActivity.class);
        startActivity(intent);
    }

    public void toService(View view) {
        Intent intent = new Intent(this, ServiceDemoActivity.class);
        startActivity(intent);
    }
}
