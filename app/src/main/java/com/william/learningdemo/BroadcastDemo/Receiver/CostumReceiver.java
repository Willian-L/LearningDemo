package com.william.learningdemo.BroadcastDemo.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.william.learningdemo.BroadcastDemo.CostumReceiverActivity;

public class CostumReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        Intent intent1 = new Intent(context, CostumReceiverActivity.class);
        intent1.putExtras(bundle);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);
    }
}
