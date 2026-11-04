package soal4;

/**
 * Superclass Produk yang merepresentasikan produk umum di toko digital.
 * 
 * @author Mustaqim
 */
public class Produk {
    private String kode;
    private String nama;
    protected double hargaDasar;

    /**
     * Constructor utama Produk dengan validasi data.
     * 
     * @param kode kode unik produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @throws IllegalArgumentException jika harga dasar negatif atau nama/kode kosong
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode produk tidak boleh kosong!");
        }
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong!");
        }
        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif!");
        }
        this.kode = kode.trim();
        this.nama = nama.trim();
        this.hargaDasar = hargaDasar;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public double getHargaDasar() { return hargaDasar; }

    /**
     * Menghitung harga akhir produk (default: harga dasar).
     * 
     * @return harga akhir produk
     */
    public double hitungHargaAkhir() {
        return hargaDasar;
    }

    /**
     * Mengembalikan rincian deskripsi spesifik produk.
     * 
     * @return deskripsi produk
     */
    public String deskripsi() {
        return "produk umum";
    }
}