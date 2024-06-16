/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mform.entity.*;

/**
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
 */

/**
 * Class for retrieving data about a specific company and creating a DataPerkebunan object.
 */
public class DataRetriever {

    /**
     * Retrieve data for a given company name and create a DataPerkebunan object.
     */
    public DataPerkebunan retrieveData(String namaPerusahaan) {
        DataPerkebunan dataPerkebunan = new DataPerkebunan();

        String sql = "SELECT p.id AS perusahaan_id, p.*, kp.*, gp.* FROM perusahaan p " +
                     "LEFT JOIN kantor_pusat kp ON p.kantor_pusat_id = kp.id " +
                     "LEFT JOIN grup_perusahaan gp ON p.grup_perusahaan_id = gp.id " +
                     "WHERE p.nama = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, namaPerusahaan);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Set Kantor Pusat
                KantorPusat kantorPusat = new KantorPusat();
                kantorPusat.setNama(rs.getString("kp.nama"));
                kantorPusat.getAlamat().setAlamatLengkap(rs.getString("kp.alamat"));
                kantorPusat.getAlamat().setKodePos(rs.getString("kp.kode_pos"));
                kantorPusat.getAlamat().setTelepon(rs.getString("kp.telepon"));
                kantorPusat.getAlamat().setEmail(rs.getString("kp.email"));
                kantorPusat.getAlamat().setFax(rs.getString("kp.fax"));
                kantorPusat.getAlamat().setProv(rs.getString("kp.provinsi_kode"));
                kantorPusat.getAlamat().setKabKota(rs.getString("kp.kab_kota_kode"));
                dataPerkebunan.setKantorPusat(kantorPusat);

                // Set Group Perusahaan
                GroupPerusahaan groupPerusahaan = new GroupPerusahaan();
                groupPerusahaan.setNama(rs.getString("gp.nama"));
                groupPerusahaan.getAlamat().setAlamatLengkap(rs.getString("gp.alamat"));
                groupPerusahaan.getAlamat().setKodePos(rs.getString("gp.kode_pos"));
                groupPerusahaan.getAlamat().setTelepon(rs.getString("gp.telepon"));
                groupPerusahaan.getAlamat().setEmail(rs.getString("gp.email"));
                groupPerusahaan.getAlamat().setFax(rs.getString("gp.fax"));
                groupPerusahaan.getAlamat().setProv(rs.getString("gp.provinsi_kode"));
                groupPerusahaan.getAlamat().setKabKota(rs.getString("gp.kab_kota_kode"));
                dataPerkebunan.setGroupPerusahaan(groupPerusahaan);

                // Set Perusahaan
                Perusahaan perusahaan = new Perusahaan();
                perusahaan.setNama(rs.getString("p.nama"));
                perusahaan.getAlamat().setAlamatLengkap(rs.getString("p.alamat"));
                perusahaan.getAlamat().setKodePos(rs.getString("p.kode_pos"));
                perusahaan.getAlamat().setTelepon(rs.getString("p.telepon"));
                perusahaan.getAlamat().setEmail(rs.getString("p.email"));
                perusahaan.getAlamat().setFax(rs.getString("p.fax"));
                perusahaan.getAlamat().setProv(rs.getString("p.provinsi_kode"));
                perusahaan.getAlamat().setKabKota(rs.getString("p.kab_kota_kode"));
                perusahaan.setKecamatan(rs.getString("p.kecamatan_kode"));
                perusahaan.setDesaKel(rs.getString("p.desa_kelurahan_kode"));
                perusahaan.setNamaPIC(rs.getString("p.nama_pic"));
                perusahaan.setTelpPIC(rs.getString("p.telepon_pic"));
                perusahaan.setJabatanPIC(rs.getString("p.jabatan_pic"));
                perusahaan.setJK_PIC(rs.getString("p.jenis_kelamin_pic").charAt(0));
                perusahaan.setUnitKerjaPIC(rs.getString("p.unit_kerja_pic"));
                perusahaan.setStatus(rs.getString("p.status"));
                perusahaan.setLintang(rs.getDouble("p.latitude"));
                perusahaan.setBujur(rs.getDouble("p.longitude"));
                perusahaan.setKBLI(rs.getString("p.kbli"));
                perusahaan.getKeteranganPerusahaan().setStatusPemodalan(rs.getString("p.status_pemodalan").charAt(0));
                perusahaan.getKeteranganPerusahaan().setBentukBadanHukum(rs.getString("p.bentuk_badan_hukum").charAt(0));
                perusahaan.getKeteranganPerusahaan().setPelaksanaanKemitraan(rs.getString("p.pelaksana_kemitraan").charAt(0));
                perusahaan.getKeteranganPerusahaan().setKebunPlasmaKonversi(rs.getString("p.kebun_plasma_konversi").charAt(0));
                perusahaan.getKeteranganPerusahaan().setUnitPengolahanProduksi(rs.getString("p.punya_unit_pengolahan_produksi").charAt(0));
                perusahaan.getKeteranganPerusahaan().setTahunBerdiri(rs.getInt("p.tahun_berdiri"));
                perusahaan.getKeteranganPerusahaan().setJenisPerusahaanTebu(rs.getString("p.jenis_perusahaan_tebu").charAt(0));
                dataPerkebunan.setPerusahaan(perusahaan);

                //Set Stok GKP
                dataPerkebunan.getStokGKP().setStokPabrikGula(Double.parseDouble(rs.getString("p.stok_pabrik_gula")));
                dataPerkebunan.getStokGKP().setStokPedagang(Double.parseDouble(rs.getString("p.stok_pedagang")));
                dataPerkebunan.getStokGKP().setStokPetani(Double.parseDouble(rs.getString("p.stok_petani")));
                
                // Set kebun dan keterangan petugas
                dataPerkebunan.setProdukUtama(rs.getString("p.produk_utama"));
                dataPerkebunan.setKBKI(rs.getString("p.kode_kbki"));
                int perusahaanId = rs.getInt("perusahaan_id");
                addKebunToDataPerkebunan(dataPerkebunan, conn, perusahaanId);
                addKeteranganPetugasToDataPerkebunan(dataPerkebunan, conn, perusahaanId);   
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving data: " + e.getMessage());
        }

        return dataPerkebunan;
    }

    private void addKebunToDataPerkebunan(DataPerkebunan dataPerkebunan, Connection conn, int perusahaanId) throws SQLException {
        String sql = "SELECT * FROM kebun WHERE perusahaan_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, perusahaanId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Kebun kebun = new Kebun();
                kebun.setJenisKebun(rs.getString("nama_kebun"));
                kebun.getLetak().setProv(rs.getString("provinsi_kode"));
                kebun.getLetak().setKabKota(rs.getString("kab_kota_kode"));
                kebun.setLuasArealTanam(rs.getDouble("luas_areal_tanam"));
                kebun.getProduksi().setLuasArealTebang(rs.getDouble("luas_areal_tebang"));
                kebun.getProduksi().setProduksiTebu(rs.getDouble("produksi_tebu"));
                kebun.getProduksi().setProduksiGKP(rs.getDouble("produksi_gkp"));
                kebun.getProduksi().setProduksiTetes(rs.getDouble("produksi_tetes"));
                kebun.getProduksi().setProduksiHablur(rs.getDouble("produksi_hablur"));
                kebun.getProduksi().setRendemenHablur(rs.getDouble("rendemen_hablur"));
                dataPerkebunan.setKebun(kebun);
            }
        }
    }

    private void addKeteranganPetugasToDataPerkebunan(DataPerkebunan dataPerkebunan, Connection conn, int perusahaanId) throws SQLException {
        String sql = "SELECT * FROM keterangan_petugas WHERE perusahaan_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, perusahaanId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                KeteranganPetugas keteranganPetugas = new KeteranganPetugas();
                keteranganPetugas.setPencacah(rs.getString("nama_pencacah"), rs.getDate("tanggal_mencacah").toLocalDate());
                keteranganPetugas.setPemeriksa(rs.getString("nama_pemeriksa"), rs.getDate("tanggal_memeriksa").toLocalDate());
                dataPerkebunan.setKeteranganPetugas(keteranganPetugas);
            }
        }
    }

    public ArrayList<DataPerkebunan> retrieveAllData(){
        ArrayList<DataPerkebunan> listDP = new ArrayList<DataPerkebunan>();

        String sql = "SELECT p.id AS perusahaan_id, p.*, kp.*, gp.* FROM perusahaan p " +
                     "LEFT JOIN kantor_pusat kp ON p.kantor_pusat_id = kp.id " +
                     "LEFT JOIN grup_perusahaan gp ON p.grup_perusahaan_id = gp.id ";

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                DataPerkebunan dataPerkebunan = new DataPerkebunan();
                // Set Kantor Pusat
                KantorPusat kantorPusat = new KantorPusat();
                kantorPusat.setNama(rs.getString("kp.nama"));
                kantorPusat.getAlamat().setAlamatLengkap(rs.getString("kp.alamat"));
                kantorPusat.getAlamat().setKodePos(rs.getString("kp.kode_pos"));
                kantorPusat.getAlamat().setTelepon(rs.getString("kp.telepon"));
                kantorPusat.getAlamat().setEmail(rs.getString("kp.email"));
                kantorPusat.getAlamat().setFax(rs.getString("kp.fax"));
                kantorPusat.getAlamat().setProv(rs.getString("kp.provinsi_kode"));
                kantorPusat.getAlamat().setKabKota(rs.getString("kp.kab_kota_kode"));
                dataPerkebunan.setKantorPusat(kantorPusat);

                // Set Group Perusahaan
                GroupPerusahaan groupPerusahaan = new GroupPerusahaan();
                groupPerusahaan.setNama(rs.getString("gp.nama"));
                groupPerusahaan.getAlamat().setAlamatLengkap(rs.getString("gp.alamat"));
                groupPerusahaan.getAlamat().setKodePos(rs.getString("gp.kode_pos"));
                groupPerusahaan.getAlamat().setTelepon(rs.getString("gp.telepon"));
                groupPerusahaan.getAlamat().setEmail(rs.getString("gp.email"));
                groupPerusahaan.getAlamat().setFax(rs.getString("gp.fax"));
                groupPerusahaan.getAlamat().setProv(rs.getString("gp.provinsi_kode"));
                groupPerusahaan.getAlamat().setKabKota(rs.getString("gp.kab_kota_kode"));
                dataPerkebunan.setGroupPerusahaan(groupPerusahaan);

                // Set Perusahaan
                Perusahaan perusahaan = new Perusahaan();
                perusahaan.setNama(rs.getString("p.nama"));
                perusahaan.getAlamat().setAlamatLengkap(rs.getString("p.alamat"));
                perusahaan.getAlamat().setKodePos(rs.getString("p.kode_pos"));
                perusahaan.getAlamat().setTelepon(rs.getString("p.telepon"));
                perusahaan.getAlamat().setEmail(rs.getString("p.email"));
                perusahaan.getAlamat().setFax(rs.getString("p.fax"));
                perusahaan.getAlamat().setProv(rs.getString("p.provinsi_kode"));
                perusahaan.getAlamat().setKabKota(rs.getString("p.kab_kota_kode"));
                perusahaan.setKecamatan(rs.getString("p.kecamatan_kode"));
                perusahaan.setDesaKel(rs.getString("p.desa_kelurahan_kode"));
                perusahaan.setNamaPIC(rs.getString("p.nama_pic"));
                perusahaan.setTelpPIC(rs.getString("p.telepon_pic"));
                perusahaan.setJabatanPIC(rs.getString("p.jabatan_pic"));
                perusahaan.setJK_PIC(rs.getString("p.jenis_kelamin_pic").charAt(0));
                perusahaan.setUnitKerjaPIC(rs.getString("p.unit_kerja_pic"));
                perusahaan.setStatus(rs.getString("p.status"));
                perusahaan.setLintang(rs.getDouble("p.latitude"));
                perusahaan.setBujur(rs.getDouble("p.longitude"));
                perusahaan.setKBLI(rs.getString("p.kbli"));
                perusahaan.getKeteranganPerusahaan().setStatusPemodalan(rs.getString("p.status_pemodalan").charAt(0));
                perusahaan.getKeteranganPerusahaan().setBentukBadanHukum(rs.getString("p.bentuk_badan_hukum").charAt(0));
                perusahaan.getKeteranganPerusahaan().setPelaksanaanKemitraan(rs.getString("p.pelaksana_kemitraan").charAt(0));
                perusahaan.getKeteranganPerusahaan().setKebunPlasmaKonversi(rs.getString("p.kebun_plasma_konversi").charAt(0));
                perusahaan.getKeteranganPerusahaan().setUnitPengolahanProduksi(rs.getString("p.punya_unit_pengolahan_produksi").charAt(0));
                perusahaan.getKeteranganPerusahaan().setTahunBerdiri(rs.getInt("p.tahun_berdiri"));
                perusahaan.getKeteranganPerusahaan().setJenisPerusahaanTebu(rs.getString("p.jenis_perusahaan_tebu").charAt(0));
                dataPerkebunan.setPerusahaan(perusahaan);

                //Set Stok GKP
                dataPerkebunan.getStokGKP().setStokPabrikGula(Double.parseDouble(rs.getString("p.stok_pabrik_gula")));
                dataPerkebunan.getStokGKP().setStokPedagang(Double.parseDouble(rs.getString("p.stok_pedagang")));
                dataPerkebunan.getStokGKP().setStokPetani(Double.parseDouble(rs.getString("p.stok_petani")));
                
                // Set kebun dan keterangan petugas
                dataPerkebunan.setProdukUtama(rs.getString("p.produk_utama"));
                dataPerkebunan.setKBKI(rs.getString("p.kode_kbki"));
                int perusahaanId = rs.getInt("perusahaan_id");
                addKebunToDataPerkebunan(dataPerkebunan, conn, perusahaanId);
                addKeteranganPetugasToDataPerkebunan(dataPerkebunan, conn, perusahaanId);
                
                //Masukkan data perkebunan ke dalam array list
                listDP.add(dataPerkebunan);
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving data: " + e.getMessage());
        }

        return listDP;
    }
}

