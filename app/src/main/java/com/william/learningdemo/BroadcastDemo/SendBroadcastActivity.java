package com.william.learningdemo.BroadcastDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.william.learningdemo.R;

public class SendBroadcastActivity extends Activity {

    EditText edtContent;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_broadcast);

        edtContent = findViewById(R.id.edt_Content);
        btnSend = findViewById(R.id.btn_Send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putCharSequence("Content", edtContent.getText());
                Intent intent = new Intent();
                intent.putExtras(bundle);
                intent.setAction("com.william.broadcastreceiver");
                sendBroadcast(intent);
            }
        });
    }
}
