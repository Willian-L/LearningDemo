package com.william.learningdemo.BroadcastDemo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.EditText;
import com.william.learningdemo.R;

public class SmsActivity extends Activity {

    private EditText edtSms;
    private BroadcastReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        edtSms = findViewById(R.id.edt_sms);
        receiver = new CodeReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.william.getcode");
        registerReceiver(receiver,filter);
    }

    private class CodeReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            String code = intent.getStringExtra("code");
            edtSms.setText(code);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
}
