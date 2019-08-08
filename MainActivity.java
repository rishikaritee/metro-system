package com.example.metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button b,b1,b2,b3;
static String s3,s2;
TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView2);
        tv1=(TextView)findViewById(R.id.textView3);
        b=(Button)findViewById(R.id.button3);
        b1=(Button) findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button);
        tv.setText(Station.r1);
        tv1.setText(Station2.r2);
        s3=tv.getText().toString();
        s2=tv1.getText().toString();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(MainActivity.this,Station.class);
                startActivity(obj);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(MainActivity.this,Station2.class);
                startActivity(obj);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o=new Intent(MainActivity.this,other.class);
                startActivity(o);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(MainActivity.this,Route.class);
                startActivity(ob);
            }
        });
    }
}
