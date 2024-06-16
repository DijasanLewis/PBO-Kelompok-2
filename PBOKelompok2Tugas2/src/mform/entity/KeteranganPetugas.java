/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mform.entity;

import java.time.LocalDate;

/**
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
 */

public class KeteranganPetugas {
    private String namaPencacah;
    private LocalDate tanggalMencacah;
    private String namaPemeriksa;
    private LocalDate tanggalMemeriksa;

    public KeteranganPetugas(){
    }
    
    public void setNamaPencacah(String namaPencacah){
        this.namaPencacah = namaPencacah;
        this.tanggalMencacah = LocalDate.now();
    }
    
    public void setPencacah(String namaPencacah, LocalDate tanggalMencacah){
        this.namaPencacah = namaPencacah;
        this.tanggalMencacah = tanggalMencacah;
    }
    
    public void setTanggalMencacah(LocalDate tanggalMencacah) {
        this.tanggalMencacah = tanggalMencacah;
    }
    
    public void setNamaPemeriksa(String namaPemeriksa){
        this.namaPemeriksa = namaPemeriksa;
        this.tanggalMemeriksa = LocalDate.now();
    }
    
     public void setPemeriksa(String namaPemeriksa, LocalDate tanggalMemeriksa){
        this.namaPemeriksa = namaPemeriksa;
        this.tanggalMemeriksa = tanggalMemeriksa;
    }
          
    public void setTanggalMemeriksa(LocalDate tanggalMemeriksa) {
        this.tanggalMemeriksa = tanggalMemeriksa;
    }

    public String getNamaPencacah(){
        return namaPencacah;
    }
    
    public LocalDate getTanggalMencacah(){
        return tanggalMencacah;
    }
    
    public String getNamaPemeriksa(){
        return namaPemeriksa;
    }
    
    public LocalDate getTanggalMemeriksa(){
        return tanggalMemeriksa;
    }
}
