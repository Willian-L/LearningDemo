package com.william.learningdemo.BroadcastDemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.william.learningdemo.R;

public class BroadcastDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_demo);
    }

    public void ipDialer(View view) {
        System.out.println("123");
        Intent intent = new Intent(this, IPDialerActivity.class);
        startActivity(intent);
    }

    public void sms(View view) {
        Intent intent = new Intent(this, SmsActivity.class);
        startActivity(intent);
    }

    public void sendBroadcast(View view) {
        Intent intent = new Intent(this, SendBroadcastActivity.class);
        startActivity(intent);
    }

    public void sendOrder(View view) {
        Intent intent = new Intent(this, SendOrderActivity.class);
        startActivity(intent);
    }

    public void register(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
