/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mform.entity.DataPerkebunan;
import mform.entity.Kebun;

/**
 *
 * @author yedij
 */

public class DataInserter {

    public boolean insertData(DataPerkebunan dataPerkebunan) {
        Connection connection = null;
        PreparedStatement psPerusahaan = null;
        PreparedStatement psKantorPusat = null;
        PreparedStatement psGrupPerusahaan = null;
        PreparedStatement psKebun = null;
        PreparedStatement psKeteranganPetugas = null;

        try {
            connection = DatabaseConnection.getConnection();
            connection.setAutoCommit(false);

            // Insert data kantor pusat
            String sqlKantorPusat = "INSERT INTO kantor_pusat (nama, alamat, kode_pos, telepon, email, fax, provinsi_id, kab_kota_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            psKantorPusat = connection.prepareStatement(sqlKantorPusat, PreparedStatement.RETURN_GENERATED_KEYS);
            psKantorPusat.setString(1, dataPerkebunan.getKantorPusat().getNama());
            psKantorPusat.setString(2, dataPerkebunan.getKantorPusat().getAlamat().getAlamatLengkap());
            psKantorPusat.setString(3, dataPerkebunan.getKantorPusat().getAlamat().getKodePos());
            psKantorPusat.setString(4, dataPerkebunan.getKantorPusat().getAlamat().getTelepon());
            psKantorPusat.setString(5, dataPerkebunan.getKantorPusat().getAlamat().getEmail());
            psKantorPusat.setString(6, dataPerkebunan.getKantorPusat().getAlamat().getFax());
            psKantorPusat.setString(7, dataPerkebunan.getKantorPusat().getAlamat().getProv());
            psKantorPusat.setString(8, dataPerkebunan.getKantorPusat().getAlamat().getKabKota());
            psKantorPusat.executeUpdate();

            // Get generated ID for kantor_pusat
            int kantorPusatId = getGeneratedId(psKantorPusat);

            // Insert data grup perusahaan
            String sqlGrupPerusahaan = "INSERT INTO grup_perusahaan (nama, alamat, kode_pos, telepon, email, fax, provinsi_id, kab_kota_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            psGrupPerusahaan = connection.prepareStatement(sqlGrupPerusahaan, PreparedStatement.RETURN_GENERATED_KEYS);
            psGrupPerusahaan.setString(1, dataPerkebunan.getGroupPerusahaan().getNama());
            psGrupPerusahaan.setString(2, dataPerkebunan.getGroupPerusahaan().getAlamat().getAlamatLengkap());
            psGrupPerusahaan.setString(3, dataPerkebunan.getGroupPerusahaan().getAlamat().getKodePos());
            psGrupPerusahaan.setString(4, dataPerkebunan.getGroupPerusahaan().getAlamat().getTelepon());
            psGrupPerusahaan.setString(5, dataPerkebunan.getGroupPerusahaan().getAlamat().getEmail());
            psGrupPerusahaan.setString(6, dataPerkebunan.getGroupPerusahaan().getAlamat().getFax());
            psGrupPerusahaan.setString(7, dataPerkebunan.getGroupPerusahaan().getAlamat().getProv());
            psGrupPerusahaan.setString(8, dataPerkebunan.getGroupPerusahaan().getAlamat().getKabKota());
            psGrupPerusahaan.executeUpdate();

            // Get generated ID for grup_perusahaan
            int grupPerusahaanId = getGeneratedId(psGrupPerusahaan);

            // Insert data perusahaan
            String sqlPerusahaan = "INSERT INTO perusahaan (nama, alamat, kode_pos, telepon, email, fax, provinsi_id, kab_kota_id, kecamatan_id, desa_kelurahan_id, " +
                "nama_pic, telepon_pic, jabatan_pic, jenis_kelamin_pic, unit_kerja_pic, status, latitude, longitude, kbli, kantor_pusat_id, grup_perusahaan_id, " +
                "status_pemodalan, bentuk_badan_hukum, pelaksana_kemitraan, kebun_plasma_konversi, punya_unit_pengolahan_produksi, tahun_berdiri, jenis_perusahaan_tebu, " +
                "produk_utama, kode_kbki, stok_pabrik_gula, stok_pedagang, stok_petani) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            psPerusahaan = connection.prepareStatement(sqlPerusahaan, PreparedStatement.RETURN_GENERATED_KEYS);
            psPerusahaan.setString(1, dataPerkebunan.getPerusahaan().getNama());
            psPerusahaan.setString(2, dataPerkebunan.getPerusahaan().getAlamat().getAlamatLengkap());
            psPerusahaan.setString(3, dataPerkebunan.getPerusahaan().getAlamat().getKodePos());
            psPerusahaan.setString(4, dataPerkebunan.getPerusahaan().getAlamat().getTelepon());
            psPerusahaan.setString(5, dataPerkebunan.getPerusahaan().getAlamat().getEmail());
            psPerusahaan.setString(6, dataPerkebunan.getPerusahaan().getAlamat().getFax());
            psPerusahaan.setString(7, dataPerkebunan.getPerusahaan().getAlamat().getProv());
            psPerusahaan.setString(8, dataPerkebunan.getPerusahaan().getAlamat().getKabKota());
            psPerusahaan.setString(9, dataPerkebunan.getPerusahaan().getKecamatan());
            psPerusahaan.setString(10, dataPerkebunan.getPerusahaan().getDesaKel());
            psPerusahaan.setString(11, dataPerkebunan.getPerusahaan().getNamaPIC());
            psPerusahaan.setString(12, dataPerkebunan.getPerusahaan().getTelpPIC());
            psPerusahaan.setString(13, dataPerkebunan.getPerusahaan().getJabatanPIC());
            psPerusahaan.setString(14, String.valueOf(dataPerkebunan.getPerusahaan().getJK_PIC())); // Convert char to String
            psPerusahaan.setString(15, dataPerkebunan.getPerusahaan().getUnitKerjaPIC());
            psPerusahaan.setString(16, dataPerkebunan.getPerusahaan().getStatus());
            psPerusahaan.setDouble(17, dataPerkebunan.getPerusahaan().getLintang());
            psPerusahaan.setDouble(18, dataPerkebunan.getPerusahaan().getBujur());
            psPerusahaan.setString(19, dataPerkebunan.getPerusahaan().getKBLI());
            psPerusahaan.setInt(20, kantorPusatId);
            psPerusahaan.setInt(21, grupPerusahaanId);
            psPerusahaan.setString(22, String.valueOf(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getStatusPemodalan()));
            psPerusahaan.setString(23, String.valueOf(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getBentukBadanHukum()));
            psPerusahaan.setString(24, String.valueOf(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getPelaksanaanKemitraan()));
            psPerusahaan.setString(25, String.valueOf(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getKebunPlasmaKonversi()));
            psPerusahaan.setString(26, String.valueOf(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getUnitPengolahanProduksi()));
            psPerusahaan.setInt(27, dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getTahunBerdiri());
            psPerusahaan.setString(28, String.valueOf(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getJenisPerusahaanTebu()));
            psPerusahaan.setString(29, dataPerkebunan.getProdukUtama());
            psPerusahaan.setString(30, dataPerkebunan.getKBKI());
            psPerusahaan.setDouble(31, dataPerkebunan.getStokGKP().getStokPabrikGula());
            psPerusahaan.setDouble(32, dataPerkebunan.getStokGKP().getStokPedagang());
            psPerusahaan.setDouble(33, dataPerkebunan.getStokGKP().getStokPetani());
            psPerusahaan.executeUpdate();


            // Get generated ID for perusahaan
            int perusahaanId = getGeneratedId(psPerusahaan);

            // Insert data kebun
            String sqlKebun = "INSERT INTO kebun (perusahaan_id, nama_kebun, provinsi_id, kab_kota_id, luas_areal_tanam, luas_areal_tebang, produksi_tebu, produksi_gkp, produksi_tetes, produksi_hablur, rendemen_hablur) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            psKebun = connection.prepareStatement(sqlKebun);
            for (int i = 0; i < dataPerkebunan.getJumlahKebun(); i++) {
                Kebun kebun = dataPerkebunan.getKebun(i);
                psKebun.setInt(1, perusahaanId);
                psKebun.setString(2, kebun.getJenisKebun());
                psKebun.setString(3, kebun.getLetak().getProv());
                psKebun.setString(4, kebun.getLetak().getKabKota());
                psKebun.setDouble(5, kebun.getLuasArealTanam());
                psKebun.setDouble(6, kebun.getProduksi().getLuasArealTebang());
                psKebun.setDouble(7, kebun.getProduksi().getProduksiTebu());
                psKebun.setDouble(8, kebun.getProduksi().getProduksiGKP());
                psKebun.setDouble(9, kebun.getProduksi().getProduksiTetes());
                psKebun.setDouble(10, kebun.getProduksi().getProduksiHablur());
                psKebun.setDouble(11, kebun.getProduksi().getRendemenHablur());
                psKebun.addBatch();
            }
            psKebun.executeBatch();

            // Insert data keterangan petugas
            String sqlKeteranganPetugas = "INSERT INTO keterangan_petugas (perusahaan_id, nama_pencacah, tanggal_mencacah, nama_pemeriksa, tanggal_memeriksa) VALUES (?, ?, ?, ?, ?)";
            psKeteranganPetugas = connection.prepareStatement(sqlKeteranganPetugas);
            psKeteranganPetugas.setInt(1, perusahaanId);
            psKeteranganPetugas.setString(2, dataPerkebunan.getKeteranganPetugas().getNamaPencacah());
            psKeteranganPetugas.setDate(3, java.sql.Date.valueOf(dataPerkebunan.getKeteranganPetugas().getTanggalMencacah()));
            psKeteranganPetugas.setString(4, dataPerkebunan.getKeteranganPetugas().getNamaPemeriksa());
            psKeteranganPetugas.setDate(5, java.sql.Date.valueOf(dataPerkebunan.getKeteranganPetugas().getTanggalMemeriksa()));
            psKeteranganPetugas.executeUpdate();

            connection.commit();
            System.out.println("Data berhasil disimpan ke dalam database.");
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println("Terjadi kesalahan saat menyimpan data: " + e.getMessage());
            return false;
        } finally {
            closeResources(connection, psPerusahaan, psKantorPusat, psGrupPerusahaan, psKebun, psKeteranganPetugas);
        }
    }

    private int getGeneratedId(PreparedStatement ps) throws SQLException {
        try (ResultSet rs = ps.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getInt(1);
            } else {
                throw new SQLException("Gagal mendapatkan ID yang dihasilkan.");
            }
        }
    }

    private void closeResources(Connection connection, PreparedStatement... psArray) {
        for (PreparedStatement ps : psArray) {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}