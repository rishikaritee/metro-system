package com.example.metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Parking extends AppCompatActivity {

    ListView l1;
    String r11;
    String a[]={"Chandpole","Civil Line","Mansarovar","New Aatish Market","Railway Station","Ram Nagar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        l1 = (ListView) findViewById(R.id.lw);
        ArrayAdapter<String> obj1;
        obj1=new ArrayAdapter<String>(Parking.this,R.layout.support_simple_spinner_dropdown_item,a);
        l1.setAdapter(obj1);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long ll) {
                r11 =(String)l1.getItemAtPosition(i);

                if(r11.equals("Chandpole")||r11.equals("New Aatish Market")||r11.equals("Ram Nagar"))
                    Toast.makeText(Parking.this,"Parking Available",Toast.LENGTH_LONG).show();
                else

                    Toast.makeText(Parking.this,"Parking Not Available",Toast.LENGTH_LONG).show();
            }
        });
    }
}
