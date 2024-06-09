/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mform.form;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import mform.entity.*;


/**
 *
 * @author yedij
 */
public class FormDataPerkebunan extends Form{

    private DataPerkebunan dataPerkebunan;
   
    public FormDataPerkebunan() {
    }

    public FormDataPerkebunan(DataPerkebunan dataPerkebunan) {
        this.dataPerkebunan = dataPerkebunan;
    }

    public void setDataPerkebunan(DataPerkebunan dataPerkebunan) {
        this.dataPerkebunan = dataPerkebunan;
    }

    public DataPerkebunan getDataPerkebunan() {
        return dataPerkebunan;
    }

    @Override
    public boolean validate() {
        String email;
        //PERUSAHAAN
        if (dataPerkebunan.getPerusahaan().getNama().length() > 25) {
            super.addErrorMessages("Nama Perusahaan invalid: lebih dari 25 karakter.");
        }
        if (dataPerkebunan.getPerusahaan().getAlamat().getAlamatLengkap().length() > 50) {
            super.addErrorMessages("Alamat Perusahaan invalid: lebih dari 50 karakter.");
        }
        if (!dataPerkebunan.getPerusahaan().getAlamat().getKodePos().matches("\\d{5}")) {
            super.addErrorMessages("Kode Pos Perusahaan invalid: harus terdiri dari 5 angka (0-9).");
        }
        if (!dataPerkebunan.getPerusahaan().getAlamat().getTelepon().matches("\\d{12}")) {
            super.addErrorMessages("Nomor Telepon Perusahaan invalid: harus terdiri dari 12 angka (0-9).");
        }
        email = dataPerkebunan.getPerusahaan().getAlamat().getEmail();
        if (!(email.contains("@") && email.contains("."))) {
            super.addErrorMessages("Email Perusahaan invalid: harus memiliki karakter '@' dan '.'.");
        }
        if (!dataPerkebunan.getPerusahaan().getAlamat().getFax().matches("\\d{12}")) {
            super.addErrorMessages("Fax Perusahaan invalid: harus terdiri dari 12 angka (0-9).");
        }
        if (!dataPerkebunan.getPerusahaan().getAlamat().getProv().matches("\\d{2}")) {
            super.addErrorMessages("Kode Provinsi Perusahaan invalid: harus terdiri dari 2 angka (0-9).");
        }
        if (!dataPerkebunan.getPerusahaan().getAlamat().getKabKota().matches("\\d{2}")) {
            super.addErrorMessages("Kode Kabupaten/Kota Perusahaan invalid: harus terdiri dari 2 angka (0-9).");
        }
        if (!dataPerkebunan.getPerusahaan().getKecamatan().matches("\\d{3}")) {
            super.addErrorMessages("Kode Kecamatan invalid: harus terdiri dari 3 angka (0-9).");
        }
        if (!dataPerkebunan.getPerusahaan().getDesaKel().matches("\\d{3}")) {
            super.addErrorMessages("Kode Desa/Kelurahan invalid: harus terdiri dari 3 angka (0-9).");
        }
        if (dataPerkebunan.getPerusahaan().getNamaPIC().length() > 25) {
            super.addErrorMessages("Nama PIC invalid: lebih dari 25 karakter.");
        }
        if (!dataPerkebunan.getPerusahaan().getTelpPIC().matches("\\d{12}")) {
            super.addErrorMessages("Nomor Telepon PIC invalid: harus terdiri dari 12 angka (0-9).");
        }
        if (dataPerkebunan.getPerusahaan().getJabatanPIC().length() > 20) {
            super.addErrorMessages("Jabatan PIC invalid: lebih dari 20 karakter).");
        }
        if (dataPerkebunan.getPerusahaan().getJK_PIC() != '1' && dataPerkebunan.getPerusahaan().getJK_PIC() != '2') {
            super.addErrorMessages("Jenis Kelamin PIC invalid: harus berupa karakter '1' atau '2'.");
        }
        if (dataPerkebunan.getPerusahaan().getUnitKerjaPIC().length() > 25) {
            super.addErrorMessages("Unit Kerja PIC invalid: lebih dari 25 karakter).");
        }
        switch (dataPerkebunan.getPerusahaan().getStatus()) {
            case "Aktif": break;
            case "Tutup": break;
            case "Tutup Sementara": break;
        default:
            super.addErrorMessages("Status Perusahaan invalid: harus 'Aktif', 'Tutup', atau 'Tutup Sementara'.");
        }
        if (dataPerkebunan.getPerusahaan().getLintang() < -90 || dataPerkebunan.getPerusahaan().getLintang() > 90) {
            super.addErrorMessages("Koordinat Lintang Perusahaan invalid: harus dalam rentang -90 hingga +90.");
        }
        if (dataPerkebunan.getPerusahaan().getBujur() < -180 || dataPerkebunan.getPerusahaan().getBujur() > 180) {
            super.addErrorMessages("Koordinat Bujur Perusahaan invalid: harus dalam rentang -180 hingga +180.");
        }
        if (!dataPerkebunan.getPerusahaan().getKBLI().matches("\\d{5}")) {
            super.addErrorMessages("KBLI invalid: harus terdiri dari 5 angka (0-9).");
        }
        // KANTOR PUSAT
        if (dataPerkebunan.getKantorPusat().getNama().length() > 25) {
            super.addErrorMessages("Nama Kantor Pusat invalid: lebih dari 25 karakter.");
        }
        if (dataPerkebunan.getKantorPusat().getAlamat().getAlamatLengkap().length() > 50) {
            super.addErrorMessages("Alamat Kantor Pusat invalid: lebih dari 50 karakter.");
        }
        if (!dataPerkebunan.getKantorPusat().getAlamat().getKodePos().matches("\\d{5}")) {
            super.addErrorMessages("Kode Pos Kantor Pusat invalid: harus terdiri dari 5 angka (0-9).");
        }
        if (!dataPerkebunan.getKantorPusat().getAlamat().getTelepon().matches("\\d{12}")) {
            super.addErrorMessages("Nomor Telepon Kantor Pusat invalid: harus terdiri dari 12 angka (0-9).");
        }
        email = dataPerkebunan.getKantorPusat().getAlamat().getEmail();
        if (!(email.contains("@") && email.contains("."))) {
            super.addErrorMessages("Email Kantor Pusat invalid: harus memiliki karakter '@' dan '.'.");
        }
        if (!dataPerkebunan.getKantorPusat().getAlamat().getFax().matches("\\d{12}")) {
            super.addErrorMessages("Fax Kantor Pusat invalid: harus terdiri dari 12 angka (0-9).");
        }
        if (!dataPerkebunan.getKantorPusat().getAlamat().getProv().matches("\\d{2}")) {
            super.addErrorMessages("Kode Provinsi Kantor Pusat invalid: harus terdiri dari 2 angka (0-9).");
        }
        if (!dataPerkebunan.getKantorPusat().getAlamat().getKabKota().matches("\\d{2}")) {
            super.addErrorMessages("Kode Kabupaten/Kota Kantor Pusat invalid: harus terdiri dari 2 angka (0-9).");
        }
        
        // GROUP PERUSAHAAN
        if (dataPerkebunan.getGroupPerusahaan().getNama().length() > 25) {
            super.addErrorMessages("Nama Group Perusahaan invalid: lebih dari 25 karakter.");
        }
        if (dataPerkebunan.getGroupPerusahaan().getAlamat().getAlamatLengkap().length() > 50) {
            super.addErrorMessages("Alamat Group Perusahaan invalid: lebih dari 50 karakter.");
        }
        if (!dataPerkebunan.getGroupPerusahaan().getAlamat().getKodePos().matches("\\d{5}")) {
            super.addErrorMessages("Kode Pos Group Perusahaan invalid: harus terdiri dari 5 angka (0-9).");
        }
        if (!dataPerkebunan.getGroupPerusahaan().getAlamat().getTelepon().matches("\\d{12}")) {
            super.addErrorMessages("Nomor Telepon Group Perusahaan invalid: harus terdiri dari 12 angka (0-9).");
        }
        email = dataPerkebunan.getGroupPerusahaan().getAlamat().getEmail();
        if (!(email.contains("@") && email.contains("."))) {
            super.addErrorMessages("Email Group Perusahaan invalid: harus memiliki karakter '@' dan '.'.");
        }
        if (!dataPerkebunan.getGroupPerusahaan().getAlamat().getFax().matches("\\d{12}")) {
            super.addErrorMessages("Fax Group Perusahaan invalid: harus terdiri dari 12 angka (0-9).");
        }
        if (!dataPerkebunan.getGroupPerusahaan().getAlamat().getProv().matches("\\d{2}")) {
            super.addErrorMessages("Kode Provinsi Group Perusahaan invalid: harus terdiri dari 2 angka (0-9).");
        }
        if (!dataPerkebunan.getGroupPerusahaan().getAlamat().getKabKota().matches("\\d{2}")) {
            super.addErrorMessages("Kode Kabupaten/Kota Group Perusahaan invalid: harus terdiri dari 2 angka (0-9).");
        }

        // KETERANGAN PERUSAHAAN
        if (dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getStatusPemodalan() != '1' && dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getStatusPemodalan() != '2') {
            super.addErrorMessages("Status Pemodalan invalid: harus berupa karakter '1' atau '2'.");
        }
        if (!(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getBentukBadanHukum() >= '1' && dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getBentukBadanHukum() <= '9')) {
            super.addErrorMessages("Bentuk Badan Hukum invalid: harus karakter antara '1' dan '9'.");
        }
        if (dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getPelaksanaanKemitraan() != '1' && dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getPelaksanaanKemitraan() != '2') {
            super.addErrorMessages("Pelaksanaan Kemitraan invalid: harus berupa karakter '1' atau '2'.");
        }
        if (dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getKebunPlasmaKonversi() != '1' && dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getKebunPlasmaKonversi() != '2') {
            super.addErrorMessages("Kebun Plasma Konversi invalid: harus berupa karakter '1' atau '2'.");
        }
        if (dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getUnitPengolahanProduksi() != '1' && dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getUnitPengolahanProduksi() != '2') {
            super.addErrorMessages("Unit Pengolahan Produksi invalid: harus berupa karakter '1' atau '2'.");
        }
        if (dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getTahunBerdiri() <= 0) {
            super.addErrorMessages("Tahun berdiri invalid: harus lebih dari 0.");
        }
        if (dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getTahunBerdiri() >= 2024) {
            super.addErrorMessages("Tahun berdiri invalid: harus kurang dari 2024.");
        }
        if (dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getJenisPerusahaanTebu() != '1' && dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getJenisPerusahaanTebu() != '2' && dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getJenisPerusahaanTebu() != '3') {
            super.addErrorMessages("Unit Pengolahan Produksi invalid: harus berupa karakter '1', '2', atau '3'.");
        }
        
        // DATA KEBUN
        for(int i = 0; i < dataPerkebunan.getJumlahKebun();i++){
            // LUAS TANAMAN
            //Jenis Kebun
            if(!dataPerkebunan.getKebun(i).getJenisKebun().equalsIgnoreCase("sendiri") &&
            !dataPerkebunan.getKebun(i).getJenisKebun().equalsIgnoreCase("rakyat") &&
            !dataPerkebunan.getKebun(i).getJenisKebun().equalsIgnoreCase("pihak ketiga"))
            {
                super.addErrorMessages("Jenis Kebun Invalid: masukkan sendiri/rakyat/pihak ketiga");
            }
            //Provinsi
            if(!dataPerkebunan.getKebun(i).getLetak().getProv().matches("[0-9]+") || 
                (dataPerkebunan.getKebun(i).getLetak().getProv().length() > 2)){
                super.addErrorMessages("Kode Provinsi Kebun Invalid: harus terdiri dari 2 angka (0-9)");
            }
            //Kabupaten/Kota
            if(!dataPerkebunan.getKebun(i).getLetak().getKabKota().matches("[0-9]+") || 
                dataPerkebunan.getKebun(i).getLetak().getKabKota().length() > 2){
                super.addErrorMessages("Kode Kabupaten/Kota Kebun Invalid: harus terdiri dari 2 angka (0-9)");
            }

//            //Nama
//            if(dataPerkebunan.getKebun(i).getNama().length() > 25){
//                super.addErrorMessages("Nama Kebun Invalid: lebih dari 25 karakter");
//            }

            //Luas Areal Tanam
            if(dataPerkebunan.getKebun(i).getLuasArealTanam() < 0){
                super.addErrorMessages("Luas Areal Tanam Invalid: tidak boleh negatif");
            }
            //PRODUKSI
            //Nama Produk Utama
            if (dataPerkebunan.getProdukUtama().length() > 25) {
                super.addErrorMessages("Nama Produk Utama yang dihasilkan invalid: lebih dari 25 karakter.");
            }
            //Luas Areal Tebang
            if(dataPerkebunan.getKebun(i).getProduksi().getLuasArealTebang() < 0){
                super.addErrorMessages("Luas Areal Tebang Invalid: tidak boleh negatif");
            }
            //Produksi tebu
            if(dataPerkebunan.getKebun(i).getProduksi().getProduksiTebu() < 0){
                super.addErrorMessages("Produksi Tebu Invalid: tidak boleh negatif");
            }
            //Produksi GKP
            if(dataPerkebunan.getKebun(i).getProduksi().getProduksiGKP() < 0){
                super.addErrorMessages("Produksi GKP Invalid: tidak bolehh negatif");
            }
            //Produksi Tetes
            if(dataPerkebunan.getKebun(i).getProduksi().getProduksiTetes() < 0){
                super.addErrorMessages("Produksi Tetes Invalid: tidak boleh negatif");
            }
            //Produksi Hablur
            if(dataPerkebunan.getKebun(i).getProduksi().getProduksiHablur() < 0){
                super.addErrorMessages("Produksi Hablur Invalid: tidak boleh negatif");
            }
            //Pendemen Hablur
            if(dataPerkebunan.getKebun(i).getProduksi().getRendemenHablur() < 0){
                super.addErrorMessages("Pendemen Hablur Invalid: tidak boleh negatif");
            }
        }
        //Stok GKP
        if(dataPerkebunan.getStokGKP().getStokPabrikGula() < 0){
            super.addErrorMessages("Stok Pabrik Gula Invalid: tidak boleh negatif");
        }
        if(dataPerkebunan.getStokGKP().getStokPedagang() < 0){
            super.addErrorMessages("Stok Pedagang Invalid: tidak boleh negatif");
        }
        if(dataPerkebunan.getStokGKP().getStokPetani() < 0){
            super.addErrorMessages("Stok Petani Invalid: tidak boleh negatif");
        }
        return super.getErrorMessages().isEmpty();
    }

    @Override
    public boolean save(String namaFile) {
        try (FileWriter writer = new FileWriter(namaFile)){
            // Informasi Perusahaan
            writer.write("===== Informasi Perusahaan =====\n");
            writer.write("Nama: " + dataPerkebunan.getPerusahaan().getNama() + "\n");
            writer.write("Alamat: " + dataPerkebunan.getPerusahaan().getAlamat().getAlamatLengkap() + "\n");
            writer.write("Kode Pos: " + dataPerkebunan.getPerusahaan().getAlamat().getKodePos() + "\n");
            writer.write("Telepon: " + dataPerkebunan.getPerusahaan().getAlamat().getTelepon() + "\n");
            writer.write("Email: " + dataPerkebunan.getPerusahaan().getAlamat().getEmail() + "\n");
            writer.write("Fax: " + dataPerkebunan.getPerusahaan().getAlamat().getFax() + "\n");
            writer.write("Provinsi: " + dataPerkebunan.getPerusahaan().getAlamat().getProv() + "\n");
            writer.write("Kabupaten/Kota: " + dataPerkebunan.getPerusahaan().getAlamat().getKabKota() + "\n");
            writer.write("Kecamatan: " + dataPerkebunan.getPerusahaan().getKecamatan() + "\n");
            writer.write("Desa Kelurahan: " + dataPerkebunan.getPerusahaan().getDesaKel() + "\n");
            writer.write("Nama PIC: " + dataPerkebunan.getPerusahaan().getNamaPIC() + "\n");
            writer.write("Nomor Telepon PIC: " + dataPerkebunan.getPerusahaan().getTelpPIC() + "\n");
            writer.write("Jabatan PIC: " + dataPerkebunan.getPerusahaan().getJabatanPIC() + "\n");
            writer.write("Jenis Kelamin PIC: " + dataPerkebunan.getPerusahaan().getJK_PIC() + "\n");
            writer.write("Unit Kerja PIC: " + dataPerkebunan.getPerusahaan().getUnitKerjaPIC() + "\n");
            writer.write("Status Perusahaan: " + dataPerkebunan.getPerusahaan().getStatus() + "\n");
            writer.write("Koordinat Lintang: " + dataPerkebunan.getPerusahaan().getLintang() + "\n");
            writer.write("Koordinat Bujur: " + dataPerkebunan.getPerusahaan().getBujur() + "\n");
            writer.write("KBLI: " + dataPerkebunan.getPerusahaan().getKBLI() + "\n");

            // Informasi Kantor Pusat
            writer.write("\n===== Informasi Kantor Pusat =====\n");
            writer.write("Nama: " + dataPerkebunan.getKantorPusat().getNama() + "\n");
            writer.write("Alamat: " + dataPerkebunan.getKantorPusat().getAlamat().getAlamatLengkap() + "\n");
            writer.write("Kode Pos: " + dataPerkebunan.getKantorPusat().getAlamat().getKodePos() + "\n");
            writer.write("Telepon: " + dataPerkebunan.getKantorPusat().getAlamat().getTelepon() + "\n");
            writer.write("Email: " + dataPerkebunan.getKantorPusat().getAlamat().getEmail() + "\n");
            writer.write("Fax: " + dataPerkebunan.getKantorPusat().getAlamat().getFax() + "\n");
            writer.write("Provinsi: " + dataPerkebunan.getKantorPusat().getAlamat().getProv() + "\n");
            writer.write("Kabupaten/Kota: " + dataPerkebunan.getKantorPusat().getAlamat().getKabKota() + "\n");

            // Informasi Group Perusahaan
            writer.write("\n===== Informasi Group Perusahaan =====\n");
            writer.write("Nama: " + dataPerkebunan.getGroupPerusahaan().getNama() + "\n");
            writer.write("Alamat: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getAlamatLengkap() + "\n");
            writer.write("Kode Pos: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getKodePos() + "\n");
            writer.write("Telepon: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getTelepon() + "\n");
            writer.write("Email: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getEmail() + "\n");
            writer.write("Fax: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getFax() + "\n");
            writer.write("Provinsi: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getProv() + "\n");
            writer.write("Kabupaten/Kota: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getKabKota() + "\n");

            // Informasi Keterangan Perusahaan
            writer.write("\n===== Keterangan Perusahaan =====\n");
            writer.write("Status Pemodalan: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getStatusPemodalan() + "\n");
            writer.write("Bentuk Badan Hukum: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getBentukBadanHukum() + "\n");
            writer.write("Pelaksanaan Kemitraan: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getPelaksanaanKemitraan() + "\n");
            writer.write("Kebun Plasma Konversi: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getKebunPlasmaKonversi() + "\n");
            writer.write("Unit Pengolahan Produksi: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getUnitPengolahanProduksi() + "\n");
            writer.write("Tahun Berdiri: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getTahunBerdiri() + "\n");
            writer.write("Jenis Perusahaan Tebu: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getJenisPerusahaanTebu() + "\n");

            // Informasi Kebun
            writer.write("\n===== Informasi Kebun =====\n");
            for (int i = 0; i < dataPerkebunan.getJumlahKebun(); i++) {
                writer.write("Kebun ke-" + (i+1) + "\n");
                writer.write("Kabupaten/Kota: " + dataPerkebunan.getKebun(i).getLetak().getKabKota() + "\n");
                writer.write("Provinsi: " + dataPerkebunan.getKebun(i).getLetak().getProv() + "\n");
                writer.write("Luas Areal Tebang: " + dataPerkebunan.getKebun(i).getProduksi().getLuasArealTebang() + "\n");
                writer.write("Pendemen Hablur: " + dataPerkebunan.getKebun(i).getProduksi().getRendemenHablur() + "\n");
                writer.write("Produksi GKP: " + dataPerkebunan.getKebun(i).getProduksi().getProduksiGKP() + "\n");
                writer.write("Produksi Hablur: " + dataPerkebunan.getKebun(i).getProduksi().getProduksiHablur() + "\n");
                writer.write("Produksi Tebu: " + dataPerkebunan.getKebun(i).getProduksi().getProduksiTebu() + "\n");
                writer.write("Produksi Tetes: " + dataPerkebunan.getKebun(i).getProduksi().getProduksiTetes() + "\n");
                writer.write("Jenis Kebun: " + dataPerkebunan.getKebun(i).getJenisKebun() + "\n");
            }

            // Informasi Stok GKP
            writer.write("\n===== Informasi Stok GKP =====\n");
            writer.write("Stok Pabrik Gula: " + dataPerkebunan.getStokGKP().getStokPabrikGula() + "\n");
            writer.write("Stok Pedagang: " + dataPerkebunan.getStokGKP().getStokPedagang() + "\n");
            writer.write("Stok Petani: " + dataPerkebunan.getStokGKP().getStokPetani() + "\n");
            
            // Informasi Keterangan Petugas
            writer.write("\n===== Informasi Keterangan Petugas =====\n");
            writer.write("Nama Pencacah: " + dataPerkebunan.getKeteranganPetugas().getNamaPencacah() + "\n");
            writer.write("Tanggal Mencacah: " + dataPerkebunan.getKeteranganPetugas().getTanggalMencacah() + "\n");
            writer.write("Nama Pemeriksa: " + dataPerkebunan.getKeteranganPetugas().getNamaPemeriksa() + "\n");
            writer.write("Tanggal Memeriksa: " + dataPerkebunan.getKeteranganPetugas().getTanggalMemeriksa() + "\n");
            
            writer.close();
            System.out.println("Data berhasil disimpan ke dalam file 'data_perkebunan.txt'.\n");
            return true;
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan data: " + e.getMessage()+ "\n");
            return false;
        }
    }

    @Override
    public void reset() {
        // Perusahaan
        dataPerkebunan.getPerusahaan().setNama("");
        dataPerkebunan.getPerusahaan().getAlamat().setAlamatLengkap("");
        dataPerkebunan.getPerusahaan().getAlamat().setKodePos("");
        dataPerkebunan.getPerusahaan().getAlamat().setTelepon("");
        dataPerkebunan.getPerusahaan().getAlamat().setEmail("");
        dataPerkebunan.getPerusahaan().getAlamat().setFax("");
        dataPerkebunan.getPerusahaan().getAlamat().setProv("");
        dataPerkebunan.getPerusahaan().getAlamat().setKabKota("");
        dataPerkebunan.getPerusahaan().setKecamatan("");
        dataPerkebunan.getPerusahaan().setDesaKel("");
        dataPerkebunan.getPerusahaan().setNamaPIC("");
        dataPerkebunan.getPerusahaan().setTelpPIC("");
        dataPerkebunan.getPerusahaan().setJabatanPIC("");
        dataPerkebunan.getPerusahaan().setJK_PIC('\0');
        dataPerkebunan.getPerusahaan().setUnitKerjaPIC("");
        dataPerkebunan.getPerusahaan().setStatus("");
        dataPerkebunan.getPerusahaan().setLintang(0.00);
        dataPerkebunan.getPerusahaan().setBujur(0.00);
        dataPerkebunan.getPerusahaan().setKBLI("");
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setStatusPemodalan('\0');
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum('\0');
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setPelaksanaanKemitraan('\0');
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setKebunPlasmaKonversi('\0');
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setUnitPengolahanProduksi('\0');
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setTahunBerdiri(-1);
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setJenisPerusahaanTebu('\0');

        // Kantor Pusat
        dataPerkebunan.getKantorPusat().setNama("");
        dataPerkebunan.getKantorPusat().getAlamat().setAlamatLengkap("");
        dataPerkebunan.getKantorPusat().getAlamat().setKodePos("");
        dataPerkebunan.getKantorPusat().getAlamat().setTelepon("");
        dataPerkebunan.getKantorPusat().getAlamat().setEmail("");
        dataPerkebunan.getKantorPusat().getAlamat().setFax("");
        dataPerkebunan.getKantorPusat().getAlamat().setProv("");
        dataPerkebunan.getKantorPusat().getAlamat().setKabKota("");

        // Group Perusahaan
        dataPerkebunan.getGroupPerusahaan().setNama("");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setAlamatLengkap("");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setKodePos("");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setTelepon("");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setEmail("");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setFax("");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setProv("");
        dataPerkebunan.getGroupPerusahaan().getAlamat().setKabKota("");

        // Kebun
        dataPerkebunan.resetKebun();

        // Stok GKP
        dataPerkebunan.getStokGKP().setStokPabrikGula(0.0);
        dataPerkebunan.getStokGKP().setStokPedagang(0.0);
        dataPerkebunan.getStokGKP().setStokPetani(0.0);
        System.out.println("Data Perkebunan Berhasil direset!\n");
    }


    @Override
    public void print() {
        // Informasi Perusahaan
        System.out.println("===== Informasi Perusahaan =====");
        System.out.println("Nama: " + dataPerkebunan.getPerusahaan().getNama());
        System.out.println("Alamat: " + dataPerkebunan.getPerusahaan().getAlamat().getAlamatLengkap());
        System.out.println("Kode Pos: " + dataPerkebunan.getPerusahaan().getAlamat().getKodePos());
        System.out.println("Telepon: " + dataPerkebunan.getPerusahaan().getAlamat().getTelepon());
        System.out.println("Email: " + dataPerkebunan.getPerusahaan().getAlamat().getEmail());
        System.out.println("Fax: " + dataPerkebunan.getPerusahaan().getAlamat().getFax());
        System.out.println("Provinsi: " + dataPerkebunan.getPerusahaan().getAlamat().getProv());
        System.out.println("Kabupaten/Kota: " + dataPerkebunan.getPerusahaan().getAlamat().getKabKota());
        System.out.println("Kecamatan: " + dataPerkebunan.getPerusahaan().getKecamatan());
        System.out.println("Desa Kelurahan: " + dataPerkebunan.getPerusahaan().getDesaKel());
        System.out.println("Nama PIC: " + dataPerkebunan.getPerusahaan().getNamaPIC());
        System.out.println("Nomor Telepon PIC: " + dataPerkebunan.getPerusahaan().getTelpPIC());
        System.out.println("Jabatan PIC: " + dataPerkebunan.getPerusahaan().getJabatanPIC());
        System.out.println("Jenis Kelamin PIC: " + dataPerkebunan.getPerusahaan().getJK_PIC());
        System.out.println("Unit Kerja PIC: " + dataPerkebunan.getPerusahaan().getUnitKerjaPIC());
        System.out.println("Status Perusahaan: " + dataPerkebunan.getPerusahaan().getStatus());
        System.out.println("Koordinat Lintang: " + dataPerkebunan.getPerusahaan().getLintang());
        System.out.println("Koordinat Bujur: " + dataPerkebunan.getPerusahaan().getBujur());
        System.out.println("KBLI: " + dataPerkebunan.getPerusahaan().getKBLI());

        // Informasi Kantor Pusat
        System.out.println("\n===== Informasi Kantor Pusat =====");
        System.out.println("Nama: " + dataPerkebunan.getKantorPusat().getNama());
        System.out.println("Alamat: " + dataPerkebunan.getKantorPusat().getAlamat().getAlamatLengkap());
        System.out.println("Kode Pos: " + dataPerkebunan.getKantorPusat().getAlamat().getKodePos());
        System.out.println("Telepon: " + dataPerkebunan.getKantorPusat().getAlamat().getTelepon());
        System.out.println("Email: " + dataPerkebunan.getKantorPusat().getAlamat().getEmail());
        System.out.println("Fax: " + dataPerkebunan.getKantorPusat().getAlamat().getFax());
        System.out.println("Provinsi: " + dataPerkebunan.getKantorPusat().getAlamat().getProv());
        System.out.println("Kabupaten/Kota: " + dataPerkebunan.getKantorPusat().getAlamat().getKabKota());

        // Informasi Group Perusahaan
        System.out.println("\n===== Informasi Group Perusahaan =====");
        System.out.println("Nama: " + dataPerkebunan.getGroupPerusahaan().getNama());
        System.out.println("Alamat: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getAlamatLengkap());
        System.out.println("Kode Pos: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getKodePos());
        System.out.println("Telepon: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getTelepon());
        System.out.println("Email: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getEmail());
        System.out.println("Fax: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getFax());
        System.out.println("Provinsi: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getProv());
        System.out.println("Kabupaten/Kota: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getKabKota());

        // Informasi Keterangan Perusahaan
        System.out.println("\n===== Keterangan Perusahaan =====");
        System.out.println("Status Pemodalan: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getStatusPemodalan());
        System.out.println("Bentuk Badan Hukum: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getBentukBadanHukum());
        System.out.println("Pelaksanaan Kemitraan: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getPelaksanaanKemitraan());
        System.out.println("Kebun Plasma Konversi: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getKebunPlasmaKonversi());
        System.out.println("Unit Pengolahan Produksi: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getUnitPengolahanProduksi());
        System.out.println("Tahun Berdiri: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getTahunBerdiri());
        System.out.println("Jenis Perusahaan Tebu: " + dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getJenisPerusahaanTebu());

        // Informasi Kebun
        System.out.println("\n===== Informasi Kebun =====");
        for (int i = 0; i < dataPerkebunan.getJumlahKebun(); i++) {
            System.out.println("Kebun ke-" + (i+1));
            System.out.println("Kabupaten/Kota: " + dataPerkebunan.getKebun(i).getLetak().getKabKota());
            System.out.println("Provinsi: " + dataPerkebunan.getKebun(i).getLetak().getProv());
            System.out.println("Luas Areal Tebang: " + dataPerkebunan.getKebun(i).getProduksi().getLuasArealTebang());
            System.out.println("Pendemen Hablur: " + dataPerkebunan.getKebun(i).getProduksi().getRendemenHablur());
            System.out.println("Produksi GKP: " + dataPerkebunan.getKebun(i).getProduksi().getProduksiGKP());
            System.out.println("Produksi Hablur: " + dataPerkebunan.getKebun(i).getProduksi().getProduksiHablur());
            System.out.println("Produksi Tebu: " + dataPerkebunan.getKebun(i).getProduksi().getProduksiTebu());
            System.out.println("Produksi Tetes: " + dataPerkebunan.getKebun(i).getProduksi().getProduksiTetes());
            System.out.println("Jenis Kebun: " + dataPerkebunan.getKebun(i).getJenisKebun());
        }

        // Informasi Stok GKP
        System.out.println("\n===== Informasi Stok GKP =====");
        System.out.println("Stok Pabrik Gula: " + dataPerkebunan.getStokGKP().getStokPabrikGula());
        System.out.println("Stok Pedagang: " + dataPerkebunan.getStokGKP().getStokPedagang());
        System.out.println("Stok Petani: " + dataPerkebunan.getStokGKP().getStokPetani());
    }

}
