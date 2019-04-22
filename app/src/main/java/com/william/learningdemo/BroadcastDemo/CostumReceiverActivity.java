package com.william.learningdemo.BroadcastDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.william.learningdemo.R;

public class CostumReceiverActivity extends Activity {

    TextView tvCostum;
    Button btnNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costum_receiver);

        tvCostum = findViewById(R.id.tv_Costum);
        btnNew = findViewById(R.id.btn_New);

        Intent intent = getIntent();
        final Bundle bundle = intent.getExtras();
        tvCostum.setText(bundle.getCharSequence("Content").toString());

//        btnNew.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent2 = new Intent();
//                intent2.putExtras(bundle);
//                intent2.setAction("com.william.broadcastreceiver2");
//                sendBroadcast(intent2);
//            }
//        });
    }

    public void back(View view) {
        Intent intent = new Intent(this, SendBroadcastActivity.class);
        startActivity(intent);
    }
}
