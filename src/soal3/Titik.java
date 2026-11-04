package soal3;

/**
 * Class Titik yang merepresentasikan koordinat 2D (x, y).
 * 
 * @author Mustaqim
 */
public class Titik {
    private double x;
    private double y;

    /**
     * Constructor default (titik 0,0).
     */
    public Titik() {
        this(0.0, 0.0);
    }

    /**
     * Constructor dengan koordinat spesifik (x, y).
     * 
     * @param x koordinat x
     * @param y koordinat y
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    /**
     * Menghitung jarak Euclidean ke titik lain.
     * 
     * @param lain titik tujuan
     * @return jarak antar dua titik
     */
    public double jarakKe(Titik lain) {
        double dx = this.x - lain.x;
        double dy = this.y - lain.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}