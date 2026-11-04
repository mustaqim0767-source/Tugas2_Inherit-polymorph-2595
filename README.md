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