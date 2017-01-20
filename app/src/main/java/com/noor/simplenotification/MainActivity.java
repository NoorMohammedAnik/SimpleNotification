package com.noor.simplenotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myNotification();
    }


    public void myNotification()
    {
        String name=this.getClass().getName();
        String [] strings=name.split("\\.");
        Notification noti=new Notification.Builder(this).setContentTitle("Simple App")
                .setContentText("Its a best app ").setAutoCancel(true)
                .setTicker("New Message Alert!")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(name).build();

        NotificationManager notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify((int) System.currentTimeMillis(),noti);
    }


}
