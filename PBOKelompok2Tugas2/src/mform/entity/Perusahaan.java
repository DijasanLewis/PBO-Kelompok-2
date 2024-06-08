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
public class Perusahaan {
    private String nama;
    private Alamat alamat;
    private String kecamatan;
    private String desaKel;
    private String namaPic;
    private String telpPic;
    private String jabatanPic;
    private char jkPic;
    private String unitKerjaPic;
    private String status;
    private double lintang;
    private double bujur;
    private String kbli;
    private KeteranganPerusahaan keteranganPerusahaan;
    
    public Perusahaan(){
        alamat = new Alamat();
        keteranganPerusahaan = new KeteranganPerusahaan();
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public Alamat getAlamat() {
        return alamat;
    }
    public String getKecamatan() {
        return kecamatan;
    }
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }
    public String getDesaKel() {
        return desaKel;
    }
    public void setDesaKel(String desaKel) {
        this.desaKel = desaKel;
    }
    public String getNamaPIC() {
        return namaPic;
    }
    public void setNamaPIC(String namaPic) {
        this.namaPic = namaPic;
    }
    public String getTelpPIC() {
        return telpPic;
    }
    public void setTelpPIC(String telpPic) {
        this.telpPic = telpPic;
    }
    public String getJabatanPIC() {
        return jabatanPic;
    }
    public void setJabatanPIC(String jabatanPic) {
        this.jabatanPic = jabatanPic;
    }
    public char getJK_PIC(){
        return jkPic;
    }
    public void setJK_PIC(char jkPic) {
        this.jkPic = jkPic;
    }
    public String getUnitKerjaPIC() {
        return unitKerjaPic;
    }
    public void setUnitKerjaPIC(String unitKerjaPic) {
        this.unitKerjaPic = unitKerjaPic;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double getLintang() {
        return lintang;
    }
    public void setLintang(double lintang) {
        this.lintang = lintang;
    }
    public double getBujur() {
        return bujur;
    }
    public void setBujur(double bujur) {
        this.bujur = bujur;
    }
    public String getKBLI() {
        return kbli;
    }
    public void setKBLI(String kbli) {
        this.kbli = kbli;
    }
    public KeteranganPerusahaan getKeteranganPerusahaan() {
        return keteranganPerusahaan;
    }
}
