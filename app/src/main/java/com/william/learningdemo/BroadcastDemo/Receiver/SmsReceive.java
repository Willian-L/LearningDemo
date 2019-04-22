package com.william.learningdemo.BroadcastDemo.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;

public class SmsReceive extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("您收到一条短信！");
        Object[] objects = (Object[]) intent.getExtras().get("pdus");
        for (Object obj : objects) {
            //创建短信的信息对象
            SmsMessage message = SmsMessage.createFromPdu((byte[]) obj);
            //获取短信的发送者
            String from = message.getOriginatingAddress();
            //获取短信的内容
            String messageBody = message.getMessageBody();
            System.out.println(from + "发来了一条短信：" + messageBody);
            //判断 from
            if ("10086".equals(from)){
                //通过界面 把短信的内容设置到editText里
                Intent data = new Intent();
                data.setAction("com.william.getcode");
                data.putExtra("code", messageBody);
                context.sendBroadcast(data);
            }
        }
    }
}
