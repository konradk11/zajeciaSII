package dzień_2;

class Pracownik {

    String imie, nazwisko, miasto;
    int wiek;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void pobierzDane() {
        System.out.println(getImie() + getNazwisko() + getWiek() + getMiasto());
    }

    public String getMiasto() {
        return miasto;
    }
}

public class Firma {

    public static void main(String[] args) {


        Pracownik janusz = new Pracownik();

        janusz.imie = "Janusz ";
        janusz.nazwisko = "Wąsik ";
        janusz.wiek = 54;
        janusz.miasto = " Szczecin";
        // System.out.println(janusz.getImie() + janusz.getNazwisko() + janusz.getWiek() + " lar");
        janusz.pobierzDane();


        Pracownik bogdan = new Pracownik();

        bogdan.imie = "Bogdan ";
        bogdan.nazwisko = "Dąb ";
        bogdan.wiek = 55;
        bogdan.miasto = " lubartów";
        System.out.println(bogdan.getImie() + bogdan.getNazwisko() + bogdan.getWiek() + bogdan.getMiasto() + " -stare");
        bogdan.pobierzDane();
    }
}
