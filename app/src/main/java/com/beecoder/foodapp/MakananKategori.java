package com.beecoder.foodapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MakananKategori extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listMakanan = getListView();

        ArrayAdapter<Makanan> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Makanan.makanan);
        listMakanan.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent makanan = new Intent(MakananKategori.this, menuMakanan.class);
        makanan.putExtra(menuMakanan.EXTRA_MAKANANNO,(int) id);
        startActivity(makanan);
    }
}
