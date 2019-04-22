package com.william.learningdemo.ServiceDemo;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.william.learningdemo.R;
import com.william.learningdemo.ServiceDemo.Service.BindService;

public class BindActivity extends AppCompatActivity {

    private MyConnection conn;
    private BindService.MyBinder myBinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bind);
    }

    public void onBind(View view) {
        Intent service = new Intent(this, BindService.class);
        conn = new MyConnection();
        //通过Bind方式开启Service
        //第一个参数 intent
        //第二个参数 ServiceConnection 接口 通过这个接口可以接收服务开启或停止的消息
        //第三个参数 开启服务时候操作的选项 一般传入 BIND_AUTO_CREATE 自动创建Service
        bindService(service, conn, BIND_AUTO_CREATE);
    }

    public void unBind(View view) {
        //使用bindService开启的服务要用Unbind来停止
        unbindService(conn);
    }

    public void callService(View view) {
//        BindService service = new BindService();
//        service.showToast("hello");
        myBinder.callshowToast("hello");
        myBinder.showToast2("world");

    }

    private class MyConnection implements ServiceConnection {

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            //参数二 IBinder是从BindService中onBind方法的返回值传入
            //只有当service的onBind方法返回值不为null才会调用
            Log.i("onBind", "onServiceConnected");
            myBinder = (BindService.MyBinder) service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            //当服务正常退出的时候不会调用
            Log.i("onBind", "onServiceDisconnected");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(conn);
    }
}
