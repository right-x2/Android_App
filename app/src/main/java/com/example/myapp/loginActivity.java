package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    Intent intent = null;
    Context context = this;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btnLogin :
                        Toast.makeText(getApplicationContext(),"로그인", Toast.LENGTH_SHORT).show();
                        intent = new Intent(context,MainActivity.class);
                        startActivity(intent);
                        break ;
                }
            }
        } ;
        btnLogin.setOnClickListener(onClickListener) ;
    }
}