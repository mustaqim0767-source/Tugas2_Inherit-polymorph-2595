package soal2;

/**
 * Subclass Kucing dari Hewan untuk Soal 2 Bagian A.
 * @author Mustaqim
 */
public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    @Override
    public void suara() {
        System.out.println("meong");
    }

    public void panjat() {
        System.out.println(nama + " memanjat");
    }
}