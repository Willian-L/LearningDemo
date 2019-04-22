package com.william.learningdemo.ServiceDemo.Service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class BindService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        Log.i("bindService", "onBind()");
        return new MyBinder();
    }
    public class MyBinder extends Binder {
        public void callshowToast(String s) {
            showToast(s);
        }

        public void showToast2(String s) {
            Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
        }
    }
    public void showToast(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate() {
        Log.i("bindService", "onCreate()");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("bindService", "onStartCommand()");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        Log.i("bindService", "onDestroy()");
        super.onDestroy();
    }
}
