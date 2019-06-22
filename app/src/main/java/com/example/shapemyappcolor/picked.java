package com.example.shapemyappcolor;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class picked extends AppCompatActivity {

 //   @Override
   // protected void onCreate(Bundle savedInstanceState) {
     //   super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_picked);

        // Array of strings storing country names
        String[] hex = new String[] {
                "#ffffff",
                "#000000",
                "#fff0ff",
                "#101011",
                "#fff000",
                "#ff7a7ad1",
                "#ff818d43",
                "#ff8a414",
                "#ff00000",
                "#ff6c97af"

        };


        String[] color = new String[]{
                "#ffffff",
                "#000000",
                "#fff0ff",
                "#101011",
                "#fff000",
                "#ff7a7ad1",
                "#ff818d43",
                "#ff8a414",
                "#ff00000",
                "#ff6c97af"
        };

        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_picked);

            // Each row in the list stores country name, currency and flag
            List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

            for(int i=0;i<10;i++) {
                HashMap<String, String> hm = new HashMap<String, String>();
                hm.put("txt",":" + hex[i]);
                hm.put("cur",":" + color[i]);

                aList.add(hm);
            }
            Button btn=findViewById(R.id.btn);

            // Keys used in Hashmap
            String[] from = { "txt","cur" };

            // Ids of views in listview_layout
            int[] to = { R.id.disp,R.id.btn};

            // Instantiating an adapter to store each items
            // R.layout.listview_layout defines the layout of each item
            SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.singleitem, from, to);

            // Getting a reference to listview of main.xml layout file
            ListView listView = ( ListView ) findViewById(R.id.listV);

            // Setting the adapter to the listView
            listView.setAdapter(adapter);
        }
    }