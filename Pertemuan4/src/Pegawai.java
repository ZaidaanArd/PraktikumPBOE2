
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Locale;

public abstract class Pegawai {

    /**************** ATRIBUT ******************/
    protected String NIP;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    /**************** METHOD ******************/
    public Pegawai() {

    }

    public Pegawai(String NIP, String nama, String tglLahir, String TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = LocalDate.parse(tglLahir);
        this.TMT = LocalDate.parse(TMT);
        this.gajiPokok = gajiPokok;
    }

    public Period getMasaKerja() {
        return Period.between(TMT, LocalDate.now());
    }

    public String getIdDateFormat(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id", "ID")));
    }

    public LocalDate getTanggalPensiun(int BUP) {
        return tglLahir.plusYears(BUP).plusMonths(BUP).plusDays(BUP);
    }

    public String getCurrencyIdFormat(double number) {
        Currency idr = Currency.getInstance("IDR");
        Locale loc = new Locale("id", "ID");
        NumberFormat idrFormatter = NumberFormat.getCurrencyInstance(loc);
        idrFormatter.setCurrency(idr);
        return idrFormatter.format(number);
    }

    public abstract double getTunjangan();

    public abstract void printInfo();

}
