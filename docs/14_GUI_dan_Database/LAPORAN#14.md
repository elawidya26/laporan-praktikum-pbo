# Laporan Praktikum # 14 - GUI dan Database 

## Kompetensi

1. Menggunakan paradigma berorientasi objek untuk interaksi dengan database 
2. Membuat backend dan frontend 
3. Membuat form sebagai frontend

## Ringkasan Materi

Tahapan yang akan dapat dilakukan untuk membuat databse dan gui. 
1. Membuat database dan tabel-tabelnya. 
2. Membuat backend yang berisi class-class yang mewakili data yang ada pada database, dan class helper untuk melakukan eksekusi query database. 
3. Membuat frontend yang merupakan antarmuka kepada pengguna. Frontend ini bisa berbasis teks (console), GUI, web, mobile, dan sebagainya. 

Library yang digunakan untuk project ini antara lain: 
1. JDBC, untuk melakukan interaksi ke database. 
2. ArrayList, untuk menampung data hasil query ke database. 
3. Swing, untuk membuat tampilan GUI. 
 
# Percobaan

## 3.1 Percobaan 1 

Membuat Database


![percobaan1](img/percobaan1a.PNG)
![percobaan1](img/percobaan1b.PNG)




## 3.2 Percobaan 2

Mempersiapkan project

![percobaan2](img/percobaan2a.PNG)

## 3.3 Percobaan 3 

Membuat class helper untuk mengeksekusi query SQL.

![percobaan3](img/percobaan3a.PNG)
![percobaan3](img/percobaan3b.PNG)
![percobaan3](img/percobaan3c.PNG)

link kode program : 
[DBHelper1841720126Ela](../../src/14_GUI_dan_Database/DBHelper1841720126Ela.java)



## 3.4 Percobaan 4 

Membuat class Kategori untuk menghandle CRUD pada tabel kategori.

![percobaan4](img/percobaan4a.PNG)
![percobaan4](img/percobaan4b.PNG)
![percobaan4](img/percobaan4c.PNG)
![percobaan4](img/percobaan4d.PNG)

link kode program : 
[Kategori1841720126Ela](../../src/14_GUI_dan_Database/Kategori1841720126Ela.java)



## 3.5 Percobaan 5

Mencoba backed yang sudah dibuat dengan mengoperasikannya lewat frontend berbasis teks (console).

![percobaan5](img/percobaan5a.PNG)

link kode program : 
[TestBackend1841720126Ela](../../src/14_GUI_dan_Database/TestBackend1841720126Ela.java)


## 3.6 Percobaan 6

percobaan ini akan membuat interface GUI untuk class Kategori.

![percobaan6](img/percobaan6a.PNG)
![percobaan6](img/percobaan6b.PNG)
![percobaan6](img/percobaan6c.PNG)
![percobaan6](img/percobaan6d.PNG)
![percobaan6](img/percobaan6e.PNG)
![percobaan6](img/percobaan6f.PNG)
![percobaan6](img/percobaan6g.PNG)

link kode program : 
[FrmKategori1841720126Ela](../../src/14_GUI_dan_Database/FrmKategori1841720126Ela.java)


## 3.6 Percobaan 6

Lakukan hal yang sama untuk data Anggota!  
1. Buat class Anggota pada package backend, lengkapi atribut dan method-nya.  
2. Lakukan test pada class TestBackend pada package frontend. 

![percobaan6](img/percobaan61.PNG)
![percobaan6](img/percobaan62.PNG)
![percobaan6](img/percobaan63.PNG)
![percobaan6](img/percobaan64.PNG)
![percobaan6](img/percobaan65.PNG)

link kode program : 
[Anggota1841720126Ela](../../src/14_GUI_dan_Database/Anggota1841720126Ela.java)


## 3.7 Percobaan 7 
Buat form untuk data Anggota. 
1. Buat FrmAnggota pada package frontend dan lengkapi komponen, method serta event-nya. 

![percobaan7](img/percobaan7a.PNG)
![percobaan7](img/percobaan7b.PNG)
![percobaan7](img/percobaan7c.PNG)
![percobaan7](img/percobaan7d.PNG)
![percobaan7](img/percobaan7e.PNG)
![percobaan7](img/percobaan7f.PNG)
 
 link kode program : 
[FrmAnggota1841720126Ela](../../src/14_GUI_dan_Database/FrmAnggota1841720126Ela.java)

## 3.7 Percobaan 7 
Untuk data Buku, caranya kurang lebih sama seperti data Kategori dan Anggota. Hanya saja yang berbeda adalah: 
a. Pemanggilan getKategori().getIdKategori() pada query insert dan update untuk mengeset idkategori pada tabel buku 
Kolom ke-0, utk mengeset txtIdKategori,  
kolom ke-1 utk mengeset txtNama,  
kolom ke-2 untuk mengeset txtKeterangan 
b. Query select yang melibatkan join table pada method getById(), getAll() dan search(). 
Kode lengkap class Buku dapat anda lihat di Lampiran 1. Untuk test buku pada frontend, bisa anda lihat di Lampiran 2.

![percobaan7](img/percobaan71.PNG)
![percobaan7](img/percobaan72.PNG)
![percobaan7](img/percobaan73.PNG)
![percobaan7](img/percobaan74.PNG)
![percobaan7](img/percobaan75.PNG)
![percobaan7](img/percobaan76.PNG)
![percobaan7](img/percobaan77.PNG)

 link kode program : 
[Buku1841720126Ela](../../src/14_GUI_dan_Database/Buku1841720126Ela.java)

## 3.8 Percobaan 8 
Membuat GUI untuk data Buku, yang dilengkapi dengan combo box untuk memilih kategori yang terhubung dengan tabel kategori. 

![percobaan8](img/percobaan8a.PNG)
![percobaan8](img/percobaan8b.PNG)
![percobaan8](img/percobaan8c.PNG)
![percobaan8](img/percobaan8d.PNG)
![percobaan8](img/percobaan8e.PNG)
![percobaan8](img/percobaan8f.PNG)
![percobaan8](img/percobaan8g.PNG)

 link kode program : 
[FrmBuku1841720126Ela](../../src/14_GUI_dan_Database/FrmBuku1841720126Ela.java)

## TUGAS 

1. Buatlah class Peminjaman. 
2. Buatlah form FrmPeminjaman.
3. Atur kode program agar dapat menangani transaksi peminjaman dan pengembalian. Note: Pada textbox ID Anggota, pengguna tinggal memasukkan ID anggota, kemudian menekan tombol Cari. Jika ketemu, maka label “Nama Anggota” yang ada di samping tombol Cari tersebut akan menampilkan nama anggota dari ID yang dimasukkan tadi. Begitu juga dengan ID Buku. 

- Membuat class Peminjaman1841720126Ela
 
![Tugas](img/tugas1a.PNG)
![Tugas](img/tugas1b.PNG)
![Tugas](img/tugas1c.PNG)
![Tugas](img/tugas1d.PNG)
![Tugas](img/tugas1e.PNG)
![Tugas](img/tugas1f.PNG)
![Tugas](img/tugas1g.PNG)
![Tugas](img/tugas1h.PNG)

 link kode program : 
[Peminjaman1841720126Ela](../../src/14_GUI_dan_Database/Peminjaman1841720126Ela.java)

- membuat tampilan GUI

![Tugas](img/tugas2a.PNG)
![Tugas](img/tugas2b.PNG)
![Tugas](img/tugas2c.PNG)
![Tugas](img/tugas2d.PNG)
![Tugas](img/tugas2e.PNG)
![Tugas](img/tugas2f.PNG)

link kode program : 
[FrmPeminjaman1841720126Ela](../../src/14_GUI_dan_Database/FrmPeminjaman1841720126Ela.java)


## Kesimpulan

Pada dalam pratikum ini kita dapat  Memahami cara membuat tampilan GUI dan membuat database. Pada pratikum ini dapat mengetahu cara menyambungkan ke database .


## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Ela Widya Lestari)***
