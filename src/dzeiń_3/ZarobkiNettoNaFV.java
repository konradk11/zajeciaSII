package dzeiń_3;

public class ZarobkiNettoNaFV {

    final double taxRate = 1.23;
    final double incomeTaxRate = 1.18;
    double incomeBrutto;
    double zus;
    double skladki;
    double ksiegowosc;
    Kalkulator kalkulator = new Kalkulator();
    private double zarobkiNetto;
    private double zarobkiNettoBezZus;


    public double getIcomeOnHand(double incomeBrutto, double zus) {

        zarobkiNetto = getZarobkiNetto(incomeBrutto);
        zarobkiNettoBezZus = getZarobkiBezZus(zarobkiNetto, zus);
        return getZarobkiPoPodatkuPit();

    }

    private double getZarobkiPoPodatkuPit() {
        return kalkulator.oblicz(zarobkiNettoBezZus, incomeTaxRate, "/");
    }

    private double getZarobkiBezZus(double zarobkiNetto, double zus) {
        return kalkulator.oblicz(zarobkiNetto, zus, "-");
    }

    private double getZarobkiNetto(double incomeBrutto) {
        return kalkulator.oblicz(incomeBrutto, taxRate, "/");

    }

}
