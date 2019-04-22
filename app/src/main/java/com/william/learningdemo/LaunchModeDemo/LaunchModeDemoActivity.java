package com.william.learningdemo.LaunchModeDemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.william.learningdemo.R;

public class LaunchModeDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode_demo);
    }

    public void self(View view){
        Intent intent = new Intent(this,LaunchModeDemoActivity.class);
        startActivity(intent);
    }

    public void standard(View view){
        Intent intent = new Intent(this,StandardActivity.class);
        startActivity(intent);
    }

    public void singleTop(View view){
        Intent intent = new Intent(this,SingleTopActivity.class);
        startActivity(intent);
    }

    public void singleTask(View view){
        Intent intent = new Intent(this,SingleTeskActivity.class);
        startActivity(intent);
    }

    public void singleInstance(View view){
        Intent intent = new Intent(this,SingleInstanceActivity.class);
        startActivity(intent);
    }
}
