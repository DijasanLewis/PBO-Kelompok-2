package file;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import mform.entity.DataPerkebunan;
import org.apache.poi.ss.usermodel.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
 */

public class XlsxHandler {
    
    public boolean WriteXlsx(String path, ArrayList<DataPerkebunan> dataPerkebunans){
        boolean value = false;
        //Buat workbook
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data");

        //Buat header
        Row header = sheet.createRow(0);
        String[] columnName = {
                          "nama", "alamat", "kode_pos", "telepon", "email", "fax", "provinsi_kode", 
                          "kab_kota_kode", "kecamatan_kode", "desa_kelurahan_kode", "nama_pic", 
                          "telepon_pic", "jabatan_pic", "jenis_kelamin_pic", "unit_kerja_pic", 
                          "status", "latitude", "longitude", "kbli", "status_pemodalan", 
                          "bentuk_badan_hukum", "pelaksana_kemitraan", "kebun_plasma_konversi", 
                          "punya_unit_pengolahan_produksi", "tahun_berdiri", 
                          "jenis_perusahaan_tebu", "produk_utama", "kode_kbki", 
                          "stok_pabrik_gula", "stok_pedagang", "stok_petani", "nama_kp", 
                          "alamat_kp", "kode_pos_kp", "telepon_kp", "email_kp", "fax_kp", 
                          "provinsi_kode_kp", "kab_kota_kode_kp", "nama_gp", "alamat_gp", 
                          "kode_pos_gp", "telepon_gp", "email_gp", "fax_gp", "provinsi_kode_gp", 
                          "kab_kota_kode_gp", "jenis_kebun", "provinsi_kode_kebun", 
                          "kab_kota_kode_kebun", "luas_areal_tanam", "luas_areal_tebang", 
                          "produksi_tebu", "produksi_gkp", "produksi_tetes", "produksi_hablur", 
                          "rendemen_hablur", "nama_pencacah", "tanggal_mencacah", "nama_pemeriksa", 
                          "tanggal_memeriksa"
                        };
        for(int i = 0; i < columnName.length; i++){
            header.createCell(i).setCellValue(columnName[i]);
        }

        //Masukkan data perusahaan ke setiap baris
        int rowIndex = 1;
        for (DataPerkebunan dataPerkebunan : dataPerkebunans) {
            for(int i = 0; i < dataPerkebunan.getJumlahKebun(); i++){
                Row baris = sheet.createRow(rowIndex);
                int index = 0;

                // Perusahaan
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getNama());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getAlamat().getAlamatLengkap());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getAlamat().getKodePos());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getAlamat().getTelepon());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getAlamat().getEmail());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getAlamat().getFax());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getAlamat().getProv());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getAlamat().getKabKota());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getKecamatan());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getDesaKel());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getNamaPIC());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getTelpPIC());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getJabatanPIC());
                baris.createCell(index++).setCellValue(Character.toString(dataPerkebunan.getPerusahaan().getJK_PIC()));
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getUnitKerjaPIC());
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getStatus());
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getPerusahaan().getLintang()));
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getPerusahaan().getBujur()));
                baris.createCell(index++).setCellValue(dataPerkebunan.getPerusahaan().getKBLI());
                baris.createCell(index++).setCellValue(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getStatusPemodalan()));
                baris.createCell(index++).setCellValue(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getBentukBadanHukum()));
                baris.createCell(index++).setCellValue(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getPelaksanaanKemitraan()));
                baris.createCell(index++).setCellValue(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getKebunPlasmaKonversi()));
                baris.createCell(index++).setCellValue(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getUnitPengolahanProduksi()));
                baris.createCell(index++).setCellValue(Integer.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getTahunBerdiri()));
                baris.createCell(index++).setCellValue(Character.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getJenisPerusahaanTebu()));

                // Produk & stok GKP
                baris.createCell(index++).setCellValue(dataPerkebunan.getProdukUtama());
                baris.createCell(index++).setCellValue(dataPerkebunan.getKBKI());
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getStokGKP().getStokPabrikGula()));
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getStokGKP().getStokPedagang()));
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getStokGKP().getStokPetani()));

                // Kantor Pusat
                if (dataPerkebunan.getKantorPusat().getNama() != null) {
                    baris.createCell(index++).setCellValue(dataPerkebunan.getKantorPusat().getNama());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getKantorPusat().getAlamat().getAlamatLengkap());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getKantorPusat().getAlamat().getKodePos());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getKantorPusat().getAlamat().getTelepon());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getKantorPusat().getAlamat().getEmail());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getKantorPusat().getAlamat().getFax());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getKantorPusat().getAlamat().getProv());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getKantorPusat().getAlamat().getKabKota());
                } else {
                    index += 8; // Move the index forward by 8 cells if Kantor Pusat is null
                }

                // Grup Perusahaan
                if (dataPerkebunan.getGroupPerusahaan().getNama() != null) {
                    baris.createCell(index++).setCellValue(dataPerkebunan.getGroupPerusahaan().getNama());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getGroupPerusahaan().getAlamat().getAlamatLengkap());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getGroupPerusahaan().getAlamat().getKodePos());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getGroupPerusahaan().getAlamat().getTelepon());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getGroupPerusahaan().getAlamat().getEmail());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getGroupPerusahaan().getAlamat().getFax());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getGroupPerusahaan().getAlamat().getProv());
                    baris.createCell(index++).setCellValue(dataPerkebunan.getGroupPerusahaan().getAlamat().getKabKota());
                } else {
                    index += 8; // Move the index forward by 8 cells if Grup Perusahaan is null
                }

                // Kebun
                baris.createCell(index++).setCellValue(dataPerkebunan.getKebun(i).getJenisKebun());
                baris.createCell(index++).setCellValue(dataPerkebunan.getKebun(i).getLetak().getProv());
                baris.createCell(index++).setCellValue(dataPerkebunan.getKebun(i).getLetak().getKabKota());
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getKebun(i).getLuasArealTanam()));
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getLuasArealTebang()));
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getProduksiTebu()));
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getProduksiGKP()));
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getProduksiTetes()));
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getProduksiHablur()));
                baris.createCell(index++).setCellValue(Double.toString(dataPerkebunan.getKebun(i).getProduksi().getRendemenHablur()));

                // Keterangan Petugas
                baris.createCell(index++).setCellValue(dataPerkebunan.getKeteranganPetugas().getNamaPencacah());
                baris.createCell(index++).setCellValue(dataPerkebunan.getKeteranganPetugas().getTanggalMencacah().toString());
                baris.createCell(index++).setCellValue(dataPerkebunan.getKeteranganPetugas().getNamaPemeriksa());
                baris.createCell(index++).setCellValue(dataPerkebunan.getKeteranganPetugas().getTanggalMemeriksa().toString());

                rowIndex++;
            }
        }
        value = true;

        //Buat file excel
        try(FileOutputStream fos = new FileOutputStream(path + "\\output.xlsx")){
            workbook.write(fos);
        }catch(Exception e){
            System.err.println(e.getMessage());
            value = false;
        }

        //Close workbook
        try {
            workbook.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        //TODO:
        return value;
    }
    
}
