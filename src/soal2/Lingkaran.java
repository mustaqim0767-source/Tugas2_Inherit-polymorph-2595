package soal2;

/**
 * Class Lingkaran untuk Soal 2 Bagian C.
 * @author Mustaqim
 */
public class Lingkaran {
    protected double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}