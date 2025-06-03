# Sistem Manajemen Kost

## Deskripsi Singkat Proyek
Proyek ini merupakan sistem manajemen kost berbasis Java yang dibangun dengan pendekatan Pemrograman Berorientasi Objek (OOP). Sistem ini dirancang untuk membantu pemilik kos dalam mengelola data kamar, penyewa, pembayaran, laporan keuangan, serta pencarian dan filter data secara efektif.

Aplikasi ini dibagi ke dalam lima fitur utama yang dikerjakan secara kolaboratif oleh tim beranggotakan lima orang. Masing-masing fitur memiliki tanggung jawab spesifik namun terintegrasi satu sama lain untuk membentuk sistem yang komprehensif.

---

## Struktur Class

Struktur utama dari program ini terdiri dari lima fitur yang masing-masing memiliki kelas-kelas berikut:

### Fitur 1: Manajemen Kamar
- `Kamar`  
- `ManajemenKamar`  
- `BaseManajemen<T>`  
- `Filterable`, `IFilterable<Kamar>`  

### Fitur 2: Manajemen Penyewa
- `Penyewa`  
- `KontrakSewa`  
- `ManajemenPenyewa`  
- `PencarianPenyewa`  

### Fitur 3: Pembayaran
- `Pembayaran`  
- `ManajemenPembayaran`  
- Terhubung ke `Penyewa` dan `KontrakSewa`  

### Fitur 4: Laporan Keuangan
- `LaporanKeuangan`  
- `PencarianLaporan`  
- Menggunakan data dari `Pembayaran` dan `Penyewa`  
- Mendukung filter dan laporan bulanan/tahunan  

### Fitur 5: Pencarian & Filter
- `PencarianBase<T>`  
- `IFilterable<T>`  
- Interface `IIdentifiable`  
- Berperan sebagai dasar umum untuk fitur pencarian/filter pada fitur lain

---

## Cara Menjalankan Program

1. **Persiapan:**
   - Pastikan Java JDK 8 atau lebih tinggi telah terinstal di komputer Anda.
   - Pastikan file-file `.java` berada dalam struktur folder `src`.

2. **Kompilasi:**
   ```bash
   javac -d bin src/**/*.java

3. **Menjalankan Program**
    java -cp bin Main

### Navigasi Program:

Program menggunakan antarmuka CLI (Command Line Interface) berbasis menu.
Pengguna dapat memilih menu utama seperti:
- Manajemen Kamar
- Manajemen Penyewa
- Pembayaran
- Laporan Keuangan
- Pencarian & Filter
- Keluar

1. **Manajemen Kamar**
- Tambah Kamar: Menambahkan data kamar baru ke sistem.
- Tampilkan Semua Kamar: Melihat daftar semua kamar beserta informasi seperti jenis, harga, dan ketersediaan.
- Update Kamar: Mengubah informasi kamar tertentu.
- Hapus Kamar: Menghapus data kamar berdasarkan ID.
- Filter Kamar: Menyaring kamar berdasarkan jenis, harga, atau status ketersediaan.

2. **2. Manajemen Penyewa**
- Tambah Penyewa dan Kontrak: Menambahkan penyewa baru sekaligus membuat kontrak sewa.
- Lihat Daftar Penyewa: Menampilkan seluruh penyewa dan kamar yang disewa.
- Update Data Penyewa: Mengubah informasi penyewa.
- Hapus Penyewa: Menghapus data penyewa tertentu.
- Cari Penyewa: Mencari penyewa berdasarkan nama atau ID.

3. **Pembayaran**
- Catat Pembayaran: Mencatat pembayaran bulanan yang dilakukan penyewa.
- Lihat Riwayat Pembayaran: Melihat seluruh data pembayaran yang telah dicatat.
- Cek Status Pembayaran: Mengetahui penyewa mana yang belum membayar atau sudah lunas.

4. **Laporan Keuangan**
- Laporan Bulanan: Menampilkan total pemasukan bulanan dari seluruh penyewa.
- Laporan Tahunan: Menampilkan total pemasukan per tahun.
- Statistik Pembayaran: Grafik atau rekap jumlah pembayaran masuk berdasarkan waktu.
- Status Pembayaran per Penyewa: Ringkasan status pembayaran masing-masing penyewa.

5. **5. Pencarian & Filter**
- Cari Data Global: Melakukan pencarian data pada berbagai fitur (kamar, penyewa, pembayaran, dll).
- Filter Data Khusus: Menyaring data berdasarkan berbagai kriteria (misalnya kamar dengan harga < Rp1.000.000 dan status tersedia).
- Dukungan Interface: Menggunakan interface ISearchable, IIdentifiable, dan IFilterable untuk pemrosesan data.

### Pembagian Tugas Per-Anggota

Proyek ini dibuat sebagai bentuk penugasan Ujian Tengah Semester Mata Kuliah Pemrograman Berorientasi Objek yang diampu oleh Bapak Dr. Eng. Supri Bin Hj Amir, S.Si., M.Eng. 

Proyek ini bernama "Sistem Manajemen Kost" yang dibuat oleh Kelompok 1 Kelas A yang dimentori oleh Kak Muhammad Raihan. Anggota Kelompok 1 Kelas A beserta pembagian tugasnya adalah sebagai berikut:

1. **Anggota 1**
- Nama  : Muh. Anugrah Ashary Putra
- NIM   : H071241087
- Tugas : Mengerjakan Fitur 3

1. **Anggota 2**
- Nama  : Ivan Ramadhan
- NIM   : H071241085
- Tugas : Mengerjakan Fitur 5 dan membuat repository Github

1. **Anggota 3**
- Nama  : Shabrina Zahra Ramadhani
- NIM   : H071241045
- Tugas : Mengerjakan Fitur 1

1. **Anggota 4**
- Nama  : Mahesa Putri Lukman
- NIM   : H071241009
- Tugas : Mengerjakan Fitur 4 dan membuat README

5. **Anggota 5**
- Nama  : Kevin Anugrah Somakila'
- NIM   : H07124105
- Tugas : Mengerjakan Fitur 2