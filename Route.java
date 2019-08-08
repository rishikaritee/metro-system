package com.example.metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.metro.MainActivity.s2;
import static com.example.metro.MainActivity.s3;

public class Route extends AppCompatActivity {
String s1[]={"Chandpole","Civil Line","Mansarovar","New Aatish Market","Railway Station","Ram Nagar"};
int km[]={0,1,2,3,4,5,6};
int tym[]={0,1,2,3,4,5,6};
int i=0,ft=0;
ListView lp;


TextView a1,a2,a3;
int g=0,h=0,j=0,y=0,k=0,t=0;
    int h1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        a1=(TextView)findViewById(R.id.tb7);
        a2=(TextView)findViewById(R.id.tb8) ;
        a3=(TextView)findViewById(R.id.tb9);
        lp=(ListView)findViewById(R.id.jk);
        for(i=0;i<s1.length;i++){
          if(s3.equals(s1[i]))
              g=i;

       }
        for(j=0;j<s1.length;j++){
            if(s2.equals(s1[j]))
                h=j;
        }
       int y1=Math.abs(g-h);
        y =y1*10;
       String p[]=new String[y1+1];
        if(g<h) {

                for (i = g; i <= h; i++) {

                    p[h1] = s1[i];
                    h1++;

            }
        }
        else {

                for (i = g; i >= h; i--) {

                    p[ft] = s1[i];
                    ft++;

            }
        }
        if(g<h){
            for(i=g;i<=h;i++){
                k = k + km[i];
                t = t + tym[i];
            }
        }
        else{
            for(i=g;i>=h;i--){

                k = k + km[i];
                t = t + tym[i];
            }
        }

            a1.setText("" + k);
            a2.setText("" + y);
            a3.setText("" + t);

        ArrayAdapter<String>obj;
        obj=new ArrayAdapter<String>(Route.this,R.layout.support_simple_spinner_dropdown_item,p);
        lp.setAdapter(obj);


    }
}
