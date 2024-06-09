-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Jun 2024 pada 20.26
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `statistiktebu2022`
--
CREATE DATABASE IF NOT EXISTS StatistikTebu2022;
USE StatistikTebu2022;
-- --------------------------------------------------------

--
-- Struktur dari tabel `grup_perusahaan`
--

CREATE TABLE `grup_perusahaan` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `kode_pos` varchar(10) DEFAULT NULL,
  `telepon` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `provinsi_kode` char(2) DEFAULT NULL,
  `kab_kota_kode` char(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `grup_perusahaan`
--

INSERT INTO `grup_perusahaan` (`id`, `nama`, `alamat`, `kode_pos`, `telepon`, `email`, `fax`, `provinsi_kode`, `kab_kota_kode`) VALUES
(1, 'Grup Agro Tebu', 'Jl. Agro No. 10', '60294', '021345678', 'contact@agrotebu.com', '021345679', '01', '01'),
(2, 'Grup Tebu Maju', 'Jl. Maju No. 20', '60297', '021678901', 'contact@tebumaju.com', '021678902', '02', '02');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kantor_pusat`
--

CREATE TABLE `kantor_pusat` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `kode_pos` varchar(10) DEFAULT NULL,
  `telepon` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `provinsi_kode` char(2) DEFAULT NULL,
  `kab_kota_kode` char(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `kantor_pusat`
--

INSERT INTO `kantor_pusat` (`id`, `nama`, `alamat`, `kode_pos`, `telepon`, `email`, `fax`, `provinsi_kode`, `kab_kota_kode`) VALUES
(1, 'Kantor Pusat Tebu Nasional', 'Jl. Tebu Raya No. 12', '60293', '021234567', 'info@tebunasional.com', '021234568', '01', '01'),
(2, 'Kantor Pusat Tebu Sejahtera', 'Jl. Sejahtera No. 15', '60296', '021567890', 'info@tebusejahtera.com', '021567891', '02', '02');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kebun`
--

CREATE TABLE `kebun` (
  `id` int(11) NOT NULL,
  `perusahaan_id` int(11) DEFAULT NULL,
  `nama_kebun` enum('Tebu Sendiri','Tebu Rakyat','Pembelian dari Pihak Ketiga') DEFAULT NULL,
  `provinsi_kode` char(2) DEFAULT NULL,
  `kab_kota_kode` char(2) DEFAULT NULL,
  `luas_areal_tanam` double DEFAULT NULL,
  `luas_areal_tebang` double DEFAULT NULL,
  `produksi_tebu` double DEFAULT NULL,
  `produksi_gkp` double DEFAULT NULL,
  `produksi_tetes` double DEFAULT NULL,
  `produksi_hablur` double DEFAULT NULL,
  `rendemen_hablur` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `kebun`
--

INSERT INTO `kebun` (`id`, `perusahaan_id`, `nama_kebun`, `provinsi_kode`, `kab_kota_kode`, `luas_areal_tanam`, `luas_areal_tebang`, `produksi_tebu`, `produksi_gkp`, `produksi_tetes`, `produksi_hablur`, `rendemen_hablur`) VALUES
(1, 1, 'Tebu Sendiri', '01', '01', 500, 500, 10000, 5000, 2500, 1250, 12.5),
(2, 2, 'Tebu Sendiri', '02', '02', 600, 600, 12000, 6000, 3000, 1500, 12.5),
(3, 2, 'Tebu Rakyat', '02', '02', 300, 300, 6000, 3000, 1500, 750, 12.5),
(4, 2, 'Pembelian dari Pihak Ketiga', '02', '02', 100, 100, 2000, 1000, 500, 250, 12.5),
(5, 3, 'Tebu Sendiri', '02', '02', 700, 700, 14000, 7000, 3500, 1750, 12.5),
(6, 4, 'Tebu Sendiri', '03', '03', 800, 800, 16000, 8000, 4000, 2000, 12.5),
(7, 4, 'Tebu Rakyat', '03', '03', 400, 400, 8000, 4000, 2000, 1000, 12.5);

-- --------------------------------------------------------

--
-- Struktur dari tabel `keterangan_petugas`
--

CREATE TABLE `keterangan_petugas` (
  `id` int(11) NOT NULL,
  `perusahaan_id` int(11) DEFAULT NULL,
  `nama_pencacah` varchar(255) DEFAULT NULL,
  `tanggal_mencacah` date DEFAULT NULL,
  `nama_pemeriksa` varchar(255) DEFAULT NULL,
  `tanggal_memeriksa` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `keterangan_petugas`
--

INSERT INTO `keterangan_petugas` (`id`, `perusahaan_id`, `nama_pencacah`, `tanggal_mencacah`, `nama_pemeriksa`, `tanggal_memeriksa`) VALUES
(1, 1, 'Joko Susilo', '2024-06-01', 'Siti Rahayu', '2024-06-03'),
(2, 2, 'Ahmad Yani', '2024-06-02', 'Budi Santoso', '2024-06-04'),
(3, 3, 'Dewi Lestari', '2024-06-03', 'Citra Dewi', '2024-06-05'),
(4, 4, 'Rudi Hidayat', '2024-06-04', 'Ani Wijaya', '2024-06-06');

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
(2, 'Perusahaan Tebu Sejahtera', 'Jl. Subur No. 6', '60298', '021567892', 'admin@tebusejahtera.com', '021567893', '02', '02', '002', '002', 'Agus Santoso', '08134567890', 'Manager', '1', 'Pengolahan', 'aktif', -6.2, 106.9, '012', 2, 2, '2', '1', '1', '1', '1', 1990, '2', 'Tebu', '2345678901', 1500, 700, 300),
(3, 'Perusahaan Tebu Maju', 'Jl. Maju No. 25', '60299', '021678903', 'admin@tebumaju.com', '021678904', '02', '02', '002', '002', 'Rina Wijaya', '08145678901', 'Manager', '2', 'Pengolahan', 'aktif', -6.21, 106.91, '013', 1, 2, '3', '1', '1', '1', '1', 2000, '3', 'Tebu', '3456789012', 2000, 800, 400),
(4, 'Perusahaan Tebu Makmur', 'Jl. Makmur No. 30', '60300', '021789012', 'admin@tebumakmur.com', '021789013', '03', '03', '003', '003', 'Andi Suryadi', '08156789012', 'Manager', '1', 'Pengolahan', 'aktif', -6.22, 106.92, '014', 2, 1, '4', '1', '1', '1', '1', 1995, '1', 'Tebu', '4567890123', 2500, 900, 500);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `name`, `password`) VALUES
(1, 'yedija', 'Alvin Jeremy Naiborhu', '222212488'),
(2, 'fatih', 'Fatih Hakim Mudzaky', '222212603'),
(3, 'yedija', 'Yedija Lewi Suryadi', '222212921'),
(4, 'zahra', 'Zahra Mufidah Arian', '222212932');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `grup_perusahaan`
--
ALTER TABLE `grup_perusahaan`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `kantor_pusat`
--
ALTER TABLE `kantor_pusat`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `kebun`
--
ALTER TABLE `kebun`
  ADD PRIMARY KEY (`id`),
  ADD KEY `perusahaan_id` (`perusahaan_id`);

--
-- Indeks untuk tabel `keterangan_petugas`
--
ALTER TABLE `keterangan_petugas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `perusahaan_id` (`perusahaan_id`);

--
-- Indeks untuk tabel `perusahaan`
--
ALTER TABLE `perusahaan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kantor_pusat_id` (`kantor_pusat_id`),
  ADD KEY `grup_perusahaan_id` (`grup_perusahaan_id`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `grup_perusahaan`
--
ALTER TABLE `grup_perusahaan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `kantor_pusat`
--
ALTER TABLE `kantor_pusat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `kebun`
--
ALTER TABLE `kebun`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT untuk tabel `keterangan_petugas`
--
ALTER TABLE `keterangan_petugas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `perusahaan`
--
ALTER TABLE `perusahaan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `kebun`
--
ALTER TABLE `kebun`
  ADD CONSTRAINT `kebun_ibfk_1` FOREIGN KEY (`perusahaan_id`) REFERENCES `perusahaan` (`id`);

--
-- Ketidakleluasaan untuk tabel `keterangan_petugas`
--
ALTER TABLE `keterangan_petugas`
  ADD CONSTRAINT `keterangan_petugas_ibfk_1` FOREIGN KEY (`perusahaan_id`) REFERENCES `perusahaan` (`id`);

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
