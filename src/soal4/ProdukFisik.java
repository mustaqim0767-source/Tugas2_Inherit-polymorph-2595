package soal4;

/**
 * Subclass ProdukFisik yang menambahkan ongkos kirim berdasarkan berat barang.
 * 
 * @author Mustaqim
 */
public class ProdukFisik extends Produk {
    private static final double ONGKOS_KIRIM_PER_KG = 10000.0;
    private double beratKg;

    public ProdukFisik(String kode, String nama, double hargaDasar, double beratKg) {
        super(kode, nama, hargaDasar);
        if (beratKg < 0) {
            throw new IllegalArgumentException("Berat produk tidak boleh negatif!");
        }
        this.beratKg = beratKg;
    }

    public double getBeratKg() { return beratKg; }

    @Override
    public double hitungHargaAkhir() {
        return hargaDasar + (beratKg * ONGKOS_KIRIM_PER_KG);
    }

    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }
}