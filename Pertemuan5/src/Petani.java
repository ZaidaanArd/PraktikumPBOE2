import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Jumlah Petani: " + counterPetani);
    }

    @Override
    public double hitungPajak() {
        return (10 / 100.0) * pendapatan;
    }
}
