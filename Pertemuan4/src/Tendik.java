public class Tendik extends Pegawai {
    /**************** ATRIBUT ******************/
    private enum typeBidang {
        Akademik, Kemahasiswaan, SumberDaya;
    }

    private typeBidang bidang;
    protected static int BUP = 55;
    protected static double tunjangan = 1;

    /**************** METHOD ******************/
    public Tendik(String NIP, String nama, String tglLahir, String TMT, int gajiPokok, typeBidang bidang) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public double getTunjangan() {
        return (tunjangan / 100) * getMasaKerja().getYears();
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Bidang: " + bidang);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + getIdDateFormat(tglLahir));
        System.out.println("TMT: " + getIdDateFormat(TMT));
        System.out.println("Jabatan: Tenaga Kependidikan");
        System.out
                .println("Masa Kerja: " + getMasaKerja().getYears() + " tahun" + getMasaKerja().getMonths() + " bulan");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiun(BUP));
        System.out.println("Gaji Pokok: " + getCurrencyIdFormat(gajiPokok));
        System.out.println("Tunjangan: " + tunjangan + "% x " + getMasaKerja().getYears() + " x "
                + getCurrencyIdFormat(gajiPokok) + " = "
                + getCurrencyIdFormat(getTunjangan()));
    }
}
