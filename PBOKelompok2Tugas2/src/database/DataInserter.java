/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author yedij
 */

public class DataInserter {

    public void insertKantorPusat(String nama, String alamat, String kodePos, String telepon, String email, String fax, String provinsiKode, String kabKotaKode) {
        String sql = "INSERT INTO kantor_pusat (nama, alamat, kode_pos, telepon, email, fax, provinsi_kode, kab_kota_kode) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nama);
            pstmt.setString(2, alamat);
            pstmt.setString(3, kodePos);
            pstmt.setString(4, telepon);
            pstmt.setString(5, email);
            pstmt.setString(6, fax);
            pstmt.setString(7, provinsiKode);
            pstmt.setString(8, kabKotaKode);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertGrupPerusahaan(String nama, String alamat, String kodePos, String telepon, String email, String fax, String provinsiKode, String kabKotaKode) {
        String sql = "INSERT INTO grup_perusahaan (nama, alamat, kode_pos, telepon, email, fax, provinsi_kode, kab_kota_kode) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nama);
            pstmt.setString(2, alamat);
            pstmt.setString(3, kodePos);
            pstmt.setString(4, telepon);
            pstmt.setString(5, email);
            pstmt.setString(6, fax);
            pstmt.setString(7, provinsiKode);
            pstmt.setString(8, kabKotaKode);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertPerusahaan(String nama, String alamat, String kodePos, String telepon, String email, String fax, String provinsiKode, String kabKotaKode, String kecamatanKode, String desaKelurahanKode, String namaPic, String teleponPic, String jabatanPic, String jenisKelaminPic, String unitKerjaPic, String status, double latitude, double longitude, String kbli, int kantorPusatId, int grupPerusahaanId, String statusPemodalan, String bentukBadanHukum, String pelaksanaKemitraan, String kebunPlasmaKonversi, String punyaUnitPengolahanProduksi, int tahunBerdiri, String jenisPerusahaanTebu, double stokPabrikGula, double stokPedagang, double stokPetani) {
        String sql = "INSERT INTO perusahaan (nama, alamat, kode_pos, telepon, email, fax, provinsi_kode, kab_kota_kode, kecamatan_kode, desa_kelurahan_kode, nama_pic, telepon_pic, jabatan_pic, jenis_kelamin_pic, unit_kerja_pic, status, latitude, longitude, kbli, kantor_pusat_id, grup_perusahaan_id, status_pemodalan, bentuk_badan_hukum, pelaksana_kemitraan, kebun_plasma_konversi, punya_unit_pengolahan_produksi, tahun_berdiri, jenis_perusahaan_tebu, stok_pabrik_gula, stok_pedagang, stok_petani) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nama);
            pstmt.setString(2, alamat);
            pstmt.setString(3, kodePos);
            pstmt.setString(4, telepon);
            pstmt.setString(5, email);
            pstmt.setString(6, fax);
            pstmt.setString(7, provinsiKode);
            pstmt.setString(8, kabKotaKode);
            pstmt.setString(9, kecamatanKode);
            pstmt.setString(10, desaKelurahanKode);
            pstmt.setString(11, namaPic);
            pstmt.setString(12, teleponPic);
            pstmt.setString(13, jabatanPic);
            pstmt.setString(14, jenisKelaminPic);
            pstmt.setString(15, unitKerjaPic);
            pstmt.setString(16, status);
            pstmt.setDouble(17, latitude);
            pstmt.setDouble(18, longitude);
            pstmt.setString(19, kbli);
            pstmt.setInt(20, kantorPusatId);
            pstmt.setInt(21, grupPerusahaanId);
            pstmt.setString(22, statusPemodalan);
            pstmt.setString(23, bentukBadanHukum);
            pstmt.setString(24, pelaksanaKemitraan);
            pstmt.setString(25, kebunPlasmaKonversi);
            pstmt.setString(26, punyaUnitPengolahanProduksi);
            pstmt.setInt(27, tahunBerdiri);
            pstmt.setString(28, jenisPerusahaanTebu);
            pstmt.setDouble(29, stokPabrikGula);
            pstmt.setDouble(30, stokPedagang);
            pstmt.setDouble(31, stokPetani);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Method for inserting data into 'kebun'
    public void insertKebun(int perusahaanId, String namaKebun, String provinsiKode, String kabKotaKode, double luasArealTanam, String produkUtama, double luasArealTebang, String kodeKbki, double produksiTebu, double produksiGkp, double produksiTetes, double produksiHablur, double rendemenHablur) {
        String sql = "INSERT INTO kebun (perusahaan_id, nama_kebun, provinsi_kode, kab_kota_kode, luas_areal_tanam, produk_utama, luas_areal_tebang, kode_kbki, produksi_tebu, produksi_gkp, produksi_tetes, produksi_hablur, rendemen_hablur) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, perusahaanId);
            pstmt.setString(2, namaKebun);
            pstmt.setString(3, provinsiKode);
            pstmt.setString(4, kabKotaKode);
            pstmt.setDouble(5, luasArealTanam);
            pstmt.setString(6, produkUtama);
            pstmt.setDouble(7, luasArealTebang);
            pstmt.setString(8, kodeKbki);
            pstmt.setDouble(9, produksiTebu);
            pstmt.setDouble(10, produksiGkp);
            pstmt.setDouble(11, produksiTetes);
            pstmt.setDouble(12, produksiHablur);
            pstmt.setDouble(13, rendemenHablur);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method for inserting data into 'keterangan_petugas'
    public void insertKeteranganPetugas(int perusahaanId, String namaPencacah, java.sql.Date tanggalMencacah, String namaPemeriksa, java.sql.Date tanggalMemeriksa) {
        String sql = "INSERT INTO keterangan_petugas (perusahaan_id, nama_pencacah, tanggal_mencacah, nama_pemeriksa, tanggal_memeriksa) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, perusahaanId);
            pstmt.setString(2, namaPencacah);
            pstmt.setDate(3, tanggalMencacah);
            pstmt.setString(4, namaPemeriksa);
            pstmt.setDate(5, tanggalMemeriksa);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

