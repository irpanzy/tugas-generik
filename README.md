# Sistem Manajemen Inventaris Alat Tulis Kantor

Proyek ini adalah implementasi **Sistem Manajemen Inventaris** sederhana menggunakan **Generics** di Java. Sistem ini dapat menyimpan berbagai jenis alat tulis kantor (misalnya: pena, kertas) dalam container yang aman, dengan memanfaatkan kelas generik. Hanya alat tulis kantor yang diizinkan untuk disimpan dalam sistem ini.

## Deskripsi

Sistem ini dirancang untuk mengelola inventaris alat tulis kantor dengan menggunakan konsep pemrograman generik di Java. Kelas generik memungkinkan program untuk menangani berbagai tipe alat tulis kantor tanpa perlu membuat kelas yang berbeda untuk setiap jenis alat tulis.

### Fitur

- Menambahkan item alat tulis kantor (misalnya: pena, kertas) ke dalam inventaris.
- Menghapus item dari inventaris.
- Menampilkan daftar item yang ada di dalam inventaris.

### Penjelasan File:

1. **`OfficeSupply.java`**: Kelas dasar untuk semua jenis alat tulis kantor yang memiliki atribut umum seperti nama dan harga.
2. **`Pen.java`**: Kelas yang mewarisi `OfficeSupply` untuk mewakili jenis alat tulis pena.
3. **`Paper.java`**: Kelas yang mewarisi `OfficeSupply` untuk mewakili jenis alat tulis kertas.
4. **`Inventory.java`**: Kelas generik yang digunakan untuk menyimpan dan mengelola alat tulis kantor dalam inventaris.
5. **`Main.java`**: Kelas utama yang berfungsi untuk menjalankan program dan menguji fungsionalitas sistem manajemen inventaris.

## Cara Menjalankan

Untuk menjalankan proyek ini, ikuti langkah-langkah berikut:

### 1. Persiapkan Lingkungan Pengembangan

Pastikan Anda telah menginstal **Java Development Kit (JDK)**. Anda dapat mengunduhnya dari [situs resmi Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### 2. Instalasi di VSCode

- Install ekstensi **Java Extension Pack** di **VSCode** untuk membantu Anda menulis, mengompilasi, dan menjalankan kode Java.

### 3. Menjalankan Program

1. **Buat Folder Proyek**: Buat folder dengan nama `InventorySystem` dan tempatkan file Java berikut di dalamnya: `OfficeSupply.java`, `Pen.java`, `Paper.java`, `Inventory.java`, dan `Main.java`.
2. **Buka VSCode**: Buka folder `InventorySystem` di **VSCode**.
3. **Kompilasi dan Jalankan Program**:
   - Buka terminal di VSCode.
   - Kompilasi seluruh file Java dengan perintah:
     ```
     javac *.java
     ```
   - Jalankan program dengan perintah:
     ```
     java Main
     ```

## Teknologi yang Digunakan

- **Java**: Bahasa pemrograman untuk mengembangkan sistem.
- **Generics**: Fitur dalam Java untuk membuat kelas dan metode yang dapat beroperasi pada berbagai tipe data dengan tipe yang aman.

## Kontribusi

Jika Anda ingin berkontribusi dalam proyek ini, Anda dapat mengajukan **Pull Request (PR)** dengan perubahan atau penambahan fitur.

## Lisensi

Proyek ini dilisensikan di bawah [MIT License](https://opensource.org/licenses/MIT).
