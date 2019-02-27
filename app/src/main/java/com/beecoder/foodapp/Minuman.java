package com.beecoder.foodapp;

public class Minuman {

    private String nama;
    private String keterangan;
    private int imageID;

    public static final Minuman [] minuman ={

            new Minuman("Es Teh Panas","Manis Kaya kamu", R.drawable.estehpanas),
            new Minuman("Es Jeruk","Jeruk kok minum jeruk", R.drawable.esjeruk),
            new Minuman("Jus Alpukat","enak bang", R.drawable.jusalpukat),
    };

    public Minuman(String nama, String keterangan, int imageID){
        this.nama = nama;
        this.keterangan = keterangan;
        this.imageID = imageID;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public int getImageID() {
        return imageID;
    }

    @Override
    public String toString() {
        return this.nama;
    }
}
