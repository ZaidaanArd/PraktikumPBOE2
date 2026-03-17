public abstract class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String NIP, String nama, String tglLahir, String TMT, int gajiPokok, String fakultas) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.fakultas = fakultas;

    }
}
