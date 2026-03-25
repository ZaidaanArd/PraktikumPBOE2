import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int CounterPNS = 0;

    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        CounterPNS++;
    }

    public PNS(String nama, String tanggal, double pendapatan, String nip) {
        this(nama, tanggal, "Alamat belum diatur", pendapatan, nip);
    }

    public String getNIP() {
        return nip;
    }

    public static int getCounterPNS() {
        return CounterPNS;
    }

    public void setNIP(String Nip) {
        this.nip = Nip;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 3;
    }

    @Override
    public double hitungPajak() {
        return pendapatan * 0.05;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("jumlah PNS: " + CounterPNS);
    }
}
