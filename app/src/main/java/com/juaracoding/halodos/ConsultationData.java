package com.juaracoding.halodos;

public class ConsultationData {

    private int ImageResourceId;
    private String Nama;
    private String Tanggal;
    private String Jam;

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.ImageResourceId = imageResourceId;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String tanggal) {
        this.Tanggal = tanggal;
    }

    public String getJam() {
        return Jam;
    }

    public void setJam(String jam) {
        this.Jam = jam;
    }

    public ConsultationData(int ImageResourceId, String Nama, String Tanggal, String Jam) {
        this.ImageResourceId = ImageResourceId;
        this.Nama = Nama;
        this.Tanggal = Tanggal;
        this.Jam = Jam;
    }
}
