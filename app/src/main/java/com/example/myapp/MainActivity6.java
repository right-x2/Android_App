package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    Button btnUp,btnDown;
    ImageView image1,image2,image3,image4;
    ArrayList<ImageView> list =null;

    class BtnOnClickListener implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {

                case R.id.btnUp :
                    for (int i = 0; i < list.size(); i++){
                        if(list.get(i).getVisibility()==View.INVISIBLE){
                            list.get(i).setVisibility(View.VISIBLE);
                        }
                        else{
                            list.get(i).setVisibility(View.INVISIBLE);
                        }
                    }
                    break ;
                case R.id.btnDown :
                    for (int i = 0; i < 4; i++){
                        if(list.get(i).getVisibility()==View.INVISIBLE){
                            list.get(i).setVisibility(View.VISIBLE);
                        }
                        else{
                            list.get(i).setVisibility(View.INVISIBLE);
                        }
                    }
                    break ;
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        list = new ArrayList<ImageView>();
        btnUp= (Button) findViewById(R.id.btnUp);
        btnDown= (Button) findViewById(R.id.btnDown);
        image1= (ImageView) findViewById(R.id.image1);
        image2= (ImageView) findViewById(R.id.image2);
        image3= (ImageView) findViewById(R.id.image3);
        image4= (ImageView) findViewById(R.id.image4);

        list.add(image1);
        list.add(image2);
        list.add(image3);
        list.add(image4);

        BtnOnClickListener onClickListener = new BtnOnClickListener() ;

        Button btnUp = (Button) findViewById(R.id.btnUp) ;
        btnUp.setOnClickListener(onClickListener) ;
        Button btnDown = (Button) findViewById(R.id.btnDown) ;
        btnDown.setOnClickListener(onClickListener) ;
    }
}