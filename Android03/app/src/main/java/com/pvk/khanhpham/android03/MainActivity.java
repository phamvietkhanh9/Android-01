package com.pvk.khanhpham.android03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnAnh;
    ImageView imgBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        btnAnh = findViewById(R.id.btn2);
        imgBody = findViewById(R.id.imgBody);


        btnAnh.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                imgBody.setImageResource(R.drawable.thanhbuoidoi);
            }
        });


    }




}
