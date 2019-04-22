package com.william.learningdemo.ServiceDemo.Service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent service = new Intent(context, PhoneService.class);
        context.startService(service);
    }
}
