package com.beecoder.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class menuMinuman extends AppCompatActivity {

    public static final String EXTRA_MINUMANNO = "minumanno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_minuman);

        int minumanno = (Integer) getIntent().getExtras().get(EXTRA_MINUMANNO);

        Minuman minuman = Minuman.minuman[minumanno];

        TextView nama = findViewById(R.id.nama);
        TextView keterangan = findViewById(R.id.keterangan);
        ImageView gambar = findViewById(R.id.gambar);

        nama.setText(minuman.getNama());
        keterangan.setText(minuman.getKeterangan());
        gambar.setImageResource(minuman.getImageID());
    }
}
