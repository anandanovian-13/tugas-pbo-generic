package model;

import service.Cetak;

public class Mahasiswa extends Person implements Cetak {

    private String nim;

    public Mahasiswa(String nim, String nama) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public void tampilData() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
    }

    @Override
    public void print() {
        System.out.println("Data Mahasiswa Dicetak");
    }
}
