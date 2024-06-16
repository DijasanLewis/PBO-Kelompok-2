/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mform.entity;

/**
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
 */

public class Kebun {
    private Letak letak;
    private String jenisKebun;
    private Produksi produksi;
    private double luasArealTanam;
    
    public Kebun(){
        letak = new Letak();
        produksi = new Produksi();
    }
    
    public String getJenisKebun() {
        return jenisKebun;
    }

    public void setJenisKebun(String jenisKebun) {
        this.jenisKebun = jenisKebun;
    }
    
    public Letak getLetak() {
        return letak;
    }

    public Produksi getProduksi() {
        return produksi;
    }

    public double getLuasArealTanam() {
        return luasArealTanam;
    }

    public void setLuasArealTanam(double luasArealTanam) {
        this.luasArealTanam = luasArealTanam;
    }
}
