package soal4;

/**
 * Subclass ProdukDigital yang memberikan diskon digital 10%.
 * 
 * @author Mustaqim
 */
public class ProdukDigital extends Produk {
    protected static final double DISKON_DIGITAL = 0.10;
    private double ukuranMb;

    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        if (ukuranMb < 0) {
            throw new IllegalArgumentException("Ukuran berkas tidak boleh negatif!");
        }
        this.ukuranMb = ukuranMb;
    }

    public double getUkuranMb() { return ukuranMb; }

    @Override
    public double hitungHargaAkhir() {
        return hargaDasar - (hargaDasar * DISKON_DIGITAL);
    }

    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}