package com.beecoder.foodapp;

public class Makanan {

    private String nama;
    private String keterangan;
    private int imageID;

    public static final Makanan [] makanan ={

            new Makanan("Nasgor","Nasi Goreng ngga enak, ada di setiap trotoar di Sarinah", R.drawable.nasgor),
            new Makanan("Rames","Nasi rames, makanan acak sesuai selera penjual", R.drawable.rames),
            new Makanan("Bubur Ayam","#TEAM_NGGA_DIADUK", R.drawable.buryam),
    };

    public Makanan(String nama, String keterangan, int imageID){
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
