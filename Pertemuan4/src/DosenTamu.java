
import java.time.LocalDate;

public class DosenTamu extends Dosen {
    /**************** ATRIBUT ******************/
    protected String NIDK;
    protected LocalDate tglBerakhirKontrak;
    protected static double tunjangan = 2.5;

    /**************** METHOD ******************/
    public DosenTamu(String NIP, String nama, String tglLahir, String TMT, int gajiPokok, String Fakultas, String NIDK,
            String tglBerakhirKontrak) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.tglBerakhirKontrak = LocalDate.parse(tglBerakhirKontrak);
    }

    public double getTunjangan() {
        return (tunjangan / 100) * gajiPokok;
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("NIDK: " + NIDK);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + getIdDateFormat(tglLahir));
        System.out.println("TMT: " + getIdDateFormat(TMT));
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + fakultas);
        System.out
                .println("Masa Kerja: " + getMasaKerja().getYears() + " tahun" + getMasaKerja().getMonths() + " bulan");
        System.out.println("Tanggal Berakhir Kontrak: " + getIdDateFormat(tglBerakhirKontrak));
        System.out.println("Gaji Pokok: " + getCurrencyIdFormat(gajiPokok));
        System.out
                .println(tunjangan + "% x " + getMasaKerja().getYears() + " x " + getCurrencyIdFormat(gajiPokok) + " = "
                        + getCurrencyIdFormat(getTunjangan()));
    }
}