/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import mform.entity.DataPerkebunan;

/**
 *
 * @author fatih
 */
public class CSVHandler {
    
    public boolean WriteCSV(String path, ArrayList<DataPerkebunan> dp){
        String header = "nama,alamat,kode_pos,telepon,email,fax,provinsi_kode,kab_kota_kode,kecamatan_kode,desa_kelurahan_kode,nama_pic,telepon_pic,jabatan_pic,jenis_kelamin_pic,unit_kerja_pic,status,latitude,longitude,kbli,status_pemodalan,bentuk_badan_hukum,pelaksana_kemitraan,kebun_plasma_konversi,punya_unit_pengolahan_produksi,tahun_berdiri,jenis_perusahaan_tebu,produk_utama,kode_kbki,stok_pabrik_gula,stok_pedagang,stok_petani,nama_kp,alamat_kp,kode_pos_kp,telepon_kp,email_kp,fax_kp,provinsi_kode_kp,kab_kota_kode_kp,nama_gp,alamat_gp,kode_pos_gp,telepon_gp,email_gp,fax_gp,provinsi_kode_gp,kab_kota_kode_gp,jenis_kebun,provinsi_kode_kebun,kab_kota_kode_kebun,luas_areal_tanam,luas_areal_tebang,produksi_tebu,produksi_gkp,produksi_tetes,produksi_hablur,rendemen_hablur,nama_pencacah,tanggal_mencacah,nama_pemeriksa,tanggal_memeriksa";
        
        try(FileWriter fileWriter = new FileWriter(path);
            PrintWriter printWriter = new PrintWriter(fileWriter)) {

            //Buat header
            printWriter.println(header);

            for (DataPerkebunan dataPerkebunan : dp) {
                //Kalau kebunnya banyak tiap kebun dibikinin baris sendiri
                for(int i = 0; i < dataPerkebunan.getJumlahKebun(); i++){
                    List<String> row = new ArrayList<>();
                    //Data Perusahaan
                    row.add(dataPerkebunan.getPerusahaan().getNama());
                    row.add(dataPerkebunan.getPerusahaan().getAlamat().getAlamatLengkap());
                    row.add(dataPerkebunan.getPerusahaan().getAlamat().getKodePos());
                    row.add(dataPerkebunan.getPerusahaan().getAlamat().getTelepon());
                    row.add(dataPerkebunan.getPerusahaan().getAlamat().getEmail());
                    row.add(dataPerkebunan.getPerusahaan().getAlamat().getFax());
                    row.add(dataPerkebunan.getPerusahaan().getAlamat().getProv());
                    row.add(dataPerkebunan.getPerusahaan().getAlamat().getKabKota());
                    row.add(dataPerkebunan.getPerusahaan().getKecamatan());
                    row.add(dataPerkebunan.getPerusahaan().getDesaKel());
                    row.add(dataPerkebunan.getPerusahaan().getNamaPIC());
                    row.add(dataPerkebunan.getPerusahaan().getTelpPIC());
                    row.add(dataPerkebunan.getPerusahaan().getJabatanPIC());
                    row.add(Character.toString(dataPerkebunan.getPerusahaan().getJK_PIC()));
                    row.add(dataPerkebunan.getPerusahaan().getUnitKerjaPIC());
                    row.add(dataPerkebunan.getPerusahaan().getStatus());
                    row.add(Double.toString(dataPerkebunan.getPerusahaan().getLintang()));
                    row.add(Double.toString(dataPerkebunan.getPerusahaan().getBujur()));
                    row.add(dataPerkebunan.getPerusahaan().getKBLI());
                    row.add(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getStatusPemodalan()));
                    row.add(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getBentukBadanHukum()));
                    row.add(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getPelaksanaanKemitraan()));
                    row.add(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getKebunPlasmaKonversi()));
                    row.add(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getUnitPengolahanProduksi()));
                    row.add(Integer.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getTahunBerdiri()));
                    row.add(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getJenisPerusahaanTebu()));
                    
                    //Produk & stok gkp
                    row.add(dataPerkebunan.getProdukUtama());
                    row.add(dataPerkebunan.getKBKI());
                    row.add(Double.toString(dataPerkebunan.getStokGKP().getStokPabrikGula()));
                    row.add(Double.toString(dataPerkebunan.getStokGKP().getStokPedagang()));
                    row.add(Double.toString(dataPerkebunan.getStokGKP().getStokPetani()));
    
                    //Kantor Pusat
                    if(dataPerkebunan.getKantorPusat().getNama() != null){
                        row.add(dataPerkebunan.getKantorPusat().getNama());
                        row.add(dataPerkebunan.getKantorPusat().getAlamat().getAlamatLengkap());
                        row.add(dataPerkebunan.getKantorPusat().getAlamat().getKodePos());
                        row.add(dataPerkebunan.getKantorPusat().getAlamat().getTelepon());
                        row.add(dataPerkebunan.getKantorPusat().getAlamat().getEmail());
                        row.add(dataPerkebunan.getKantorPusat().getAlamat().getFax());
                        row.add(dataPerkebunan.getKantorPusat().getAlamat().getProv());
                        row.add(dataPerkebunan.getKantorPusat().getAlamat().getKabKota());
                    }
                    else{
                        row.add("");
                        row.add("");
                        row.add("");
                        row.add("");
                        row.add("");
                        row.add("");
                        row.add("");
                        row.add("");
                    }
    
                    //Grup Perusahaan
                    if(dataPerkebunan.getGroupPerusahaan().getNama() != null){
                        row.add(dataPerkebunan.getGroupPerusahaan().getNama());
                        row.add(dataPerkebunan.getGroupPerusahaan().getAlamat().getAlamatLengkap());
                        row.add(dataPerkebunan.getGroupPerusahaan().getAlamat().getKodePos());
                        row.add(dataPerkebunan.getGroupPerusahaan().getAlamat().getTelepon());
                        row.add(dataPerkebunan.getGroupPerusahaan().getAlamat().getEmail());
                        row.add(dataPerkebunan.getGroupPerusahaan().getAlamat().getFax());
                        row.add(dataPerkebunan.getGroupPerusahaan().getAlamat().getProv());
                        row.add(dataPerkebunan.getGroupPerusahaan().getAlamat().getKabKota());
                    }
                    else{
                        row.add("");
                        row.add("");
                        row.add("");
                        row.add("");
                        row.add("");
                        row.add("");
                        row.add("");
                        row.add("");
                    }
    
                    //Kebun
                    row.add(dataPerkebunan.getKebun(i).getJenisKebun());
                    row.add(dataPerkebunan.getKebun(i).getLetak().getProv());
                    row.add(dataPerkebunan.getKebun(i).getLetak().getKabKota());
                    row.add(Double.toString(dataPerkebunan.getKebun(i).getLuasArealTanam()));
                    row.add(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getLuasArealTebang()));
                    row.add(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getProduksiTebu()));
                    row.add(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getProduksiGKP()));
                    row.add(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getProduksiTetes()));
                    row.add(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getProduksiHablur()));
                    row.add(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getRendemenHablur()));

                    //Keterangan Petugas
                    row.add(dataPerkebunan.getKeteranganPetugas().getNamaPencacah());
                    row.add(dataPerkebunan.getKeteranganPetugas().getTanggalMencacah().toString());
                    row.add(dataPerkebunan.getKeteranganPetugas().getNamaPemeriksa());
                    row.add(dataPerkebunan.getKeteranganPetugas().getTanggalMemeriksa().toString());
                    

                    //Tulis ke file csv
                    printWriter.println(String.join(",", row));

                }

            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return false;
    }
}
