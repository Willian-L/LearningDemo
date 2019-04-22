package com.william.learningdemo.ServiceDemo.Service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaRecorder;
import android.os.IBinder;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

import java.io.IOException;

public class PhoneService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("onCreate");
        //创建一个电话管理器对象，通过这个对象可以监听电话的状态
        TelephonyManager manager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
        //PhoneStateListener电话状态监听器
        MyPhoneStateListener listener = new MyPhoneStateListener();
        //调用电话管理器的listen方法注册监听
        manager.listen(listener, PhoneStateListener.LISTEN_CALL_STATE);
    }

    private class MyPhoneStateListener extends PhoneStateListener {
        private MediaRecorder recorder;

        @Override
        public void onCallStateChanged(int state, String phoneNumber) {
            switch (state) {
                case TelephonyManager.CALL_STATE_IDLE:
                    System.out.println("空闲状态" + "录音结束");
                    if (recorder != null) {
                        try {
                            //停止当前录音
                            recorder.stop();
                            //重置recorder
                            recorder.reset();   // You can reuse the object by going back to setAudioSource() step
                            //释放recorder对象
                            recorder.release(); // Now the object cannot be reused
                        } catch (Exception e) {

                        }
                    }
                    break;
                case TelephonyManager.CALL_STATE_RINGING:
                    System.out.println("响铃，来电号码是" + phoneNumber + "，准备一个录音机");
                    recorder = new MediaRecorder();
                    //设计音频的输入源
                    //MIC 当前的麦克风
                    //Voice_CALL 既能用上行的声音，也能用下行的声音
                    recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
                    //设置音频输出的格式
                    recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
                    //设置音频编码
                    //AMR 早期彩屏彩铃手机上使用的音频格式，一般用作手机铃声
                    //NB  窄带  对应  WD  宽带
                    recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
                    //设置输出之后文件保存的路径
                    recorder.setOutputFile(getCacheDir() + "/" + phoneNumber + ".3gp");
                    //录音机开始准备
                    try {
                        recorder.prepare();
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case TelephonyManager.CALL_STATE_OFFHOOK:
                    System.out.println("接听电话：" + phoneNumber + "，开始录音");
                    recorder.start();
                    break;
            }
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");
    }
}
