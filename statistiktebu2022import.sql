-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 16 Jun 2024 pada 14.31
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

CREATE DATABASE IF NOT EXISTS StatistikTebu2022;
USE StatistikTebu2022;

--
-- Database: `statistiktebu2022`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `perusahaan`
--

CREATE TABLE `perusahaan` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `kode_pos` varchar(10) DEFAULT NULL,
  `telepon` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `provinsi_kode` char(2) DEFAULT NULL,
  `kab_kota_kode` char(2) DEFAULT NULL,
  `kecamatan_kode` char(3) DEFAULT NULL,
  `desa_kelurahan_kode` char(3) DEFAULT NULL,
  `nama_pic` varchar(255) DEFAULT NULL,
  `telepon_pic` varchar(20) DEFAULT NULL,
  `jabatan_pic` varchar(100) DEFAULT NULL,
  `jenis_kelamin_pic` char(1) DEFAULT NULL,
  `unit_kerja_pic` varchar(255) DEFAULT NULL,
  `status` enum('aktif','tutup','tutup sementara') DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `kbli` varchar(5) DEFAULT NULL,
  `kantor_pusat_id` int(11) DEFAULT NULL,
  `grup_perusahaan_id` int(11) DEFAULT NULL,
  `status_pemodalan` char(1) DEFAULT NULL,
  `bentuk_badan_hukum` char(1) DEFAULT NULL,
  `pelaksana_kemitraan` char(1) DEFAULT NULL,
  `kebun_plasma_konversi` char(1) DEFAULT NULL,
  `punya_unit_pengolahan_produksi` char(1) DEFAULT NULL,
  `tahun_berdiri` int(11) DEFAULT NULL,
  `jenis_perusahaan_tebu` char(1) DEFAULT NULL,
  `produk_utama` varchar(50) DEFAULT NULL,
  `kode_kbki` varchar(10) DEFAULT NULL,
  `stok_pabrik_gula` double DEFAULT NULL,
  `stok_pedagang` double DEFAULT NULL,
  `stok_petani` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `perusahaan`
--

INSERT INTO `perusahaan` (`id`, `nama`, `alamat`, `kode_pos`, `telepon`, `email`, `fax`, `provinsi_kode`, `kab_kota_kode`, `kecamatan_kode`, `desa_kelurahan_kode`, `nama_pic`, `telepon_pic`, `jabatan_pic`, `jenis_kelamin_pic`, `unit_kerja_pic`, `status`, `latitude`, `longitude`, `kbli`, `kantor_pusat_id`, `grup_perusahaan_id`, `status_pemodalan`, `bentuk_badan_hukum`, `pelaksana_kemitraan`, `kebun_plasma_konversi`, `punya_unit_pengolahan_produksi`, `tahun_berdiri`, `jenis_perusahaan_tebu`, `produk_utama`, `kode_kbki`, `stok_pabrik_gula`, `stok_pedagang`, `stok_petani`) VALUES
(1, 'Perusahaan Tebu Subur', 'Jl. Subur No. 5', '60295', '021456789', 'admin@tebusubur.com', '021456780', '01', '01', '001', '001', 'Budi Darmawan', '08123456789', 'Manager', '1', 'Pengolahan', 'aktif', -6.17511, 106.865039, '011', 1, 1, '1', '1', '1', '1', '1', 1985, '1', 'Tebu', '1234567890', 1000, 500, 200),
(2, 'Perusahaan Tebu Sejahtera', 'Jl. Subur No. 6', '60298', '021567892123', 'admin@tebusejahtera.com', '021567893132', '02', '02', '002', '002', 'Agus Santoso', '08134567890', 'Manager', '1', 'Pengolahan', 'aktif', -6.2, 106.9, '01232', NULL, NULL, '2', '1', '1', '1', '1', 1990, '2', 'Tebu', '2345678901', 1500, 700, 300),
(3, 'Perusahaan Tebu Maju', 'Jl. Maju No. 25', '60299', '021678903', 'admin@tebumaju.com', '021678904', '02', '02', '002', '002', 'Rina Wijaya', '08145678901', 'Manager', '2', 'Pengolahan', 'aktif', -6.21, 106.91, '013', 1, 2, '3', '1', '1', '1', '1', 2000, '3', 'Tebu', '3456789012', 2000, 800, 400),
(4, 'Perusahaan Tebu Makmur', 'Jl. Makmur No. 30', '60300', '021789012', 'admin@tebumakmur.com', '021789013', '03', '03', '003', '003', 'Andi Suryadi', '08156789012', 'Manager', '1', 'Pengolahan', 'aktif', -6.22, 106.92, '014', 2, 1, '4', '1', '1', '1', '1', 1995, '1', 'Tebu', '4567890123', 2500, 900, 500),
(7, 'NamaPerusahaanTest', 'Jalan Stis no.5 Jakarta', '12345', '081312345678', 'Perusahaantebu@gmail.com', '021012345678', '31', '71', '111', '111', 'NamaPICTest', '123456789012', 'JabatanPICTest', '1', 'UnitKerjaPICTest', 'aktif', 80.1, 100.1, '12345', NULL, NULL, '1', '1', '1', '1', '1', 2010, '1', 'Tebu Impor', '1234567890', 2.1, 1.5, 4.1),
(8, 'AKu TEbu', 'aku tebu cuy', '12342', '091238141221', 'aku@gmail.com', '123142352343', '12', '32', '234', '534', 'aku pic cuy', '123142352343', 'aku keunagna', '2', 'aku finass', 'tutup', 89.2, -32.555, '12343', NULL, 3, '2', '6', '1', '2', '1', 1233, '2', 'tebu lah', '1232534234', 23, 254, 587),
(9, 'serg', 'asdf', '12342', '123456789102', 'aku@mai.co', '123456789102', '43', '64', '234', '234', 'aku pc', '123456789102', 'pic ku pig', '2', 'aku kerjaa piv', 'tutup sementara', 12, 32, '34543', 3, NULL, '2', '8', '2', '1', '1', 1223, '2', 'tebu', '1234567890', 24, 46, 34),
(11, 'agaaregrg', 'awwgsethdfnjdrtghserge', '12333', '12345677890', 'woi@gmai.cconm', '12142365457', '34', '87', '345', '567', 'pic asdafw', '345435757456', 'jab pic aksf', '2', 'kerja ljcishe', 'tutup', 12, 23, '12436', NULL, 5, '2', '5', '1', '1', '2', 456, '2', 'jdftjdrtjhrt', '1029384756', 34, 59, 756);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `perusahaan`
--
ALTER TABLE `perusahaan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kantor_pusat_id` (`kantor_pusat_id`),
  ADD KEY `grup_perusahaan_id` (`grup_perusahaan_id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `perusahaan`
--
ALTER TABLE `perusahaan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `perusahaan`
--
ALTER TABLE `perusahaan`
  ADD CONSTRAINT `perusahaan_ibfk_1` FOREIGN KEY (`kantor_pusat_id`) REFERENCES `kantor_pusat` (`id`),
  ADD CONSTRAINT `perusahaan_ibfk_2` FOREIGN KEY (`grup_perusahaan_id`) REFERENCES `grup_perusahaan` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
