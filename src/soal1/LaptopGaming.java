package soal1;

/**
 * Subclass LaptopGaming dari Laptop.
 * @author Mustaqim
 */
public class LaptopGaming extends Laptop {
    private static final int GARANSI_TAMBAHAN_BULAN = 6;
    private String kartuGrafis;

    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis) {
        super(merek, harga, garansiBulan + GARANSI_TAMBAHAN_BULAN, ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + kartuGrafis;
    }
}