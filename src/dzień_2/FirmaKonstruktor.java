package dzień_2;

class PracownikKonstruktor {

    String imie, nazwisko, miasto;
    int wiek;

    PracownikKonstruktor(String imie, String nazwisko, String miasto, int wiek) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.wiek = wiek;
    }

    PracownikKonstruktor() {
    }

}

public class FirmaKonstruktor {

    public static void main(String[] args) {


        PracownikKonstruktor janusz = new PracownikKonstruktor("Janusz ", "Nowak ", "Lubań ", 33);

        System.out.println(janusz.imie + janusz.nazwisko);
//


//        PracownikKonstruktor bogdan = new PracownikKonstruktor();
//
//        bogdan.imie = "Bogdan ";
//        bogdan.nazwisko = "Dąb ";
//        bogdan.wiek = 55;
//        bogdan.miasto = " lubartów";
//        System.out.println(bogdan.getImie() + bogdan.getNazwisko() + bogdan.getWiek() + bogdan.getMiasto() + " -stare");
//        bogdan.pobierzDane();
    }
}
