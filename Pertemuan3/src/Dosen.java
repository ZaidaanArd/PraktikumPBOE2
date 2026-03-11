public class Dosen {
    /**************** ATRIBUT ******************/
    private String nama;
    private String NIP;
    private String jurusan;

    /**************** METHOD ******************/
    public Dosen() {
        this.nama = "Nama Dosen";
        this.NIP = "NIP Dosen";
        this.jurusan = "Jurusan Dosen";
    }

    public Dosen(String nama, String NIP, String jurusan) {
        this.nama = nama;
        this.NIP = NIP;
        this.jurusan = jurusan;
    }

    // setter dan getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
