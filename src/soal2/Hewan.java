package soal2;

/**
 * Superclass Hewan untuk Soal 2 Bagian A.
 * @author Mustaqim
 */
public class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    public void suara() {
        System.out.println("...");
    }

    public void makan() {
        System.out.println(nama + " makan");
        suara();
    }
}