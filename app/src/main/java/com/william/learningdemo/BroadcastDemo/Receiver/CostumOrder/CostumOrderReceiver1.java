package com.william.learningdemo.BroadcastDemo.Receiver.CostumOrder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CostumOrderReceiver1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String resultData = getResultData();
        Toast.makeText(context, resultData, Toast.LENGTH_SHORT).show();
        int toInt = Integer.valueOf(resultData).intValue();
        String string = String.valueOf(--toInt);
        setResultData(string);
//        abortBroadcast();
    }
}
