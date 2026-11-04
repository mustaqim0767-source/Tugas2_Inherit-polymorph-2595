package soal4;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Keranjang yang menyimpan dan mengelola daftar Produk (Composition).
 * 
 * @author Mustaqim
 */
public class Keranjang {
    private List<Produk> daftarProduk;

    public Keranjang() {
        this.daftarProduk = new ArrayList<>();
    }

    /**
     * Menambahkan produk ke keranjang.
     * 
     * @param p produk yang akan ditambahkan
     * @throws IllegalStateException jika kode produk sudah ada di keranjang
     */
    public void tambah(Produk p) {
        for (Produk item : daftarProduk) {
            if (item.getKode().equalsIgnoreCase(p.getKode())) {
                throw new IllegalStateException("Kode produk " + p.getKode() + " sudah ada di keranjang!");
            }
        }
        daftarProduk.add(p);
    }

    /**
     * Menghitung total harga akhir seluruh produk menggunakan polimorfisme (tanpa instanceof).
     * 
     * @return total harga akhir
     */
    public double hitungTotal() {
        double total = 0;
        for (Produk item : daftarProduk) {
            total += item.hitungHargaAkhir();
        }
        return total;
    }

    /**
     * Mencetak struk belanjaan menggunakan polimorfisme (tanpa instanceof).
     */
    public void cetakStruk() {
        for (Produk item : daftarProduk) {
            System.out.printf("%s | %s | %s | Rp%.0f%n",
                    item.getKode(), item.getNama(), item.deskripsi(), item.hitungHargaAkhir());
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Menghitung jumlah item per jenis menggunakan instanceof dan downcasting yang aman.
     */
    public void hitungPerJenis() {
        int fisik = 0;
        int digital = 0;
        int langganan = 0;

        for (Produk item : daftarProduk) {
            if (item instanceof Langganan) {
                langganan++;
            } else if (item instanceof ProdukDigital) {
                digital++;
            } else if (item instanceof ProdukFisik) {
                fisik++;
            }
        }

        System.out.println("Fisik: " + fisik + ", Digital: " + digital + ", Langganan: " + langganan);
    }
}