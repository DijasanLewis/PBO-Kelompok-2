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
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
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

        // Validasi detail Perusahaan
        Perusahaan perusahaan = dataPerkebunan.getPerusahaan();
        if (perusahaan.getNama().length() > 50) {
            super.addErrorMessages("Nama Perusahaan tidak boleh lebih dari 50 karakter.");
        }
        if (perusahaan.getAlamat().getAlamatLengkap().length() > 250) {
            super.addErrorMessages("Alamat Perusahaan tidak boleh lebih dari 250 karakter.");
        }
        if (!perusahaan.getAlamat().getKodePos().matches("\\d{5}")) {
            super.addErrorMessages("Kode Pos Perusahaan harus terdiri dari 5 angka.");
        }
        if (!perusahaan.getAlamat().getTelepon().matches("\\d{10,12}")) {
            super.addErrorMessages("Telepon Perusahaan harus terdiri dari 10 hingga 12 angka.");
        }
        if (!(perusahaan.getAlamat().getEmail().contains("@") && perusahaan.getAlamat().getEmail().contains("."))) {
            super.addErrorMessages("Email Perusahaan harus valid dengan karakter '@' dan '.'.");
        }
        if (!perusahaan.getAlamat().getFax().matches("\\d{10,12}")) {
            super.addErrorMessages("Fax Perusahaan harus terdiri dari 10 hingga 12 angka.");
        }
        if (!perusahaan.getAlamat().getProv().matches("\\d{2}")) {
            super.addErrorMessages("Kode Provinsi Perusahaan harus terdiri dari 2 angka.");
        }
        if (!perusahaan.getAlamat().getKabKota().matches("\\d{2}")) {
            super.addErrorMessages("Kode Kabupaten/Kota Perusahaan harus terdiri dari 2 angka.");
        }
        if (!perusahaan.getKecamatan().matches("\\d{3}")) {
            super.addErrorMessages("Kode Kecamatan harus terdiri dari 3 angka.");
        }
        if (!perusahaan.getDesaKel().matches("\\d{3}")) {
            super.addErrorMessages("Kode Desa/Kelurahan harus terdiri dari 3 angka.");
        }
        if (perusahaan.getNamaPIC().length() > 50) {
            super.addErrorMessages("Nama PIC tidak boleh lebih dari 50 karakter.");
        }
        if (!perusahaan.getTelpPIC().matches("\\d{10,12}")) {
            super.addErrorMessages("Telepon PIC harus terdiri dari 10 hingga 12 angka.");
        }
        if (perusahaan.getJabatanPIC().length() > 50) {
            super.addErrorMessages("Jabatan PIC tidak boleh lebih dari 50 karakter.");
        }
        if (perusahaan.getJK_PIC() != '1' && perusahaan.getJK_PIC() != '2') {
            super.addErrorMessages("Jenis Kelamin PIC harus '1' atau '2'.");
        }
        if (perusahaan.getUnitKerjaPIC().length() > 50) {
            super.addErrorMessages("Unit Kerja PIC tidak boleh lebih dari 50 karakter.");
        }
        if (!("Aktif".equals(perusahaan.getStatus()) || "Tutup".equals(perusahaan.getStatus()) || "Tutup Sementara".equals(perusahaan.getStatus()))) {
            super.addErrorMessages("Status Perusahaan harus 'Aktif', 'Tutup', atau 'Tutup Sementara'.");
        }
        if (perusahaan.getLintang() < -90 || perusahaan.getLintang() > 90) {
            super.addErrorMessages("Lintang harus dalam rentang -90 hingga 90.");
        }
        if (perusahaan.getBujur() < -180 || perusahaan.getBujur() > 180) {
            super.addErrorMessages("Bujur harus dalam rentang -180 hingga 180.");
        }
        if (!perusahaan.getKBLI().matches("\\d{5}")) {
            super.addErrorMessages("KBLI harus terdiri dari 5 angka.");
        }

        // Validasi detail Kantor Pusat
        KantorPusat kantorPusat = dataPerkebunan.getKantorPusat();
        if (kantorPusat != null){
                if (kantorPusat.getNama().length() > 50) {
                super.addErrorMessages("Nama Kantor Pusat tidak boleh lebih dari 50 karakter.");
            }
            if (kantorPusat.getAlamat().getAlamatLengkap().length() > 250) {
                super.addErrorMessages("Alamat Kantor Pusat tidak boleh lebih dari 250 karakter.");
            }
            if (!kantorPusat.getAlamat().getKodePos().matches("\\d{5}")) {
                super.addErrorMessages("Kode Pos Kantor Pusat harus terdiri dari 5 angka.");
            }
            if (!kantorPusat.getAlamat().getTelepon().matches("\\d{10,12}")) {
                super.addErrorMessages("Telepon Kantor Pusat harus terdiri dari 10 hingga 12 angka.");
            }
            String emailKantorPusat = kantorPusat.getAlamat().getEmail();
            if (!(emailKantorPusat.contains("@") && emailKantorPusat.contains("."))) {
                super.addErrorMessages("Email Kantor Pusat harus memiliki karakter '@' dan '.'.");
            }
            if (!kantorPusat.getAlamat().getFax().matches("\\d{10,12}")) {
                super.addErrorMessages("Fax Kantor Pusat harus terdiri dari 10 hingga 12 angka.");
            }
            if (!kantorPusat.getAlamat().getProv().matches("\\d{2}")) {
                super.addErrorMessages("Kode Provinsi Kantor Pusat harus terdiri dari 2 angka.");
            }
            if (!kantorPusat.getAlamat().getKabKota().matches("\\d{2}")) {
                super.addErrorMessages("Kode Kabupaten/Kota Kantor Pusat harus terdiri dari 2 angka.");
            }
        }
        
        // Validasi detail Group Perusahaan
        GroupPerusahaan groupPerusahaan = dataPerkebunan.getGroupPerusahaan();
        if (groupPerusahaan != null){
            if (groupPerusahaan.getNama().length() > 50) {
                super.addErrorMessages("Nama Group Perusahaan tidak boleh lebih dari 50 karakter.");
            }
            if (groupPerusahaan.getAlamat().getAlamatLengkap().length() > 250) {
                super.addErrorMessages("Alamat Group Perusahaan tidak boleh lebih dari 250 karakter.");
            }
            if (!groupPerusahaan.getAlamat().getKodePos().matches("\\d{5}")) {
                super.addErrorMessages("Kode Pos Group Perusahaan harus terdiri dari 5 angka.");
            }
            if (!groupPerusahaan.getAlamat().getTelepon().matches("\\d{10,12}")) {
                super.addErrorMessages("Telepon Group Perusahaan harus terdiri dari 10 hingga 12 angka.");
            }
            String emailGroupPerusahaan = groupPerusahaan.getAlamat().getEmail();
            if (!(emailGroupPerusahaan.contains("@") && emailGroupPerusahaan.contains("."))) {
                super.addErrorMessages("Email Group Perusahaan harus memiliki karakter '@' dan '.'.");
            }
            if (!groupPerusahaan.getAlamat().getFax().matches("\\d{10,12}")) {
                super.addErrorMessages("Fax Group Perusahaan harus terdiri dari 10 hingga 12 angka.");
            }
            if (!groupPerusahaan.getAlamat().getProv().matches("\\d{2}")) {
                super.addErrorMessages("Kode Provinsi Group Perusahaan harus terdiri dari 2 angka.");
            }
            if (!groupPerusahaan.getAlamat().getKabKota().matches("\\d{2}")) {
                super.addErrorMessages("Kode Kabupaten/Kota Group Perusahaan harus terdiri dari 2 angka.");
            }
        }

        // KETERANGAN PERUSAHAAN
        KeteranganPerusahaan keterangan = dataPerkebunan.getPerusahaan().getKeteranganPerusahaan();

        if (keterangan.getStatusPemodalan() != '1' && keterangan.getStatusPemodalan() != '2') {
            super.addErrorMessages("Status Pemodalan invalid: harus berupa karakter '1' atau '2'.");
        }

        if (keterangan.getBentukBadanHukum() < '1' || keterangan.getBentukBadanHukum() > '9') {
            super.addErrorMessages("Bentuk Badan Hukum invalid: harus karakter antara '1' dan '9'.");
        }

        if (keterangan.getPelaksanaanKemitraan() != '1' && keterangan.getPelaksanaanKemitraan() != '2') {
            super.addErrorMessages("Pelaksanaan Kemitraan invalid: harus berupa karakter '1' atau '2'.");
        }

        if (keterangan.getKebunPlasmaKonversi() != '1' && keterangan.getKebunPlasmaKonversi() != '2') {
            super.addErrorMessages("Kebun Plasma Konversi invalid: harus berupa karakter '1' atau '2'.");
        }

        if (keterangan.getUnitPengolahanProduksi() != '1' && keterangan.getUnitPengolahanProduksi() != '2') {
            super.addErrorMessages("Unit Pengolahan Produksi invalid: harus berupa karakter '1' atau '2'.");
        }

        if (keterangan.getTahunBerdiri() <= 0 || keterangan.getTahunBerdiri() >= 2024) {
            super.addErrorMessages("Tahun berdiri invalid: harus lebih dari 0 dan kurang dari 2024.");
        }

        if (keterangan.getJenisPerusahaanTebu() != '1' && keterangan.getJenisPerusahaanTebu() != '2' && keterangan.getJenisPerusahaanTebu() != '3') {
            super.addErrorMessages("Jenis Perusahaan Tebu invalid: harus berupa karakter '1', '2', atau '3'.");
        }
        
        // Validasi detail Kebun
        if (dataPerkebunan.getProdukUtama().length() > 50) {
            super.addErrorMessages("Nama Produk Utama tidak boleh lebih dari 50 karakter.");
        }
        if (!dataPerkebunan.getKBKI().matches("\\d{10}")) {
            super.addErrorMessages("KBKI harus terdiri dari 10 angka.");
        }
        for (int i = 0; i < dataPerkebunan.getJumlahKebun(); i++) {
            Kebun kebun = dataPerkebunan.getKebun(i);
            if (!kebun.getJenisKebun().matches("Tebu Sendiri|Tebu Rakyat|Pembelian dari Pihak Ketiga")) {
                super.addErrorMessages("Jenis Kebun " + (i + 1) + " harus 'Tebu Sendiri', 'Tebu Rakyat', atau 'Pembelian dari Pihak Ketiga'.");
            }
            if (kebun.getLuasArealTanam() < 0) {
                super.addErrorMessages("Luas Areal Tanam Kebun " + (i + 1) + " tidak boleh negatif.");
            }
            if (kebun.getProduksi().getLuasArealTebang() < 0) {
                super.addErrorMessages("Luas Areal Tebang Kebun " + (i + 1) + " tidak boleh negatif.");
            }
            if (kebun.getProduksi().getProduksiTebu() < 0) {
                super.addErrorMessages("Produksi Tebu Kebun " + (i + 1) + " tidak boleh negatif.");
            }
            if (kebun.getProduksi().getProduksiGKP() < 0) {
                super.addErrorMessages("Produksi GKP Kebun " + (i + 1) + " tidak boleh negatif.");
            }
            if (kebun.getProduksi().getProduksiTetes() < 0) {
                super.addErrorMessages("Produksi Tetes Kebun " + (i + 1) + " tidak boleh negatif.");
            }
            if (kebun.getProduksi().getProduksiHablur() < 0) {
                super.addErrorMessages("Produksi Hablur Kebun " + (i + 1) + " tidak boleh negatif.");
            }
            if (kebun.getProduksi().getRendemenHablur() < 0) {
                super.addErrorMessages("Rendemen Hablur Kebun " + (i + 1) + " tidak boleh negatif.");
            }
        }

        // Validasi Stok GKP
        if (dataPerkebunan.getStokGKP().getStokPabrikGula() < 0) {
            super.addErrorMessages("Stok Pabrik Gula tidak boleh negatif.");
        }
        if (dataPerkebunan.getStokGKP().getStokPedagang() < 0) {
            super.addErrorMessages("Stok Pedagang tidak boleh negatif.");
        }
        if (dataPerkebunan.getStokGKP().getStokPetani() < 0) {
            super.addErrorMessages("Stok Petani tidak boleh negatif.");
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

            // Informasi Kantor Pusat jika ada
            if (dataPerkebunan.getKantorPusat() != null){
                writer.write("\n===== Informasi Kantor Pusat =====\n");
                writer.write("Nama: " + dataPerkebunan.getKantorPusat().getNama() + "\n");
                writer.write("Alamat: " + dataPerkebunan.getKantorPusat().getAlamat().getAlamatLengkap() + "\n");
                writer.write("Kode Pos: " + dataPerkebunan.getKantorPusat().getAlamat().getKodePos() + "\n");
                writer.write("Telepon: " + dataPerkebunan.getKantorPusat().getAlamat().getTelepon() + "\n");
                writer.write("Email: " + dataPerkebunan.getKantorPusat().getAlamat().getEmail() + "\n");
                writer.write("Fax: " + dataPerkebunan.getKantorPusat().getAlamat().getFax() + "\n");
                writer.write("Provinsi: " + dataPerkebunan.getKantorPusat().getAlamat().getProv() + "\n");
                writer.write("Kabupaten/Kota: " + dataPerkebunan.getKantorPusat().getAlamat().getKabKota() + "\n");
            }

            // Informasi Group Perusahaan jika ada
            if (dataPerkebunan.getGroupPerusahaan() != null){
                writer.write("\n===== Informasi Group Perusahaan =====\n");
                writer.write("Nama: " + dataPerkebunan.getGroupPerusahaan().getNama() + "\n");
                writer.write("Alamat: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getAlamatLengkap() + "\n");
                writer.write("Kode Pos: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getKodePos() + "\n");
                writer.write("Telepon: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getTelepon() + "\n");
                writer.write("Email: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getEmail() + "\n");
                writer.write("Fax: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getFax() + "\n");
                writer.write("Provinsi: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getProv() + "\n");
                writer.write("Kabupaten/Kota: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getKabKota() + "\n");
            }

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
            writer.write("Nama Produk Utama: " + dataPerkebunan.getProdukUtama() + "\n");
            writer.write("Kode KBKI: " + dataPerkebunan.getKBKI() + "\n");
            for (int i = 0; i < dataPerkebunan.getJumlahKebun(); i++) {
                writer.write("Kebun ke-" + (i+1) + "\n");
                writer.write("Kabupaten/Kota: " + dataPerkebunan.getKebun(i).getLetak().getKabKota() + "\n");
                writer.write("Provinsi: " + dataPerkebunan.getKebun(i).getLetak().getProv() + "\n");
                writer.write("Luas Areal Tebang: " + dataPerkebunan.getKebun(i).getProduksi().getLuasArealTebang() + "\n");
                writer.write("Rendemen Hablur: " + dataPerkebunan.getKebun(i).getProduksi().getRendemenHablur() + "\n");
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
        if (dataPerkebunan.getKantorPusat() != null) {
            dataPerkebunan.getKantorPusat().setNama("");
            dataPerkebunan.getKantorPusat().getAlamat().setAlamatLengkap("");
            dataPerkebunan.getKantorPusat().getAlamat().setKodePos("");
            dataPerkebunan.getKantorPusat().getAlamat().setTelepon("");
            dataPerkebunan.getKantorPusat().getAlamat().setEmail("");
            dataPerkebunan.getKantorPusat().getAlamat().setFax("");
            dataPerkebunan.getKantorPusat().getAlamat().setProv("");
            dataPerkebunan.getKantorPusat().getAlamat().setKabKota("");
        }

        // Group Perusahaan
        if (dataPerkebunan.getGroupPerusahaan() != null) {
            dataPerkebunan.getGroupPerusahaan().setNama("");
            dataPerkebunan.getGroupPerusahaan().getAlamat().setAlamatLengkap("");
            dataPerkebunan.getGroupPerusahaan().getAlamat().setKodePos("");
            dataPerkebunan.getGroupPerusahaan().getAlamat().setTelepon("");
            dataPerkebunan.getGroupPerusahaan().getAlamat().setEmail("");
            dataPerkebunan.getGroupPerusahaan().getAlamat().setFax("");
            dataPerkebunan.getGroupPerusahaan().getAlamat().setProv("");
            dataPerkebunan.getGroupPerusahaan().getAlamat().setKabKota("");
        }

        // Kebun
        dataPerkebunan.setProdukUtama("");
        dataPerkebunan.setKBKI("");
        dataPerkebunan.resetKebun();

        // Stok GKP
        dataPerkebunan.getStokGKP().setStokPabrikGula(0.0);
        dataPerkebunan.getStokGKP().setStokPedagang(0.0);
        dataPerkebunan.getStokGKP().setStokPetani(0.0);
        System.out.println("Data Perkebunan Berhasil direset!\n");
        
        // Keterangan Petugas
        dataPerkebunan.getKeteranganPetugas().setNamaPencacah("");
        dataPerkebunan.getKeteranganPetugas().setTanggalMencacah(null);
        dataPerkebunan.getKeteranganPetugas().setNamaPemeriksa("");
        dataPerkebunan.getKeteranganPetugas().setTanggalMemeriksa(null);
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
        KantorPusat kantorPusat = dataPerkebunan.getKantorPusat();
        if (kantorPusat != null) {
            System.out.println("\n===== Informasi Kantor Pusat ====="); 
            System.out.println("Nama: " + dataPerkebunan.getKantorPusat().getNama());
            System.out.println("Alamat: " + dataPerkebunan.getKantorPusat().getAlamat().getAlamatLengkap());
            System.out.println("Kode Pos: " + dataPerkebunan.getKantorPusat().getAlamat().getKodePos());
            System.out.println("Telepon: " + dataPerkebunan.getKantorPusat().getAlamat().getTelepon());
            System.out.println("Email: " + dataPerkebunan.getKantorPusat().getAlamat().getEmail());
            System.out.println("Fax: " + dataPerkebunan.getKantorPusat().getAlamat().getFax());
            System.out.println("Provinsi: " + dataPerkebunan.getKantorPusat().getAlamat().getProv());
            System.out.println("Kabupaten/Kota: " + dataPerkebunan.getKantorPusat().getAlamat().getKabKota());
        }

        // Informasi Group Perusahaan
        GroupPerusahaan groupPerusahaan = dataPerkebunan.getGroupPerusahaan();
        if (groupPerusahaan != null) {
            System.out.println("\n===== Informasi Group Perusahaan =====");
            System.out.println("Nama: " + dataPerkebunan.getGroupPerusahaan().getNama());
            System.out.println("Alamat: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getAlamatLengkap());
            System.out.println("Kode Pos: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getKodePos());
            System.out.println("Telepon: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getTelepon());
            System.out.println("Email: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getEmail());
            System.out.println("Fax: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getFax());
            System.out.println("Provinsi: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getProv());
            System.out.println("Kabupaten/Kota: " + dataPerkebunan.getGroupPerusahaan().getAlamat().getKabKota());
        }

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
        System.out.println("Nama Produk Utama: " + dataPerkebunan.getProdukUtama());
        System.out.println("Kode KBKI: " + dataPerkebunan.getKBKI());
        for (int i = 0; i < dataPerkebunan.getJumlahKebun(); i++) {
            System.out.println("\nKebun ke-" + (i+1));
            System.out.println("Kabupaten/Kota: " + dataPerkebunan.getKebun(i).getLetak().getKabKota());
            System.out.println("Provinsi: " + dataPerkebunan.getKebun(i).getLetak().getProv());
            System.out.println("Luas Areal Tebang: " + dataPerkebunan.getKebun(i).getProduksi().getLuasArealTebang());
            System.out.println("Rendemen Hablur: " + dataPerkebunan.getKebun(i).getProduksi().getRendemenHablur());
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
        
        // Informasi Keterangan Petugas
        System.out.println("\n===== Informasi Keterangan Petugas =====");
        System.out.println("Nama Pencacah: " + dataPerkebunan.getKeteranganPetugas().getNamaPencacah());
        System.out.println("Tanggal Mencacah: " + dataPerkebunan.getKeteranganPetugas().getTanggalMencacah());
        System.out.println("Nama Pemeriksa: " + dataPerkebunan.getKeteranganPetugas().getNamaPemeriksa());
        System.out.println("Tanggal Memeriksa: " + dataPerkebunan.getKeteranganPetugas().getTanggalMemeriksa());
    }

}