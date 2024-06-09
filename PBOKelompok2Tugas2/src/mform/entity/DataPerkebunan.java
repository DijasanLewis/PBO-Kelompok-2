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
public class DataPerkebunan {
    
    private Perusahaan perusahaan;
    private KantorPusat kantorPusat;
    private GroupPerusahaan groupPerusahaan;
    private Kebun kebun[];
    private int jumlahKebun;
    private StokGKP stokGKP;
    private String produkUtama;
    private KeteranganPetugas keteranganPetugas;
    
    public DataPerkebunan(){
        perusahaan = new Perusahaan();
        stokGKP = new StokGKP();
        kebun = new Kebun[10];
        jumlahKebun = 0;
    }
    //BAGIAN PERUSAHAAN
        // ===1===
    
    public Perusahaan getPerusahaan() {
        return perusahaan;
    }
    
    public void setPerusahaan(Perusahaan perusahaan){
        this.perusahaan = perusahaan;
    }
    
        // ===2===
    
    //============
    //BAGIAN KANTOR PUSAT
    public KantorPusat getKantorPusat() {
        if (kantorPusat != null) {
            return kantorPusat;
        } else {
            return null;
        }
    }

    public void setKantorPusat() {
        if (kantorPusat == null) {
            kantorPusat = new KantorPusat();
        }
    }
    
    public void setKantorPusat(KantorPusat kantorPusat) {
        this.kantorPusat = kantorPusat;
    }    
    
    //BAGIAN GROUP PERUSAHAAN
    public GroupPerusahaan getGroupPerusahaan() {
        if (groupPerusahaan != null) {
            return groupPerusahaan;
        } else {
            return null;
        }
    }

    public void setGroupPerusahaan() {
        if (groupPerusahaan == null) {
            groupPerusahaan = new GroupPerusahaan();
        }
    }   
    
    public void setGroupPerusahaan(GroupPerusahaan groupPerusahaan) {
        this.groupPerusahaan = groupPerusahaan;
    }   
    
    //BAGIAN KEBUN
    public Kebun getKebun(int nomor) {
        if (kebun != null) {
            return kebun[nomor];
        }
        return null;
    }

    public void setKebun() {
        if (jumlahKebun<10) {
            kebun[jumlahKebun] = new Kebun();
            jumlahKebun++;
        }
    }
    
    public void setKebun(Kebun kebun) {
        if (jumlahKebun < 10) {
            this.kebun[jumlahKebun] = kebun; // Mengakses indeks yang sesuai dalam array
            jumlahKebun++;
        }
    }

    
    public void resetKebun(){
        if (kebun != null) {
            for (int i = 0; i < kebun.length; i++) {
                kebun[i] = null;
            }
        }
        jumlahKebun = 0;
    }
    
    public int getJumlahKebun(){
        return jumlahKebun;
    }
    
    //BAGIAN STOK GKP
    public StokGKP getStokGKP(){
        return stokGKP;
    }
    
    public void setStokGKP(StokGKP stokGKP){
        this.stokGKP = stokGKP;
    }
    //BAGIAN Produk Utama
    public String getProdukUtama() {
        return produkUtama;
    }

    public void setProdukUtama(String produkUtama) {
        this.produkUtama = produkUtama;
    }
    
    //BAGIAN KETERANGAN PERUSAHAAN
    public KeteranganPetugas getKeteranganPetugas(){
        return keteranganPetugas;
    }
    
    public void setKeteranganPetugas(KeteranganPetugas keteranganPetugas){
        this.keteranganPetugas = keteranganPetugas;
    }
}
