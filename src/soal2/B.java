package soal2;

/**
 * Subclass B dari A untuk Soal 2 Bagian B.
 * @author Mustaqim
 */
public class B extends A {
    private int nilai = 5;

    public B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    @Override
    public void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}