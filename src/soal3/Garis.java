package soal3;

/**
 * Class Garis yang merepresentasikan segmen garis antara dua Titik (Composition).
 * Memakai defensive copy untuk mencegah side-effect aliasing.
 * 
 * @author Mustaqim
 */
public class Garis {
    private Titik awal;
    private Titik akhir;

    /**
     * Constructor utama dengan Defensive Copy.
     * 
     * @param awal titik awal garis
     * @param akhir titik akhir garis
     */
    public Garis(Titik awal, Titik akhir) {
        // Defensive Copy: membuat objek baru dari nilai titik luar
        this.awal = new Titik(awal.getX(), awal.getY());
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Constructor overloading 4 koordinat yang memanggil constructor utama.
     * 
     * @param x1 koordinat x titik awal
     * @param y1 koordinat y titik awal
     * @param x2 koordinat x titik akhir
     * @param y2 koordinat y titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    public Titik getAwal() {
        return new Titik(awal.getX(), awal.getY());
    }

    public void setAwal(Titik awal) {
        this.awal = new Titik(awal.getX(), awal.getY());
    }

    public Titik getAkhir() {
        return new Titik(akhir.getX(), akhir.getY());
    }

    public void setAkhir(Titik akhir) {
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Menghitung panjang garis dengan memanggil jarakKe milik Titik.
     * 
     * @return panjang segmen garis
     */
    public double getPanjang() {
        return awal.jarakKe(akhir);
    }

    @Override
    public String toString() {
        return awal + "-" + akhir;
    }
}