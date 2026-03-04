/* Nama File        :   Titik.java
 * Deskripsi        :   berisi atribut dan method dalam class Titik
 * Pembuat          :   Muhamad Kemal Faza - 24060124120013
 * Tanggal          :   19/02/2026
 */

public class Titik {
    /**************** ATRIBUT ******************/
    private double absis;
    private double ordinat;
    static int counterTitik = 0;

    /**************** METHOD ******************/

    // Konstruktor untuk membuat titik (0,0)
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik() {
        this(0, 0);
        counterTitik++;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    public void printCounterTitik() {
        // System.out.println(this.counterTitik);
        System.out.println(counterTitik);
    }

    // mengembalikan nilai kuadran titik
    public int getKuadran() {
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1;
        } else if (getAbsis() < 0 && getOrdinat() > 0) {
            return 2;
        } else if (getAbsis() < 0 && getOrdinat() > 0) {
            return 3;
        } else if (getAbsis() > 0 && getOrdinat() < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // mengembalikan jarak titik dari titik pusat
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(getAbsis(), 2) + Math.pow(getOrdinat(), 2));
    }

    // mengembalikan jarak titik dari titik lainnya
    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(this.getAbsis() - T.getAbsis(), 2) + Math.pow(this.getOrdinat() - T.getOrdinat(), 2));
    }

    // mengubah titik menjadi titik refleksi terhadap sumbu X
    public void refleksiX() {
        setOrdinat(getOrdinat() * -1);
    }

    // mengubah titik menjadi titik refleksi terhadap sumbu Y
    public void refleksiY() {
        setAbsis(getAbsis() * -1);
    }

    // mengembalikan titik hasil refleksi terhadap sumbu X
    public Titik getRekfleksiX() {
        Titik THasil = new Titik(getAbsis(), getOrdinat());
        refleksiX();
        return THasil;
    }

    // mengembalikan titik hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
        Titik THasil = new Titik(getAbsis(), getOrdinat());
        refleksiY();
        return THasil;
    }

}
// end class Titik