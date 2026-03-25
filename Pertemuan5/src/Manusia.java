import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Manusia {
    /**************** ATRIBUT ******************/
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int CounterMns = 0;

    // Formatter untuk membaca input tanggal "dd-MM-yyyy"
    protected DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    /**************** METHOD ******************/
    public Manusia() {
        CounterMns++;
    }

    public Manusia(String nama, String tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        // PERBAIKAN: Masukkan inputFormatter di sini agar Java tahu formatnya
        this.tglMulaiKerja = LocalDate.parse(tglMulaiKerja, inputFormatter);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        CounterMns++;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return CounterMns;
    }

    public void setNama(String newNama) {
        this.nama = newNama;
    }

    public void setTglMulaiKerja(LocalDate newTglMulaiKerja) {
        this.tglMulaiKerja = newTglMulaiKerja;
    }

    public void setAlamat(String newAlamat) {
        this.alamat = newAlamat;
    }

    public void setPendapatan(double newPendapatan) {
        this.pendapatan = newPendapatan;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id", "ID"));
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja.format(formatter));
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Jumlah Objek Manusia: " + CounterMns);
    }

    public abstract int hitungMasaKerja();

}