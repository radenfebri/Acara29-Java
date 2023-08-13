-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versi server:                 5.7.33 - MySQL Community Server (GPL)
-- OS Server:                    Win64
-- HeidiSQL Versi:               11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- membuang struktur untuk table penjualan-sepatu.tb_barang
CREATE TABLE IF NOT EXISTS `tb_barang` (
  `id_barang` int(25) NOT NULL AUTO_INCREMENT,
  `nama_barang` varchar(255) NOT NULL,
  `merk_barang` varchar(255) NOT NULL,
  `harga_barang` int(25) NOT NULL,
  `stok_barang` int(25) NOT NULL,
  PRIMARY KEY (`id_barang`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- Membuang data untuk tabel penjualan-sepatu.tb_barang: ~4 rows (lebih kurang)
/*!40000 ALTER TABLE `tb_barang` DISABLE KEYS */;
INSERT INTO `tb_barang` (`id_barang`, `nama_barang`, `merk_barang`, `harga_barang`, `stok_barang`) VALUES
	(2, 'Tas', 'nike', 25000, 13),
	(3, 'Kain', 'nike', 43, 25000),
	(4, 'Sepatu', 'nike', 898989, 1),
	(5, 'Febri', 'adidas', 10000, 2);
/*!40000 ALTER TABLE `tb_barang` ENABLE KEYS */;

-- membuang struktur untuk table penjualan-sepatu.tb_pembeli
CREATE TABLE IF NOT EXISTS `tb_pembeli` (
  `id_pembeli` int(25) NOT NULL AUTO_INCREMENT,
  `nama` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(25) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id_pembeli`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- Membuang data untuk tabel penjualan-sepatu.tb_pembeli: ~1 rows (lebih kurang)
/*!40000 ALTER TABLE `tb_pembeli` DISABLE KEYS */;
INSERT INTO `tb_pembeli` (`id_pembeli`, `nama`, `email`, `alamat`, `no_hp`, `password`) VALUES
	(8, 'Raden Febri', 'febriye12@gmail.com', 'Banyuwangi', '02873242342', 'Febri2303');
/*!40000 ALTER TABLE `tb_pembeli` ENABLE KEYS */;

-- membuang struktur untuk table penjualan-sepatu.tb_penjual
CREATE TABLE IF NOT EXISTS `tb_penjual` (
  `id_penjual` int(25) NOT NULL AUTO_INCREMENT,
  `nama` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(25) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id_penjual`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Membuang data untuk tabel penjualan-sepatu.tb_penjual: ~1 rows (lebih kurang)
/*!40000 ALTER TABLE `tb_penjual` DISABLE KEYS */;
INSERT INTO `tb_penjual` (`id_penjual`, `nama`, `email`, `alamat`, `no_hp`, `password`) VALUES
	(3, 'Admin', 'admin@gmail.com', 'Banyuwangi', '098713123', 'Febri2303');
/*!40000 ALTER TABLE `tb_penjual` ENABLE KEYS */;

-- membuang struktur untuk table penjualan-sepatu.tb_stok
CREATE TABLE IF NOT EXISTS `tb_stok` (
  `no_invoice` int(25) NOT NULL AUTO_INCREMENT,
  `id_penjual` int(25) NOT NULL,
  `id_supplier` int(25) NOT NULL,
  `qty` int(25) NOT NULL,
  `nama_barang` varchar(255) NOT NULL,
  `grand_total` varchar(255) NOT NULL,
  PRIMARY KEY (`no_invoice`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Membuang data untuk tabel penjualan-sepatu.tb_stok: ~0 rows (lebih kurang)
/*!40000 ALTER TABLE `tb_stok` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_stok` ENABLE KEYS */;

-- membuang struktur untuk table penjualan-sepatu.tb_supplier
CREATE TABLE IF NOT EXISTS `tb_supplier` (
  `id_supplier` int(25) NOT NULL AUTO_INCREMENT,
  `nama` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(25) NOT NULL,
  PRIMARY KEY (`id_supplier`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Membuang data untuk tabel penjualan-sepatu.tb_supplier: ~1 rows (lebih kurang)
/*!40000 ALTER TABLE `tb_supplier` DISABLE KEYS */;
INSERT INTO `tb_supplier` (`id_supplier`, `nama`, `email`, `alamat`, `no_hp`) VALUES
	(1, 'Radenfebri', 'febriye12@gmail.com', 'Banyuwangi', '082147639955');
/*!40000 ALTER TABLE `tb_supplier` ENABLE KEYS */;

-- membuang struktur untuk table penjualan-sepatu.tb_transaksi
CREATE TABLE IF NOT EXISTS `tb_transaksi` (
  `no_invoice` int(25) NOT NULL AUTO_INCREMENT,
  `id_pembeli` int(25) NOT NULL,
  `id_barang` int(25) NOT NULL,
  `id_penjual` int(25) NOT NULL,
  `qty` int(25) NOT NULL,
  `grand_total` int(25) NOT NULL,
  `is_confirm` int(25) NOT NULL,
  PRIMARY KEY (`no_invoice`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Membuang data untuk tabel penjualan-sepatu.tb_transaksi: ~0 rows (lebih kurang)
/*!40000 ALTER TABLE `tb_transaksi` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_transaksi` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
