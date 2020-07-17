package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    TextView result = null;
    Context context = null;

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAC,btnPlus,btnMinus,btnMul,btnDiv,btnResult;

    public String opr="";
    public String sum = "0";
    public String temp = "";
    public int answer = 0;
    public int flag = 0;

    public void cal(){
        if(opr=="+"){
            answer = answer + Integer.parseInt(sum);
        } else if(opr=="*"){
            answer = answer * Integer.parseInt(sum);
        } else if(opr=="-"){
            answer = answer - Integer.parseInt(sum);
        }else if(opr=="/"){
            answer = answer / Integer.parseInt(sum);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);
        btn0= (Button) findViewById(R.id.btn0);
        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn4= (Button) findViewById(R.id.btn4);
        btn5= (Button) findViewById(R.id.btn5);
        btn6= (Button) findViewById(R.id.btn6);
        btn7= (Button) findViewById(R.id.btn7);
        btn8= (Button) findViewById(R.id.btn8);
        btn9= (Button) findViewById(R.id.btn9);
        btnAC= (Button) findViewById(R.id.btnAC);
        btnPlus= (Button) findViewById(R.id.btnPlus);
        btnMinus= (Button) findViewById(R.id.btnMinus);
        btnMul= (Button) findViewById(R.id.btnMul);
        btnDiv= (Button) findViewById(R.id.btnDiv);
        btnResult = (Button) findViewById(R.id.btnResult);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = (TextView) findViewById(R.id.result);
                switch (view.getId()) {
                    case R.id.btn0 :
                        if(flag==0) {
                            sum = "0";
                            result.setText("0") ;
                            break;
                        }
                        else sum = sum + "0";
                        result.setText(sum) ;
                        break ;
                    case R.id.btn1 :
                        if(flag==0) {
                            flag = 1;
                            sum = "1";
                        }
                        else sum = sum + "1";
                        result.setText(sum) ;
                        break ;
                    case R.id.btn2 :
                        if(flag==0) {
                            flag = 1;
                            sum = "2";
                        }
                        else sum = sum + "2";
                        result.setText(sum) ;
                        break ;
                    case R.id.btn3 :
                        if(flag==0) {
                            flag = 1;
                            sum = "3";
                        }
                        else sum = sum + "3";
                        result.setText(sum) ;
                        break ;
                    case R.id.btn4 :
                        if(flag==0) {
                            flag = 1;
                            sum = "4";
                        }
                        else sum = sum + "4";
                        result.setText(sum) ;
                        break ;
                    case R.id.btn5 :
                        if(flag==0) {
                            sum = "5";
                            flag = 1;
                        }
                        else sum = sum + "5";
                        result.setText(sum) ;
                        break ;
                    case R.id.btn6 :
                        if(flag==0) {
                            sum = "6";
                            flag = 1;
                        }
                        else sum = sum + "6";
                        result.setText(sum) ;
                        break ;
                    case R.id.btn7 :
                        if(flag==0) {
                            sum = "7";
                            flag = 1;
                        }
                        else sum = sum + "7";
                        result.setText(sum) ;
                        break ;
                    case R.id.btn8 :
                        if(flag==0) {
                            flag = 1;
                            sum = "8";
                        }
                        else sum = sum + "8";
                        result.setText(sum) ;
                        break ;
                    case R.id.btn9 :
                        if(flag==0){
                            sum = "9";
                            flag = 1;
                        }
                        else sum = sum + "9";
                        result.setText(sum) ;
                        break ;
                    case R.id.btnAC :
                        flag = 0;
                        sum = "0";
                        result.setText(sum) ;
                        break ;
                    case R.id.btnPlus :
                        if(opr!="") {
                            cal();
                            result.setText(String.valueOf(answer));
                        }
                        else{
                            answer = Integer.parseInt(sum);
                        }
                        flag = 0;
                        sum = "0";
                        opr = "+";
                        break ;
                    case R.id.btnMinus :
                        if(opr!="") {
                            cal();
                            result.setText(String.valueOf(answer));
                        }
                        else{
                            answer = Integer.parseInt(sum);
                        }
                        flag = 0;
                        sum = "0";
                        opr = "-";
                        break ;
                    case R.id.btnMul :
                        if(opr!="") {
                            cal();
                            result.setText(String.valueOf(answer));
                        }
                        else{
                            answer = Integer.parseInt(sum);
                        }
                        flag = 0;
                        sum = "0";
                        opr = "*";
                        break ;
                    case R.id.btnDiv :
                        if(opr!="") {
                            cal();
                            result.setText(String.valueOf(answer));
                        }
                        else{
                            answer = Integer.parseInt(sum);
                        }
                        flag = 0;
                        sum = "0";
                        opr = "/";
                        break ;
                    case R.id.btnResult :
                        if(opr!="") {
                            cal();
                            result.setText(String.valueOf(answer));
                        }
                        else{
                            break;
                        }
                        flag = 0;
                        sum = String.valueOf(answer);
                        opr = "";
                        break ;
                }
            }
        } ;
        btn0.setOnClickListener(onClickListener) ;
        btn1.setOnClickListener(onClickListener) ;
        btn2.setOnClickListener(onClickListener) ;
        btn3.setOnClickListener(onClickListener) ;
        btn4.setOnClickListener(onClickListener) ;
        btn5.setOnClickListener(onClickListener) ;
        btn6.setOnClickListener(onClickListener) ;
        btn7.setOnClickListener(onClickListener) ;
        btn8.setOnClickListener(onClickListener) ;
        btn9.setOnClickListener(onClickListener) ;
        btnAC.setOnClickListener(onClickListener) ;
        btnPlus.setOnClickListener(onClickListener) ;
        btnMinus.setOnClickListener(onClickListener) ;
        btnMul.setOnClickListener(onClickListener) ;
        btnDiv.setOnClickListener(onClickListener) ;
        btnResult.setOnClickListener(onClickListener) ;
    }
}