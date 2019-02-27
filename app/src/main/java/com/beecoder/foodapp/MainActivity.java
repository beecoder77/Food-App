package com.beecoder.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent makananKategori = new Intent(MainActivity.this, MakananKategori.class);
                    startActivity(makananKategori);
                } if (i == 1 ){
                    Intent minumanKategori = new Intent(MainActivity.this, MinumanKategori.class);
                    startActivity(minumanKategori);
                }
            }
        };

        ListView listView = findViewById(R.id.list_menu);
        listView.setOnItemClickListener(itemClickListener);
    }
}
