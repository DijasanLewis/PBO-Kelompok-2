/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mform.entity;

/**
 *
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
 */
public class Produksi {
    private double luasArealTebang;
    private double produksiTebu;
    private double produksiGKP;
    private double produksiTetes;
    private double produksiHablur;
    private double pendemenHablur;
    
    public Produksi(){
    }

    public double getLuasArealTebang() {
        return luasArealTebang;
    }

    public void setLuasArealTebang(double luasArealTebang) {
        this.luasArealTebang = luasArealTebang;
    }

    public double getProduksiTebu() {
        return produksiTebu;
    }

    public void setProduksiTebu(double produksiTebu) {
        this.produksiTebu = produksiTebu;
    }

    public double getProduksiGKP() {
        return produksiGKP;
    }

    public void setProduksiGKP(double produksiGKP) {
        this.produksiGKP = produksiGKP;
    }

    public double getProduksiTetes() {
        return produksiTetes;
    }

    public void setProduksiTetes(double produksiTetes) {
        this.produksiTetes = produksiTetes;
    }

    public double getProduksiHablur() {
        return produksiHablur;
    }

    public void setProduksiHablur(double produksiHablur) {
        this.produksiHablur = produksiHablur;
    }

    public double getPendemenHablur() {
        return pendemenHablur;
    }

    public void setPendemenHablur(double pendemenHablur) {
        this.pendemenHablur = pendemenHablur;
    }
    
}
