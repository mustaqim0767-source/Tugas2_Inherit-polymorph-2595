# Tugas 2 - Inheritance, Composition, dan Polimorfisme

## Identitas
- **Nama Tugas:** Tugas 2 Praktikum Pemrograman Berorientasi Objek
- **Nama Lengkap:** Mustaqim
- **NPM:** 250810701100095
- **Kelas Praktikum:** A
- **Repository:** https://github.com/mustaqim0767-source/Tugas2_Inherit-polymorph-250810701100095

## Jawaban Pertanyaan Tambahan Soal 1
**Pesan Error:** `harga has private access in soal1.Perangkat`  
**Penjelasan:** Atribut dengan akses `private` hanya dapat diakses langsung di kelas pemiliknya (`Perangkat`). Ketika subclass `Laptop` mengaksesnya di method `hitungHargaPromo()`, Java menolaknya. Agar subclass bisa mengakses atribut tersebut secara langsung, hak akses atribut harus diganti menjadi `protected`.

## Jawaban Soal 2: Analisis Output, Error, dan Polimorfisme

### Bagian A
1. **Output Program (sebelum error runtime):**
   ```text
   Hewan dibuat: Tom
   Kucing dibuat
   Tom makan
   meong
   meong
   Tom memanjat
   Hewan dibuat: Generik

## Jawaban Soal 3: Composition (has-a) dan Aliasing

1. **Prediksi dan Output Baris Kedua Sebelum Perbaikan (Tanpa Defensive Copy):**
   - **Tercetak:** `(100.0, 1.0)-(5.0, 5.0)`
   - **Alasan:** Terjadi *aliasing*. Konstruktor `Garis` menyimpan referensi memori langsung dari variabel `t` luar (`this.awal = awal`), sehingga saat `t.setX(100)` dipanggil, data titik awal di dalam `g2` ikut berubah secara tidak sengaja.

2. **Output Baris Kedua Setelah Perbaikan (Dengan Defensive Copy):**
   - **Tercetak:** `(1.0, 1.0)-(5.0, 5.0)`
   - **Alasan:** Konstruktor `Garis` membuat instans `Titik` baru (`new Titik(awal.getX(), awal.getY())`). Objek `t` di luar tidak lagi berbagi alamat memori dengan atribut di dalam `g2`.

3. **Kapan Menggunakan Sebelum vs Sesudah Perbaikan:**
   - **Sebelum Perbaikan (Shared Reference):** Tepat digunakan ketika kita memang memerlukan beberapa objek berbagi simpul (*node*) yang sama secara terpusat (contoh: graf terhubung, jaring-jaring geometri 3D di mana jika satu titik vertex digeser, seluruh garis ikatan ikut menyesuaikan).
   - **Sesudah Perbaikan (Defensive Copy):** Tepat digunakan pada enkapsulasi ketat di mana objek `Garis` harus bersifat mandiri dan tidak boleh terpengaruh oleh efek samping perubahan variabel di luar kelas.

4. **Masalah Desain Jika `Garis extends Titik` (Inheritance):**
   - **Melanggar Relasi *is-a*:** Garis **bukanlah** sebuah Titik (*Garis is NOT a Titik*). Garis **memiliki** dua Titik (*Garis HAS-A Titik*).
   - **Kerusakan Abstraksi:** Jika `Garis extends Titik`, maka `Garis` akan mewarisi atribut `x` dan `y` yang tidak relevan untuk sebuah garis utuh. Method seperti `setX()` pada `Garis` menjadi tidak jelas apakah mengubah titik awal atau titik akhir.