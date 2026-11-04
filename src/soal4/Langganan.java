package soal4;

/**
 * Subclass Langganan dari ProdukDigital dengan perhitungan berbasis durasi bulan
 * dan diskon 20% untuk durasi minimal 12 bulan.
 * 
 * @author Mustaqim
 */
public class Langganan extends ProdukDigital {
    private static final double DISKON_LANGGANAN = 0.20;
    private static final int BATAS_DURASI_DISKON = 12;
    private int durasiBulan;

    public Langganan(String kode, String nama, double hargaDasar, double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        if (durasiBulan <= 0) {
            throw new IllegalArgumentException("Durasi langganan harus minimal 1 bulan!");
        }
        this.durasiBulan = durasiBulan;
    }

    public int getDurasiBulan() { return durasiBulan; }

    @Override
    public double hitungHargaAkhir() {
        double totalHarga = hargaDasar * durasiBulan;
        if (durasiBulan >= BATAS_DURASI_DISKON) {
            totalHarga -= (totalHarga * DISKON_LANGGANAN);
        }
        return totalHarga;
    }

    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}