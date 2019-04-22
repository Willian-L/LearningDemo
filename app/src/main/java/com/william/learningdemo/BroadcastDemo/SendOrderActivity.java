package com.william.learningdemo.BroadcastDemo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.william.learningdemo.BroadcastDemo.Receiver.CostumOrder.FinalReceiver;
import com.william.learningdemo.R;

public class SendOrderActivity extends Activity {

    EditText edtContent;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_order);

        edtContent = findViewById(R.id.edt_ContentOrder);
        btnSend = findViewById(R.id.btn_SendOrder);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置动作
                Intent intent = new Intent();
                intent.setAction("com.william.broadcastreceiverOrder");
                //receiverPermission 接收广播所需要的权限，一般为null
                //resultReceiver 作为最终的广播接收者所返回的值，一般为null
                BroadcastReceiver resultReceiver = new FinalReceiver();
                //scheduler 处理最终的广播接收值用到的handler，如果传null,会在主线程处理
                //initialCode 初始码，用于区分其他广播，一般设置为Activity.RESULT_OK
                //initialData 初始化的广播数据，发送广播的内容
                String content  = edtContent.getText().toString();
                //initialExtras 额外的数据，一般为null
                sendOrderedBroadcast(intent,null,resultReceiver,null,Activity.RESULT_OK,content,null);
            }
        });
    }
}
