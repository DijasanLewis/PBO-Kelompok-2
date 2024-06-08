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
public class Alamat extends Letak{
    private String alamatLengkap;
    private String kodePos;
    private String telepon;
    private String email;
    private String fax;

    public Alamat(){
    }
    
    public String getAlamatLengkap(){
        return alamatLengkap;
    }

    public void setAlamatLengkap(String alamatLengkap){
        this.alamatLengkap = alamatLengkap;
    }
    
    public String getKodePos(){
        return kodePos;
    }

    public void setKodePos(String kodePos){
        this.kodePos = kodePos;
    }
    public String getTelepon(){
        return telepon;
    }

    public void setTelepon(String telepon){
        this.telepon = telepon;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getFax(){
        return fax;
    }

    public void setFax(String fax){
        this.fax = fax;
    }
    
}
