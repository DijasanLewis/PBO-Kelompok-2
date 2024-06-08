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
public class KeteranganPerusahaan {
    private char statusPemodalan;
    private char bentukBadanHukum;
    private char pelaksanaanKemitraan;
    private char kebunPlasmaKonversi;
    private char unitPengolahanProduksi;
    private Integer tahunBerdiri;
    private char jenisPerusahaanTebu;
    
    public char getStatusPemodalan() {
        return statusPemodalan;
    }
    public void setStatusPemodalan(char statusPemodalan) {
        this.statusPemodalan = statusPemodalan;
    }
    public char getBentukBadanHukum() {
        return bentukBadanHukum;
    }
    public void setBentukBadanHukum(char bentukBadanHukum) {
        this.bentukBadanHukum = bentukBadanHukum;
    }
    public char getPelaksanaanKemitraan(){
        return pelaksanaanKemitraan;
    }
    public void setPelaksanaanKemitraan(char pelaksanaanKemitraan) {
        this.pelaksanaanKemitraan = pelaksanaanKemitraan;
    }
    public char getKebunPlasmaKonversi() {
        return kebunPlasmaKonversi;
    }
    public void setKebunPlasmaKonversi(char kebunPlasmaKonversi) {
        this.kebunPlasmaKonversi = kebunPlasmaKonversi;
    }
    public char getUnitPengolahanProduksi() {
        return unitPengolahanProduksi;
    }
    public void setUnitPengolahanProduksi(char unitPengolahanProduksi) {
        this.unitPengolahanProduksi = unitPengolahanProduksi;
    }
    public Integer getTahunBerdiri() {
        return tahunBerdiri;
    }
    public void setTahunBerdiri(Integer tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }
    public char getJenisPerusahaanTebu() {
        return jenisPerusahaanTebu;
    }
    public void setJenisPerusahaanTebu(char jenisPerusahaanTebu) {
        this.jenisPerusahaanTebu = jenisPerusahaanTebu;
    }
}
