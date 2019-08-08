package com.example.metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Station2 extends AppCompatActivity {

    ListView l2;
    static String r2;
    String a[]={"Chandpole","Civil Line","Mansarovar","New Aatish Market","Railway Station","Ram Nagar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station2);
        l2 = (ListView) findViewById(R.id.qq1);
        ArrayAdapter<String> obj4;
        obj4=new ArrayAdapter<String>(Station2.this,R.layout.support_simple_spinner_dropdown_item,a);
        l2.setAdapter(obj4);
        l2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long ll) {
                r2 =(String)l2.getItemAtPosition(i);
                Intent obj4=new Intent(Station2.this,MainActivity.class);



                startActivity(obj4);
            }
        });
    }
}
