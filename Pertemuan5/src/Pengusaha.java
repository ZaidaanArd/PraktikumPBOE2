import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int CounterPengusaha = 0;

    public Pengusaha(String nama, String tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        CounterPengusaha++;
    }

    public String getNPWP() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return CounterPengusaha;
    }

    public void setNPWP(String newNPWP) {
        this.npwp = newNPWP;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 1;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Jumlah Pengusaha: " + CounterPengusaha);
    }

    @Override
    public double hitungPajak() {
        return (15 / 100.0) * pendapatan;
    }

}
