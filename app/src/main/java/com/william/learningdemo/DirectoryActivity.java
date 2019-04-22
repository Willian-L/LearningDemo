package com.william.learningdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.william.learningdemo.ActivityDemo.ActivityDemo;
import com.william.learningdemo.LaunchModeDemo.LaunchModeDemoActivity;

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
}
