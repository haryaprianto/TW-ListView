package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Module> modules;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);


        // Create a few food objects in Food array
        if (tvYear.getText().toString().equals("Year 2")) {
            modules = new ArrayList<Module>();
            modules.add(new Module("C208", true));
            modules.add(new Module("C200", false));
            modules.add(new Module("C346", true));
        }else if (tvYear.getText().toString().equals("Year 3")){
            modules = new ArrayList<Module>();
            modules.add(new Module("C288", true));
            modules.add(new Module("C298", true));
            modules.add(new Module("C347", true));
        }else{
            modules = new ArrayList<Module>();
            modules.add(new Module("C100", false));
            modules.add(new Module("C150", false));
            modules.add(new Module("C199", true));
        }

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new ModuleAdapter(this, R.layout.row, modules);
        lv.setAdapter(aa);


    }



}
