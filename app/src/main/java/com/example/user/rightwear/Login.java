package com.example.user.rightwear;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {
    Button se;
    Bundle data;
    String name1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        data = getIntent().getExtras();
        name1=data.getString("name");
        se =(Button)findViewById(R.id.button2);
        ViewPager viewPager=findViewById(R.id.vp);
        ImageAdapter adapter=new ImageAdapter(this);
        viewPager.setAdapter(adapter);
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Login.this,Imagesoc.class);
                j.putExtra("name",name1);
                startActivity(j);
            }
        });


    }
    }

