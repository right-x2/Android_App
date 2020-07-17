package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    Handler mHandler = null;

    TextView tv = null;
    int count ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        tv = (TextView)findViewById(R.id.text1);
        mHandler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                tv.setText(msg.arg1+"");
            }
        };
        new Thread(new Runnable() {
                @Override
                public void run() {
                    count = 30;
                    for(int i = 0; i < 30; i++){
                        Message msg = mHandler.obtainMessage();
                        count--;
                        msg.arg1 = count;
                        mHandler.sendMessage(msg);
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        }).start();
    }
}