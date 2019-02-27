package com.beecoder.foodapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MinumanKategori extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listMinuman = getListView();

        ArrayAdapter<Minuman> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Minuman.minuman);
        listMinuman.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent minuman = new Intent(MinumanKategori.this, menuMinuman.class);
        minuman.putExtra(menuMinuman.EXTRA_MINUMANNO,(int) id);
        startActivity(minuman);
    }
}
