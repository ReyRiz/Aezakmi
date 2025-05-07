**Tugas Proyek Mahasiswa: Sistem Distribusi Produk**

Buatlah sebuah program Java berbasis **Object-Oriented Programming (OOP)** dengan tema **Distribusi Produk**. Program ini harus memiliki fitur utama untuk mengelola distribusi produk oleh produsen dan laporan distribusi yang dapat diakses oleh admin. Berikut adalah ketentuan tugasnya:

### **Ketentuan Tugas**
1. **Struktur Program**:
   - Buat minimal **4 kelas** yang saling berhubungan, yaitu:
     - `Main` untuk menjalankan program.
     - `User` untuk mengelola data pengguna.
     - `Role` sebagai kelas abstrak untuk peran pengguna (`Admin` dan `Produsen`).
     - `Produk` untuk mengelola data produk.
     - Tambahkan kelas tambahan jika diperlukan (contoh: `Distribusi` untuk mencatat distribusi produk).
   - Gunakan konsep **inheritance** untuk membuat peran pengguna (`Admin` dan `Produsen`) sebagai turunan dari kelas `Role`.
   - Implementasikan **polimorfisme** melalui metode yang di-override.

2. **Fitur Utama**:
   - **Sistem Login dan Register**:
     - Pengguna dapat login atau mendaftar sebagai **Admin** atau **Produsen**.
   - **Fitur Produsen**:
     - Produsen dapat menambah, melihat, mengedit, dan menghapus produk.
   - **Fitur Admin**:
     - Admin dapat mencatat distribusi produk (nama produk, tujuan, biaya).
     - Admin dapat melihat laporan distribusi.
   - Gunakan **ArrayList** untuk menyimpan data produk dan laporan distribusi.

3. **Input dan Output**:
   - Gunakan input dari pengguna melalui `Scanner`.
   - Tampilkan menu interaktif untuk navigasi fitur.

4. **Prinsip OOP**:
   - Gunakan **enkapsulasi** untuk melindungi data.
   - Terapkan **inheritance** dan **polimorfisme** sesuai kebutuhan.

5. **Bonus**:
   - Tambahkan validasi input untuk memastikan data yang dimasukkan benar.
   - Tambahkan fitur pencarian produk atau laporan distribusi.

### **Output yang Diharapkan**
- Program dapat dijalankan dengan menu interaktif.
- File Java yang berisi implementasi program.
- Penjelasan singkat tentang bagaimana prinsip OOP diterapkan dalam program Anda.

**Contoh Menu Program (Belum Selesai)**:
```
=== SISTEM LOGIN ===
1. Login
2. Register
3. Keluar
Pilih: 1

-- MENU ADMIN --
1. Distribusi Produk
2. Lihat Laporan Distribusi
3. Kembali
Pilih: 1

Masukkan nama produk: Produk A
Tujuan Distribusi: Jakarta
Biaya Distribusi: 50000
Distribusi berhasil dicatat.
```
