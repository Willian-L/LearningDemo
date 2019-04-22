package com.william.learningdemo.BroadcastDemo.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ScreenLightReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)){
            System.out.println("屏幕关闭");
            Toast.makeText(context,"屏幕点亮",Toast.LENGTH_LONG).show();
        }else if ("android.intent.action.SCREEN_ON".equals(action)){
            System.out.println("屏幕点亮");
            Toast.makeText(context,"屏幕点亮",Toast.LENGTH_SHORT).show();
        }
    }
}
