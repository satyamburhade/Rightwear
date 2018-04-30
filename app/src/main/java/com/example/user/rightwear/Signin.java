package com.example.user.rightwear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signin extends AppCompatActivity {
    EditText b1,b2,b3,b4;
    Button Reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        b1=(EditText)findViewById(R.id.name);
        b2=(EditText)findViewById(R.id.editText3);
        b3=(EditText)findViewById(R.id.editText4);
        b4=(EditText)findViewById(R.id.editText5);
        Reg=(Button)findViewById(R.id.button);
        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1=b1.getText().toString();
                String s2=b2.getText().toString();
                String s3=b3.getText().toString();
                String s4=b4.getText().toString();

                if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")){

                    Toast.makeText(getApplicationContext(),"Field Is Empty",Toast.LENGTH_LONG).show();

                }

                else{
                    Toast.makeText(getApplicationContext(),"Rgistered Successfully",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(Signin.this,MainActivity.class);
                    startActivity(i);
                }

            }
        });
    }


    public void register(View view)
    {
        startActivity(new Intent(this, MainActivity.class));
    }
}
