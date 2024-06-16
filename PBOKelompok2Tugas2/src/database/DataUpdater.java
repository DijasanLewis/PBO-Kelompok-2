/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mform.entity.DataPerkebunan;
import mform.entity.Kebun;

/**
 *
 * @author fatih
 */
public class DataUpdater {
    private Connection connection = null;

    public boolean updateData(DataPerkebunan dataPerkebunan, int idPerusahaan, int idGP, int idKP){
        try {
            connection = DatabaseConnection.getConnection();
 
            //UPDATE data Kantor Pusat jika ada
            if(dataPerkebunan.getKantorPusat() != null){
                String sqlKantorPusat = "UPDATE kantor_pusat " +
                                        "SET nama = ?, alamat = ?, kode_pos = ?, telepon = ?, email = ?, fax = ?, provinsi_kode = ?, kab_kota_kode = ? " +
                                        "WHERE id = ?";
                PreparedStatement psKantorPusat = connection.prepareStatement(sqlKantorPusat);
                psKantorPusat.setString(1, dataPerkebunan.getKantorPusat().getNama());
                psKantorPusat.setString(2, dataPerkebunan.getKantorPusat().getAlamat().getAlamatLengkap());
                psKantorPusat.setString(3, dataPerkebunan.getKantorPusat().getAlamat().getKodePos());
                psKantorPusat.setString(4, dataPerkebunan.getKantorPusat().getAlamat().getTelepon());
                psKantorPusat.setString(5, dataPerkebunan.getKantorPusat().getAlamat().getEmail());
                psKantorPusat.setString(6, dataPerkebunan.getKantorPusat().getAlamat().getFax());
                psKantorPusat.setString(7, dataPerkebunan.getKantorPusat().getAlamat().getProv());
                psKantorPusat.setString(8, dataPerkebunan.getKantorPusat().getAlamat().getKabKota());
                psKantorPusat.setInt(9, idKP);
                int rowAffected = psKantorPusat.executeUpdate();
                //System.out.println("Perubahan Kantor Pusat = " + rowAffected);
            }

            //UPDATE data Group Perusahaan juka ada
            if(dataPerkebunan.getGroupPerusahaan() != null){
                String sqlGroupPerusahaan = "UPDATE grup_perusahaan " +
                                            "SET nama = ?, alamat = ?, kode_pos = ?, telepon = ?, email = ?, fax = ?, provinsi_kode = ?, kab_kota_kode = ? "+
                                            "WHERE id = ?";
                PreparedStatement psGroupPerusahaan = connection.prepareStatement(sqlGroupPerusahaan);
                psGroupPerusahaan.setString(1, dataPerkebunan.getGroupPerusahaan().getNama());
                psGroupPerusahaan.setString(2, dataPerkebunan.getGroupPerusahaan().getAlamat().getAlamatLengkap());
                psGroupPerusahaan.setString(3, dataPerkebunan.getGroupPerusahaan().getAlamat().getKodePos());
                psGroupPerusahaan.setString(4, dataPerkebunan.getGroupPerusahaan().getAlamat().getTelepon());
                psGroupPerusahaan.setString(5, dataPerkebunan.getGroupPerusahaan().getAlamat().getEmail());
                psGroupPerusahaan.setString(6, dataPerkebunan.getGroupPerusahaan().getAlamat().getFax());
                psGroupPerusahaan.setString(7, dataPerkebunan.getGroupPerusahaan().getAlamat().getProv());
                psGroupPerusahaan.setString(8, dataPerkebunan.getGroupPerusahaan().getAlamat().getKabKota());
                psGroupPerusahaan.setInt(9, idGP);
                int rowAffected = psGroupPerusahaan.executeUpdate();
                //System.out.println("Perubahan Group Perusahaan " + rowAffected);
            }

            //UPDATE data Perusahaan
            String sqlPerusahaanUpdate = "UPDATE perusahaan SET nama = ?, alamat = ?, kode_pos = ?, telepon = ?, email = ?, fax = ?, provinsi_kode = ?, " +
                                        "kab_kota_kode = ?, kecamatan_kode = ?, desa_kelurahan_kode = ?, nama_pic = ?, telepon_pic = ?, jabatan_pic = ?, jenis_kelamin_pic = ?, unit_kerja_pic = ?, " +
                                        "status = ?, latitude = ?, longitude = ?, kbli = ?, kantor_pusat_id = ?, grup_perusahaan_id = ?, status_pemodalan = ?, bentuk_badan_hukum = ?, pelaksana_kemitraan = ?, " +
                                        "kebun_plasma_konversi = ?, punya_unit_pengolahan_produksi = ?, tahun_berdiri = ?, jenis_perusahaan_tebu = ?, produk_utama = ?, kode_kbki = ?, stok_pabrik_gula = ?, " +
                                        "stok_pedagang = ?, stok_petani = ? WHERE id = ?";
            PreparedStatement psPerusahaan;
            psPerusahaan = connection.prepareStatement(sqlPerusahaanUpdate);
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
            if (idKP > 0) {
                psPerusahaan.setInt(20, idKP);
            } else {
                psPerusahaan.setNull(20, java.sql.Types.INTEGER);
            }
            if (idGP > 0) {
                psPerusahaan.setInt(21, idGP);
            } else {
                psPerusahaan.setNull(21, java.sql.Types.INTEGER);
            }
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
            psPerusahaan.setInt(34, idPerusahaan);
            psPerusahaan.executeUpdate();

            //UPDATE Kebun
            int[] idKebun = getIdKebun(idPerusahaan);
            String sqlKebunUpdate = "UPDATE kebun SET nama_kebun = ?, provinsi_kode = ?, kab_kota_kode = ?, luas_areal_tanam = ?, luas_areal_tebang = ?, " +
                                    "produksi_tebu = ?, produksi_gkp = ?, produksi_tetes = ?, produksi_hablur = ?, rendemen_hablur = ? " +
                                    "WHERE perusahaan_id = ? AND id = ?";
            PreparedStatement psKebun;
            psKebun = connection.prepareStatement(sqlKebunUpdate);
            for (int i = 0; i < dataPerkebunan.getJumlahKebun(); i++) {
                Kebun kebun = dataPerkebunan.getKebun(i);
                psKebun.setString(1, kebun.getJenisKebun());
                psKebun.setString(2, kebun.getLetak().getProv());
                psKebun.setString(3, kebun.getLetak().getKabKota());
                psKebun.setDouble(4, kebun.getLuasArealTanam());
                psKebun.setDouble(5, kebun.getProduksi().getLuasArealTebang());
                psKebun.setDouble(6, kebun.getProduksi().getProduksiTebu());
                psKebun.setDouble(7, kebun.getProduksi().getProduksiGKP());
                psKebun.setDouble(8, kebun.getProduksi().getProduksiTetes());
                psKebun.setDouble(9, kebun.getProduksi().getProduksiHablur());
                psKebun.setDouble(10, kebun.getProduksi().getRendemenHablur());
                psKebun.setInt(11, idPerusahaan);
                psKebun.setInt(12, idKebun[i]);
                psKebun.addBatch();
            }
            psKebun.executeBatch();

            //UPDATE Keterangan petugas
            int idKeteranganPetugas = getIdKeteranganPetugas(idPerusahaan);
            String sqlKeteranganPetugasUpdate = "UPDATE keterangan_petugas " + 
                                                "SET nama_pencacah = ?, tanggal_mencacah = ?, nama_pemeriksa = ?, tanggal_memeriksa = ? " +
                                                "WHERE id = ?";
            PreparedStatement psKeteranganPetugas;
            psKeteranganPetugas = connection.prepareStatement(sqlKeteranganPetugasUpdate);
            psKeteranganPetugas.setString(1, dataPerkebunan.getKeteranganPetugas().getNamaPencacah());
            psKeteranganPetugas.setDate(2, java.sql.Date.valueOf(dataPerkebunan.getKeteranganPetugas().getTanggalMencacah()));
            psKeteranganPetugas.setString(3, dataPerkebunan.getKeteranganPetugas().getNamaPemeriksa());
            psKeteranganPetugas.setDate(4, java.sql.Date.valueOf(dataPerkebunan.getKeteranganPetugas().getTanggalMemeriksa()));
            psKeteranganPetugas.setInt(5, idKeteranganPetugas);
            psKeteranganPetugas.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return false;
    }
    
    public int getIdPerusahaan(String nama){
        connection = DatabaseConnection.getConnection();
        int idPerusahaan = -1;

        //Cari id perusahaan
        String sql = "SELECT id FROM perusahaan WHERE nama = ?";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, nama);
    
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()) {
                idPerusahaan = rs.getInt("id");
            }
            else{
                System.out.println("Not found");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return idPerusahaan;
    }

    public int getIdGroupPerusahaan(String nama){
        connection = DatabaseConnection.getConnection();
        int idGPerusahaan = -1;

        //Cari id grup perusahaan
        String sql = "SELECT id FROM grup_perusahaan WHERE nama = ?";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, nama);
    
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()) {
                idGPerusahaan = rs.getInt("id");
            }
            else{
                System.out.println("Not found");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return idGPerusahaan;
    }

    public int getIdKantorPusat(String nama){
        connection = DatabaseConnection.getConnection();
        int idKPusat = -1;

        //Cari id kantor pusat
        String sql = "SELECT id FROM kantor_pusat WHERE nama = ?";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, nama);
    
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()) {
                idKPusat = rs.getInt("id");
            }
            else{
                System.out.println("Not found");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return idKPusat;
    }

    public int[] getIdKebun(int idPerusahaan){
        connection = DatabaseConnection.getConnection();
        int dataCount = 0;
        int[] idKebun = new int[0];

        //Cari id kantor pusat
        String sql = "SELECT id FROM kebun WHERE perusahaan_id = ?";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, idPerusahaan);
    
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()) {
                dataCount++;
            }
            //System.out.println(dataCount);
            idKebun = new int[dataCount];

            rs = pstmt.executeQuery();
            int i = 0;
            while (rs.next()) {
                idKebun[i] = rs.getInt("id");
                i++;
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


        return idKebun;
    }

    public int getIdKeteranganPetugas(int idPerusahaan){
        connection = DatabaseConnection.getConnection();
        int idKeteranganPetugas = -1;

        String sql = "SELECT id FROM keterangan_petugas WHERE perusahaan_id = ?";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, idPerusahaan);
    
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()) {
                idKeteranganPetugas = rs.getInt("id");
            }
            else{
                System.out.println("Not found");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        

        return idKeteranganPetugas;
    }

}
