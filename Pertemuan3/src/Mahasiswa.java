import java.util.ArrayList;

public class Mahasiswa {
    private String nim, nama, prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa() {
        this("", "", "");
    }

    public String getNIM() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setNIM(String newNIM) {
        this.nim = newNIM;
    }

    public void setNama(String newNama) {
        this.nama = newNama;
    }

    public void setProdi(String newProdi) {
        this.prodi = newProdi;
    }

    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS() {
        int i;
        int jumlahSks = 0;
        for (i = 0; i < listMatkul.size(); i++) {
            jumlahSks += listMatkul.get(i).getSks();
        }

        return jumlahSks;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    public void setDosenWali(Dosen newDosenWali) {
        this.dosenWali = newDosenWali;
    }

    public void setKendaraan(Kendaraan newKendaraan) {
        this.kendaraan = newKendaraan;
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Nama Dosen Wali: " + dosenWali.getNama());

        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println("Nama Mata Kuliah ke-" + (i + 1) + ": " + listMatkul.get(i).toString());
        }

        System.out.println("No Plat: " + kendaraan.getNoPlat());
    }
}