package com.example.metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class other extends AppCompatActivity {
Button bn,bn1,bn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        bn=(Button)findViewById(R.id.button5);
        bn1=(Button)findViewById(R.id.button6);
        bn2=(Button)findViewById(R.id.button7);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o=new Intent(other.this,about.class);
                startActivity(o);
            }
        });
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent on=new Intent(other.this,Parking.class);
                startActivity(on);
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent onn=new Intent(other.this,Farelist.class);
                startActivity(onn);
            }
        });
    }
}
