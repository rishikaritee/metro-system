package com.example.metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Station extends AppCompatActivity {

ListView l1;
    static String r1;
String ak[]={"Chandpole","Civil Line","Mansarovar","New Aatish Market","Railway Station","Ram Nagar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station);
        l1 = (ListView) findViewById(R.id.qq);
        ArrayAdapter<String>obj1;
        obj1=new ArrayAdapter<String>(Station.this,R.layout.support_simple_spinner_dropdown_item,ak);
        l1.setAdapter(obj1);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long ll) {
                 r1 =(String)l1.getItemAtPosition(i);
                 Intent obj1=new Intent(Station.this,MainActivity.class);



                 startActivity(obj1);
            }
        });
    }
}
