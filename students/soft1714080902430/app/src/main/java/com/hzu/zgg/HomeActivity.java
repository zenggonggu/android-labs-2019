package com.hzu.zgg;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button chat=(Button)findViewById(R.id.chat);


        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 给bnt1添加点击响应事件
                Intent intent =new Intent(HomeActivity.this, ChatActivity .class);
                //启动
                startActivity(intent);
            }
        });
        Button photo=(Button)findViewById(R.id.photo);


        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 给bnt1添加点击响应事件
                Intent intent =new Intent(HomeActivity.this, PhotoActivity .class);
                //启动
                startActivity(intent);
            }
        });
        Button getMessage =(Button)findViewById(R.id.getMessage);


        getMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 给bnt1添加点击响应事件
                Intent intent =new Intent(HomeActivity.this, InternetActivity .class);
                //启动
                startActivity(intent);
            }
        });

        Button beauty =(Button)findViewById(R.id.beauty);


        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 给bnt1添加点击响应事件
                Intent intent =new Intent(HomeActivity.this, Soft1714080902430Activities .class);
                //启动
                startActivity(intent);
            }
        });


    }

}
