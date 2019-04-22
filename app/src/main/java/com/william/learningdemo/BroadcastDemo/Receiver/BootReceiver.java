package com.william.learningdemo.BroadcastDemo.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.william.learningdemo.MainActivity;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("开机");
        Intent intent1 = new Intent(context, MainActivity.class);
        //在广播接收者当中创建一个Activity，当前应用没有任何Activity在运行，所以不存在一个任务栈
        //需要通过指定一个Flag，在创建Activity前创建一个任务栈
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);
    }
}
