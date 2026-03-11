public class MataKuliah {
    /**************** ATRIBUT ******************/
    private String idMatkul;
    private String nama;
    private int sks;

    /**************** METHOD ******************/
    public MataKuliah() {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // getter
    public String getIdMatkul() {
        return idMatkul;
    }

    public String getNamaMatkul() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    // setter
    public void setIdMatkul(String newIdMatkul) {
        this.idMatkul = newIdMatkul;
    }

    public void setNamaMatkul(String newNama) {
        this.nama = newNama;
    }

    public void setSks(int newSks) {
        this.sks = newSks;
    }
}
