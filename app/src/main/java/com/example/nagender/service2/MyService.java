package com.example.nagender.service2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Nagender on 6/29/2017.
 */
public class MyService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"start service...",Toast.LENGTH_LONG).show();
        return START_STICKY ;
    }


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {

        Toast.makeText(this,"service destroyed",Toast.LENGTH_LONG).show();
    }
}
