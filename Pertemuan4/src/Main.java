public class Main {
    public static void main(String[] args) {
        // Demo Persegi
        Persegi p = new Persegi(5, "Merah", "Hitam");
        System.out.println("\n--- PERSEGI ---");
        p.printInfo();
        System.out.println("Diagonal: " + p.getDiagonal());

        // Demo Lingkaran
        Lingkaran l = new Lingkaran(10, "Biru", "Putih");
        System.out.println("\n--- LINGKARAN ---");
        l.printInfo();

        // Counter
        System.out.println("\n========================================");
        BangunDatar.printCounterBangunDatar();
        System.out.println("========================================");

        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi",
                "1990-05-05", "2015-01-01", 5000000, "Sains dan Matematika",
                "78647324");

        dosenTetap.printInfo();
    }
}