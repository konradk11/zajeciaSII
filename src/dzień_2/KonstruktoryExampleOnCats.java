package dzień_2;

class Kot {
    int lapy;
    String kolor, rasa;
    boolean czyLadny, czyZywy;
    double predkosc;

    Kot(double predkoscKota, int lapyKota, String kolorKota, String rasaKota, boolean czyZywyKota, boolean czyLadnyKota) {
        predkosc = predkoscKota;
        lapy = lapyKota;
        kolor = kolorKota;
        rasa = rasaKota;
        czyZywy = czyZywyKota;
        czyLadny = czyLadnyKota;

    }

    Kot(){}

}

public class KonstruktoryExampleOnCats {
    public static void main(String[] args) {

        Kot klakier = new Kot();
        klakier.lapy=4;
        Kot filemon = new Kot(12.2222, 4, "bialy", "dachowy", false, false);

        System.out.println(klakier.lapy);
        System.out.println(filemon.lapy+filemon.kolor);
    }

}
