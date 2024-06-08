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
public class Letak {
    private String prov;
    private String kabKota;

    public Letak(){
    }

    public String getProv(){
        return prov;
    }

    public void setProv(String prov){
        this.prov = prov;
    }
    
    public String getKabKota(){
        return kabKota;
    }

    public void setKabKota(String kabKota){
        this.kabKota = kabKota;
    }
    
}
