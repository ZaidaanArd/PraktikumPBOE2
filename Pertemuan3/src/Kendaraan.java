public class Kendaraan {
    /**************** ATRIBUT ******************/
    private String noPlat, jenis;

    /**************** METHOD ******************/

    // Konstruktor
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;

        if (jenis == "Mobil" || jenis == "Motor" || jenis == "") {
            this.jenis = jenis;
        }
    }

    public Kendaraan() {
        this("", "");
    }

    // getter
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    // setter
    public void setNoPlat(String newNoPlat) {
        this.noPlat = newNoPlat;
    }

    public void setJenis(String newJenis) {
        if (newJenis == "Mobil" || newJenis == "Motor") {
            this.jenis = newJenis;
        }
    }
}