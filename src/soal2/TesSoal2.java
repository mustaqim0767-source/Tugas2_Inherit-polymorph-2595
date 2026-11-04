package soal2;

/**
 * Class pengujian dan demonstrasi polimorfisme Soal 2.
 * @author Mustaqim
 */
public class TesSoal2 {
    public static void main(String[] args) {
        System.out.println("=== BAGIAN A ===");
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();
        // h.panjat(); // Menyebabkan error kompilasi jika diaktifkan
        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");
        // Penanganan ClassCastException menggunakan instanceof
        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } else {
            System.out.println("Pemeriksaan aman: h2 bukan instance dari Kucing!");
        }

        System.out.println("\n=== BAGIAN B ===");
        new B();

        System.out.println("\n=== BAGIAN C ===");
        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();

        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}