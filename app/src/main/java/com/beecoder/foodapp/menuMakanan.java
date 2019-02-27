package com.beecoder.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class menuMakanan extends AppCompatActivity {

    public static final String EXTRA_MAKANANNO = "makananno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);

        int makananno = (Integer) getIntent().getExtras().get(EXTRA_MAKANANNO);

        Makanan makanan = Makanan.makanan[makananno];

        TextView nama = findViewById(R.id.nama);
        TextView keterangan = findViewById(R.id.keterangan);
        ImageView gambar = findViewById(R.id.gambar);

        nama.setText(makanan.getNama());
        keterangan.setText(makanan.getKeterangan());
        gambar.setImageResource(makanan.getImageID());
    }
}
