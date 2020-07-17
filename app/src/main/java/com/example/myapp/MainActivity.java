package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    TextView textBox = null;
    Context context = this;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn4= (Button) findViewById(R.id.btn4);
        btn5= (Button) findViewById(R.id.btn5);
        btn6= (Button) findViewById(R.id.btn6);
        btn7= (Button) findViewById(R.id.btn7);
        btn8= (Button) findViewById(R.id.btn8);
        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn1 :
                            Toast.makeText(getApplicationContext(),"화면 전환", Toast.LENGTH_SHORT).show();
                            intent = new Intent(context,MainActivity2.class);
                            startActivity(intent);
                        break ;
                    case R.id.btn4 :
                            Toast.makeText(getApplicationContext(),"화면 전환", Toast.LENGTH_SHORT).show();
                            intent = new Intent(context,MainActivity4.class);
                            startActivity(intent);
                        break ;
                    case R.id.btn5 :
                            Toast.makeText(getApplicationContext(),"화면 전환", Toast.LENGTH_SHORT).show();
                            intent = new Intent(context,MainActivity3.class);
                            startActivity(intent);
                        break ;
                    case R.id.btn6 :
                            Toast.makeText(getApplicationContext(),"화면 전환", Toast.LENGTH_SHORT).show();
                            intent = new Intent(context,MainActivity5.class);
                            startActivity(intent);
                            break;
                    case R.id.btn7 :
                        Toast.makeText(getApplicationContext(),"화면 전환", Toast.LENGTH_SHORT).show();
                        intent = new Intent(context,MainActivity6.class);
                        startActivity(intent);
                        break ;
                    case R.id.btn8 :
                        Toast.makeText(getApplicationContext(),"화면 전환", Toast.LENGTH_SHORT).show();
                        intent = new Intent(context,MainActivity7.class);
                        startActivity(intent);
                        break ;


                }
            }
        } ;

        btn1.setOnClickListener(onClickListener) ;
        btn4.setOnClickListener(onClickListener) ;
        btn5.setOnClickListener(onClickListener) ;
        btn6.setOnClickListener(onClickListener) ;
        btn7.setOnClickListener(onClickListener) ;
        btn8.setOnClickListener(onClickListener) ;
    }
}