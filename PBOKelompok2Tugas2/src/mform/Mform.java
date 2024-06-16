/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mform;

import database.*;
import java.util.List;
import mform.entity.*;
import mform.form.*;
/**
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
 */

public class Mform {
    public static void main(String[] args) {
        FormDataPerkebunan form = new FormDataPerkebunan();
        DataPerkebunan dataPerkebunan = new DataPerkebunan();
        //PERUSAHAAN
        dataPerkebunan.getPerusahaan().setNama("NamaPerusahaanTest");
        dataPerkebunan.getPerusahaan().getAlamat().setAlamatLengkap("Jalan Stis no.5 Jakarta");
        dataPerkebunan.getPerusahaan().getAlamat().setKodePos("12345");
        dataPerkebunan.getPerusahaan().getAlamat().setTelepon("081312345678");
        dataPerkebunan.getPerusahaan().getAlamat().setEmail("Perusahaantebu@gmail.com");
        dataPerkebunan.getPerusahaan().getAlamat().setFax("021012345678");
        dataPerkebunan.getPerusahaan().getAlamat().setProv("31");
        dataPerkebunan.getPerusahaan().getAlamat().setKabKota("71");
        dataPerkebunan.getPerusahaan().setKecamatan("111");
        dataPerkebunan.getPerusahaan().setDesaKel("111");
        dataPerkebunan.getPerusahaan().setNamaPIC("NamaPICTest");
        dataPerkebunan.getPerusahaan().setTelpPIC("123456789012");
        dataPerkebunan.getPerusahaan().setJabatanPIC("JabatanPICTest");
        dataPerkebunan.getPerusahaan().setJK_PIC('1');
        dataPerkebunan.getPerusahaan().setUnitKerjaPIC("UnitKerjaPICTest");
        dataPerkebunan.getPerusahaan().setStatus("Aktif");
        dataPerkebunan.getPerusahaan().setLintang(80.10);
        dataPerkebunan.getPerusahaan().setBujur(100.10);
        dataPerkebunan.getPerusahaan().setKBLI("12345");
        // KANTOR PUSAT
        dataPerkebunan.setKantorPusat();
        dataPerkebunan.getKantorPusat().setNama("Perusahaan Tebu Pusat");
        dataPerkebunan.getKantorPusat().getAlamat().setAlamatLengkap("Jalan Pusat No.1");
        dataPerkebunan.getKantorPusat().getAlamat().setKodePos("12345");
        dataPerkebunan.getKantorPusat().getAlamat().setTelepon("081112233445");
        dataPerkebunan.getKantorPusat().getAlamat().setEmail("PerusahaanTebuPusat@gmail.com");
        dataPerkebunan.getKantorPusat().getAlamat().setFax("021012233445");
        dataPerkebunan.getKantorPusat().getAlamat().setProv("31");
        dataPerkebunan.getKantorPusat().getAlamat().setKabKota("71");
        // GROUP PERUSAHAAN
        dataPerkebunan.setGroupPerusahaan();
        dataPerkebunan.getGroupPerusahaan().setNama("Group Perusahaan Tebu");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setAlamatLengkap("Jalan Perusahaan Tebu No.15");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setKodePos("84756");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setTelepon("081298765432");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setEmail("GroupPerusahaanTebu@gmail.com");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setFax("021098765432");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setProv("12");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setKabKota("78");
        //KETERANGAN PERUSAHAAN
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setStatusPemodalan('1');
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum('1');
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setPelaksanaanKemitraan('1');
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setKebunPlasmaKonversi('1');
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setUnitPengolahanProduksi('1');
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setTahunBerdiri(2010);
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setJenisPerusahaanTebu('1');
        // KEBUN
        dataPerkebunan.setProdukUtama("Tebu Impor");
        dataPerkebunan.setKBKI("1234567890");
        dataPerkebunan.setKebun();
        dataPerkebunan.getKebun(0).getLetak().setKabKota("20");
        dataPerkebunan.getKebun(0).getLetak().setProv("10");
        dataPerkebunan.getKebun(0).getProduksi().setLuasArealTebang(0.88d);
        dataPerkebunan.getKebun(0).getProduksi().setRendemenHablur(15.0d);
        dataPerkebunan.getKebun(0).getProduksi().setProduksiGKP(2.5d);
        dataPerkebunan.getKebun(0).getProduksi().setProduksiHablur(2.0d);
        dataPerkebunan.getKebun(0).getProduksi().setProduksiTebu(1.2d);
        dataPerkebunan.getKebun(0).getProduksi().setProduksiTetes(0.5d);
        dataPerkebunan.getKebun(0).setJenisKebun("Tebu Sendiri");
        
        dataPerkebunan.setKebun();
        dataPerkebunan.getKebun(1).getLetak().setKabKota("50");
        dataPerkebunan.getKebun(1).getLetak().setProv("12");
        dataPerkebunan.getKebun(1).getProduksi().setLuasArealTebang(0.88d);
        dataPerkebunan.getKebun(1).getProduksi().setRendemenHablur(15.0d);
        dataPerkebunan.getKebun(1).getProduksi().setProduksiGKP(2.5d);
        dataPerkebunan.getKebun(1).getProduksi().setProduksiHablur(2.0d);
        dataPerkebunan.getKebun(1).getProduksi().setProduksiTebu(1.2d);
        dataPerkebunan.getKebun(1).getProduksi().setProduksiTetes(0.5d);
        dataPerkebunan.getKebun(1).setJenisKebun("Tebu Rakyat");

        //Stok GKP
        dataPerkebunan.getStokGKP().setStokPabrikGula(2.1d);
        dataPerkebunan.getStokGKP().setStokPedagang(1.5d);
        dataPerkebunan.getStokGKP().setStokPetani(4.1d);
        
        //Keterangan Petugas
        dataPerkebunan.getKeteranganPetugas().setNamaPencacah("Amir Syarifudin");
        dataPerkebunan.getKeteranganPetugas().setNamaPemeriksa("Bambang Sucipto");
        form.setDataPerkebunan(dataPerkebunan);
        if(!form.validate()){
            System.out.println("Data invalid. Fix errors below:");
            List<String> errorMessages = form.getErrorMessages();
            for (String errorMessage : errorMessages) {
                System.out.println("- "+ errorMessage);
            }
        }else{
            System.out.println("Save data");
            form.save("data_perkebunan.txt");
            System.out.println("Data saved!");
            System.out.println("Print data");
            form.print();
            form.save("data_perkebunan.txt");
            
            // Memasukkan data ke dalam database
            System.out.println("MEMASUKKAN DATA KE DALAM DATABSE");
            DataInserter dataInserter = new DataInserter();
            dataInserter.insertData(dataPerkebunan);
            
            form.reset();
            
            //Mencoba mengambil data dari database
            System.out.println("MENGAMBIL DATA \"Perusahaan Tebu Sejahtera\" DARI DATABSE");
            DataRetriever dataRetriever = new DataRetriever();
            dataPerkebunan = dataRetriever.retrieveData("Perusahaan Tebu Sejahtera");
            form.setDataPerkebunan(dataPerkebunan);
            //
            
            form.print();
        }
    }
    
}
