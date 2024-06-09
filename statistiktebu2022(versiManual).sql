CREATE DATABASE IF NOT EXISTS StatistikTebu2022;
USE StatistikTebu2022;

-- Tabel untuk Kantor Pusat
CREATE TABLE kantor_pusat (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(255),
    alamat VARCHAR(255),
    kode_pos VARCHAR(10),
    telepon VARCHAR(20),
    email VARCHAR(100),
    fax VARCHAR(20),
    provinsi_kode CHAR(2),
    kab_kota_kode CHAR(2)
);

-- Tabel untuk Grup Perusahaan
CREATE TABLE grup_perusahaan (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(255),
    alamat VARCHAR(255),
    kode_pos VARCHAR(10),
    telepon VARCHAR(20),
    email VARCHAR(100),
    fax VARCHAR(20),
    provinsi_kode CHAR(2),
    kab_kota_kode CHAR(2)
);

-- Tabel untuk Perusahaan
CREATE TABLE perusahaan (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(255),
    alamat VARCHAR(255),
    kode_pos VARCHAR(10),
    telepon VARCHAR(20),
    email VARCHAR(100),
    fax VARCHAR(20),
    provinsi_kode CHAR(2),
    kab_kota_kode CHAR(2),
    kecamatan_kode CHAR(3),
    desa_kelurahan_kode CHAR(3),
    nama_pic VARCHAR(255),
    telepon_pic VARCHAR(20),
    jabatan_pic VARCHAR(100),
    jenis_kelamin_pic CHAR(1),
    unit_kerja_pic VARCHAR(255),
    status ENUM('aktif', 'tutup', 'tutup sementara'),
    latitude DOUBLE,
    longitude DOUBLE,
    kbli VARCHAR(5),
    kantor_pusat_id INT,
    grup_perusahaan_id INT,
    status_pemodalan CHAR(1),
    bentuk_badan_hukum CHAR(1),
    pelaksana_kemitraan CHAR(1),
    kebun_plasma_konversi CHAR(1),
    punya_unit_pengolahan_produksi CHAR(1),
    tahun_berdiri INT,
    jenis_perusahaan_tebu CHAR(1),
    produk_utama VARCHAR(50),
    kode_kbki VARCHAR(10),
    stok_pabrik_gula DOUBLE,
    stok_pedagang DOUBLE,
    stok_petani DOUBLE,
    FOREIGN KEY (kantor_pusat_id) REFERENCES kantor_pusat(id),
    FOREIGN KEY (grup_perusahaan_id) REFERENCES grup_perusahaan(id)
);

-- Tabel untuk Kebun
CREATE TABLE kebun (
    id INT AUTO_INCREMENT PRIMARY KEY,
    perusahaan_id INT,
    nama_kebun ENUM('Tebu Sendiri', 'Tebu Rakyat', 'Pembelian dari Pihak Ketiga'),
    provinsi_kode CHAR(2),
    kab_kota_kode CHAR(2),
    luas_areal_tanam DOUBLE,
    luas_areal_tebang DOUBLE,
    produksi_tebu DOUBLE,
    produksi_gkp DOUBLE,
    produksi_tetes DOUBLE,
    produksi_hablur DOUBLE,
    rendemen_hablur DOUBLE,
    FOREIGN KEY (perusahaan_id) REFERENCES perusahaan(id)
);

-- Tabel untuk Keterangan Petugas
CREATE TABLE keterangan_petugas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    perusahaan_id INT,
    nama_pencacah VARCHAR(255),
    tanggal_mencacah DATE,
    nama_pemeriksa VARCHAR(255),
    tanggal_memeriksa DATE,
    FOREIGN KEY (perusahaan_id) REFERENCES perusahaan(id)
);

-- INSERT DATA CONTOH
-- Kantor Pusat
INSERT INTO kantor_pusat (nama, alamat, kode_pos, telepon, email, fax, provinsi_kode, kab_kota_kode)
VALUES 
('Kantor Pusat Tebu Nasional', 'Jl. Tebu Raya No. 12', '60293', '021234567', 'info@tebunasional.com', '021234568', '01', '01'),
('Kantor Pusat Tebu Sejahtera', 'Jl. Sejahtera No. 15', '60296', '021567890', 'info@tebusejahtera.com', '021567891', '02', '02');

-- Group Perusahaan
INSERT INTO grup_perusahaan (nama, alamat, kode_pos, telepon, email, fax, provinsi_kode, kab_kota_kode)
VALUES 
('Grup Agro Tebu', 'Jl. Agro No. 10', '60294', '021345678', 'contact@agrotebu.com', '021345679', '01', '01'),
('Grup Tebu Maju', 'Jl. Maju No. 20', '60297', '021678901', 'contact@tebumaju.com', '021678902', '02', '02');

-- Perusahaan
INSERT INTO perusahaan (nama, alamat, kode_pos, telepon, email, fax, provinsi_kode, kab_kota_kode, kecamatan_kode, desa_kelurahan_kode, nama_pic, telepon_pic, jabatan_pic, jenis_kelamin_pic, unit_kerja_pic, status, latitude, longitude, kbli, kantor_pusat_id, grup_perusahaan_id, status_pemodalan, bentuk_badan_hukum, pelaksana_kemitraan, kebun_plasma_konversi, punya_unit_pengolahan_produksi, tahun_berdiri, jenis_perusahaan_tebu, produk_utama, kode_kbki, stok_pabrik_gula, stok_pedagang, stok_petani)
VALUES 
('Perusahaan Tebu Subur', 'Jl. Subur No. 5', '60295', '021456789', 'admin@tebusubur.com', '021456780', '01', '01', '001', '001', 'Budi Darmawan', '08123456789', 'Manager', '1', 'Pengolahan', 'aktif', -6.175110, 106.865039, '011', 1, 1, '1', '1', '1', '1', '1', 1985, '1', 'Tebu', '1234567890', 1000.0, 500.0, 200.0),
('Perusahaan Tebu Sejahtera', 'Jl. Subur No. 6', '60298', '021567892', 'admin@tebusejahtera.com', '021567893', '02', '02', '002', '002', 'Agus Santoso', '08134567890', 'Manager', '1', 'Pengolahan', 'aktif', -6.200000, 106.900000, '012', 2, 2, '2', '1', '1', '1', '1', 1990, '2', 'Tebu', '2345678901', 1500.0, 700.0, 300.0),
('Perusahaan Tebu Maju', 'Jl. Maju No. 25', '60299', '021678903', 'admin@tebumaju.com', '021678904', '02', '02', '002', '002', 'Rina Wijaya', '08145678901', 'Manager', '2', 'Pengolahan', 'aktif', -6.210000, 106.910000, '013', 1, 2, '3', '1', '1', '1', '1', 2000, '3', 'Tebu', '3456789012', 2000.0, 800.0, 400.0),
('Perusahaan Tebu Makmur', 'Jl. Makmur No. 30', '60300', '021789012', 'admin@tebumakmur.com', '021789013', '03', '03', '003', '003', 'Andi Suryadi', '08156789012', 'Manager', '1', 'Pengolahan', 'aktif', -6.220000, 106.920000, '014', 2, 1, '4', '1', '1', '1', '1', 1995, '1', 'Tebu', '4567890123', 2500.0, 900.0, 500.0);

-- Kebun
INSERT INTO kebun (perusahaan_id, nama_kebun, provinsi_kode, kab_kota_kode, luas_areal_tanam, luas_areal_tebang, produksi_tebu, produksi_gkp, produksi_tetes, produksi_hablur, rendemen_hablur)
VALUES 
(1, 'Tebu Sendiri', '01', '01', 500.0, 500.0, 10000.0, 5000.0, 2500.0, 1250.0, 12.5),
(2, 'Tebu Sendiri', '02', '02', 600.0, 600.0, 12000.0, 6000.0, 3000.0, 1500.0, 12.5),
(2, 'Tebu Rakyat', '02', '02', 300.0, 300.0, 6000.0, 3000.0, 1500.0, 750.0, 12.5),
(2, 'Pembelian dari Pihak Ketiga', '02', '02', 100.0, 100.0, 2000.0, 1000.0, 500.0, 250.0, 12.5),
(3, 'Tebu Sendiri', '02', '02', 700.0, 700.0, 14000.0, 7000.0, 3500.0, 1750.0, 12.5),
(4, 'Tebu Sendiri', '03', '03', 800.0, 800.0, 16000.0, 8000.0, 4000.0, 2000.0, 12.5),
(4, 'Tebu Rakyat', '03', '03', 400.0, 400.0, 8000.0, 4000.0, 2000.0, 1000.0, 12.5);

-- Keterangan Petugas
INSERT INTO keterangan_petugas (perusahaan_id, nama_pencacah, tanggal_mencacah, nama_pemeriksa, tanggal_memeriksa)
VALUES 
(1, 'Joko Susilo', '2024-06-01', 'Siti Rahayu', '2024-06-03'),
(2, 'Ahmad Yani', '2024-06-02', 'Budi Santoso', '2024-06-04'),
(3, 'Dewi Lestari', '2024-06-03', 'Citra Dewi', '2024-06-05'),
(4, 'Rudi Hidayat', '2024-06-04', 'Ani Wijaya', '2024-06-06');


-- CONTOH SELECT DATA TIPE 1
SELECT 
    p.*, 
    kp.*, 
    gp.*, 
    k.*, 
    kpnc.*
FROM 
    perusahaan p
LEFT JOIN 
    kantor_pusat kp ON p.kantor_pusat_id = kp.id
LEFT JOIN 
    grup_perusahaan gp ON p.grup_perusahaan_id = gp.id
LEFT JOIN 
    kebun k ON p.id = k.perusahaan_id
LEFT JOIN 
    keterangan_petugas kpnc ON p.id = kpnc.perusahaan_id;



-- CONTOH SELECT DATA TIPE 2 (Sesuai urutan kuesioner)
SELECT 
    p.*, 
    kp.nama AS nama_kantor_pusat, 
    kp.alamat AS alamat_kantor_pusat, 
    kp.kode_pos AS kode_pos_kantor_pusat, 
    kp.telepon AS telepon_kantor_pusat, 
    kp.email AS email_kantor_pusat, 
    kp.fax AS fax_kantor_pusat, 
    gp.nama AS nama_grup_perusahaan, 
    gp.alamat AS alamat_grup_perusahaan, 
    gp.kode_pos AS kode_pos_grup_perusahaan, 
    gp.telepon AS telepon_grup_perusahaan, 
    gp.email AS email_grup_perusahaan, 
    gp.fax AS fax_grup_perusahaan,
    k.nama_kebun, 
    k.luas_areal_tanam,
    k.luas_areal_tebang,
    k.produksi_tebu, 
    k.produksi_gkp, 
    k.produksi_tetes, 
    k.produksi_hablur, 
    k.rendemen_hablur,
    kpnc.nama_pencacah, 
    kpnc.tanggal_mencacah, 
    kpnc.nama_pemeriksa, 
    kpnc.tanggal_memeriksa
FROM 
    perusahaan p
LEFT JOIN 
    kantor_pusat kp ON p.kantor_pusat_id = kp.id
LEFT JOIN 
    grup_perusahaan gp ON p.grup_perusahaan_id = gp.id
LEFT JOIN 
    kebun k ON p.id = k.perusahaan_id
LEFT JOIN 
    keterangan_petugas kpnc ON p.id = kpnc.perusahaan_id;

