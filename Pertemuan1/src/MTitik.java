/* Nama File : Titik.java 
   Deskripsi : bersifat atribut dan method dalam titik 
   Pembuat   : Muhammad Zaidaan Ardiyansyah
   Tanggal   : 19/02/2026
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
    }
}

class Titik {
    /****** ATRIBUT ******/
    double absis = 0;
    double ordinat = 0;

    /****** ATRIBUT ******/
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x;
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }
}
