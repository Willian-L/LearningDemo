package com.william.learningdemo.BroadcastDemo.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class DailReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //获取用户输入的IP前缀
        SharedPreferences sp = context.getSharedPreferences("info", Context.MODE_PRIVATE);
        String prefix = sp.getString("prefix", "17951");
        //获取拨打的电话号码
        String number = getResultData();
        //修改拨打的电话号码
        setResultData(prefix + number);
        System.out.println("拨打" + prefix + number);
//        setResultData("17951"+number);
    }
}
