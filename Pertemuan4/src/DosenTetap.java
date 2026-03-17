
public class DosenTetap extends Dosen {
    /**************** ATRIBUT ******************/
    protected String NIDN;
    protected static int BUP = 65;
    protected static double tunjangan = 2;

    /**************** METHOD ******************/
    public DosenTetap(String NIP, String nama, String tglLahir, String TMT, int gajiPokok, String fakultas,
            String NIDN) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public double getTunjangan() {
        return (tunjangan / 100) * getMasaKerja().getYears() * gajiPokok;
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("NIDN: " + NIDN);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + getIdDateFormat(tglLahir));
        System.out.println("TMT: " + getIdDateFormat(TMT));
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + fakultas);
        System.out
                .println("Masa Kerja: " + getMasaKerja().getYears() + " tahun" + getMasaKerja().getMonths() + " bulan");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiun(BUP));
        System.out.println("Gaji Pokok: " + getCurrencyIdFormat(gajiPokok));
        System.out
                .println(tunjangan + "% x " + getMasaKerja().getYears() + " x " + getCurrencyIdFormat(gajiPokok) + " = "
                        + getCurrencyIdFormat(getTunjangan()));
    }

}
